package module.be.api.memo.entity;

import jakarta.persistence.*;
import lombok.*;
import module.be.api.common.entity.BaseEntity;
import org.hibernate.annotations.ColumnDefault;

@Entity
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "memo")
public class Memo extends BaseEntity {
    @Id
    @Column(name = "memo_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long seq;

    @Column(length = 100)
    private String title;

    @Column(length = 4000)
    private String text;

    @ColumnDefault("1")
    private short rank;

    @Builder
    public Memo(String title, String text, short rank) {
        this.title = title;
        this.text = text;
        this.rank = rank;
    }
}
