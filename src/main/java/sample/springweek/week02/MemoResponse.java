package sample.springweek.week02;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class MemoResponse {

    private Long id;

    private String content;

    private LocalDateTime modifiedAt;

    public static MemoResponse from(Memo memo) {
        return new MemoResponse(memo.getId(), memo.getContent(), memo.getModifiedAt());
    }
}
