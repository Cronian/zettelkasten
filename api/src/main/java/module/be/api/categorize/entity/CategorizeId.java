package module.be.api.categorize.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class CategorizeId implements Serializable {
    @Column(name = "category_seq")
    private long category_seq;

    @Column(name = "memo_seq")
    private long memo_seq;
}
