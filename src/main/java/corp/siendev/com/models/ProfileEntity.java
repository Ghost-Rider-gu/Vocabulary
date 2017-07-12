package corp.siendev.com.models;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Profiles for users
 * Additional information about users (photo, name, mail etc.)
 *
 * @author Golubnichenko Yuriy
 */
@Getter
@Setter
@Entity
@Table(name = "profile")
public class ProfileEntity extends BaseEntity implements Serializable
{
    @Setter(AccessLevel.NONE)
    private static final long serialVersionUID = 1351350720168320374L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "user_mail")
    private String userMail;

    @Column(name = "user_avatar")
    private String userAvatar;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_describe")
    private String userDescribe;

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProfileEntity that = (ProfileEntity) o;

        if (id != that.id) return false;
        if (userMail != null ? !userMail.equals(that.userMail) : that.userMail != null) return false;
        if (userAvatar != null ? !userAvatar.equals(that.userAvatar) : that.userAvatar != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userDescribe != null ? !userDescribe.equals(that.userDescribe) : that.userDescribe != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id;
        result = 31 * result + (userMail != null ? userMail.hashCode() : 0);
        result = 31 * result + (userAvatar != null ? userAvatar.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userDescribe != null ? userDescribe.hashCode() : 0);

        return result;
    }

    @Override
    public String toString()
    {
        return "User name is: " + this.userName + "\n" +
                "User email is: " + this.userMail + "\n" +
                "User describe: " + this.userDescribe;
    }
}
