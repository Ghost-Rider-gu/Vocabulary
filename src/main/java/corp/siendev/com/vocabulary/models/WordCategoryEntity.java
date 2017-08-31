package corp.siendev.com.vocabulary.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Category for our words
 *
 * @author Golubnichenko Yuriy
 */
@Getter
@Setter
@Entity
@Table(name = "word_category")
public class WordCategoryEntity extends BaseEntity implements Serializable
{
    @Setter(AccessLevel.NONE)
    private static final long serialVersionUID = 4756297119140949108L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "category")
    private String category;

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WordCategoryEntity that = (WordCategoryEntity) o;

        if (id != that.id) return false;
        if (category != null ? !category.equals(that.category) : that.category != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id;
        result = 31 * result + (category != null ? category.hashCode() : 0);

        return result;
    }

    @Override
    public String toString()
    {
        return "New category has created: " + this.category;
    }
}
