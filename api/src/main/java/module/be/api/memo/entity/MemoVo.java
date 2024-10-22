package module.be.api.memo.entity;

import jakarta.persistence.*;
import module.be.api.common.entity.BaseVo;
import org.hibernate.annotations.ColumnDefault;

@Entity
public class MemoVo extends BaseVo {
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
}
