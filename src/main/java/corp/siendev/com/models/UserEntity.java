package corp.siendev.com.models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Users which may use vocabulary application
 * Build new personal vocabulary, add new words, delete, update and search words
 *
 * @author Golubnichenko Yuriy
 */
@Entity
@Table(name = "user")
public class UserEntity extends BaseEntity implements Serializable
{
    private static final long serialVersionUID = -5054991725759496635L;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "deleted_at")
    private Timestamp deletedAt;

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getLogin()
    {
        return login;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public Timestamp getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt)
    {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt()
    {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    public Timestamp getDeletedAt()
    {
        return deletedAt;
    }

    public void setDeletedAt(Timestamp deletedAt)
    {
        this.deletedAt = deletedAt;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (id != that.id) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (deletedAt != null ? !deletedAt.equals(that.deletedAt) : that.deletedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode()
    {
        int result = id;

        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (deletedAt != null ? deletedAt.hashCode() : 0);

        return result;
    }

    @Override
    public String toString()
    {
        return "New user has got id: " + this.id + "\n and login: " + this.login +
               "\n He was create in: " + this.createdAt;
    }
}
