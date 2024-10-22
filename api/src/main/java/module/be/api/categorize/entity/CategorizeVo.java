package module.be.api.categorize.entity;

import jakarta.persistence.*;
import module.be.api.category.entity.CategoryVo;
import module.be.api.common.entity.BaseVo;
import module.be.api.memo.entity.MemoVo;

@Entity
public class CategorizeVo extends BaseVo {
    @EmbeddedId
    private CategorizeId id;

    @MapsId("category_seq")
    @OneToOne
    @JoinColumn(name = "category_seq")
    private CategoryVo category;

    @MapsId("memo_seq")
    @ManyToOne
    @JoinColumn(name = "memo_seq")
    private MemoVo memo;

}
