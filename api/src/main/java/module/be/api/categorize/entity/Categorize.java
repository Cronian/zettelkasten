package module.be.api.categorize.entity;

import jakarta.persistence.*;
import module.be.api.category.entity.Category;
import module.be.api.common.entity.BaseEntity;
import module.be.api.memo.entity.Memo;

@Entity
public class Categorize extends BaseEntity {
    @EmbeddedId
    private CategorizeId id;

    @MapsId("category_seq")
    @OneToOne
    @JoinColumn(name = "category_seq")
    private Category category;

    @MapsId("memo_seq")
    @ManyToOne
    @JoinColumn(name = "memo_seq")
    private Memo memo;

}
