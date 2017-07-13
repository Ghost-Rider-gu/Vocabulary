package corp.siendev.com.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Word entity. Add new words
 *
 * @author Golubnichenko Yuriy
 */
@Getter
@Setter
@Entity
@Table(name = "word")
public class WordEntity extends BaseEntity implements Serializable
{
    @Setter(AccessLevel.NONE)
    private static final long serialVersionUID = 3132167399148271724L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "word")
    private String word;

    @Column(name = "translate")
    private String translate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private WordCategoryEntity categoryWord;

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WordEntity that = (WordEntity) o;

        if (id != that.id) return false;
        if (word != null ? !word.equals(that.word) : that.word != null) return false;
        if (translate != null ? !translate.equals(that.translate) : that.translate != null) return false;
        if (categoryWord != null ? !categoryWord.equals(that.categoryWord) : that.categoryWord != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id;
        result = 31 * result + (word != null ? word.hashCode() : 0);
        result = 31 * result + (translate != null ? translate.hashCode() : 0);
        result = 31 * result + (categoryWord != null ? categoryWord.hashCode() : 0);

        return result;
    }

    @Override
    public String toString()
    {
        return "Added new word: " + this.word + "\n" +
                "with translate: " + this.translate + "\n" +
                "in category: " + this.categoryWord.getCategory();
    }
}
