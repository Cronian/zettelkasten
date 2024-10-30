package module.be.api.memo.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import module.be.api.memo.entity.Memo;

@Getter
@NoArgsConstructor
public class MemoDto {
    Long seq;
    String title;
    String text;
    short rank;

    @Builder
    public MemoDto(Memo memo) {
        this.seq = memo.getSeq();
        this.title = memo.getTitle();
        this.text = memo.getText();
        this.rank = memo.getRank();
    }
}
