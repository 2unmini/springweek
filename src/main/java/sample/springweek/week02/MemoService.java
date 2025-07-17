package sample.springweek.week02;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemoService {
    private final MemoRepository memoRepository;

    public List<MemoResponse> getMemoByKeyword(String keyword) {

        List<Memo> findMemoList = memoRepository.findByContentContainingOrderByModifiedAt(keyword);
        return findMemoList.stream().map(MemoResponse::from).toList();

    }
}
