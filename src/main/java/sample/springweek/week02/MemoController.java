package sample.springweek.week02;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/memo/contents")
public class MemoController {

    private final MemoService memoService;

    @GetMapping
    public ResponseEntity<List<MemoResponse>> getMemosByKeyword(@RequestParam String keyword) {
        return ResponseEntity.ok(memoService.getMemoByKeyword(keyword));
    }
}
