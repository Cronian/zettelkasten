package module.be.api.category.entity;

import jakarta.persistence.*;
import module.be.api.common.entity.BaseEntity;

@Entity
public class Category extends BaseEntity {
    @Id
    @Column(name = "category_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long seq;

    @Column(length = 40)
    private String name;

    @Column(length = 200)
    private String description;
}
