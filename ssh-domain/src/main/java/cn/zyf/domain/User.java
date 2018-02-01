package cn.zyf.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ZYF_JOKER on 2018/1/18.
 */

@Entity
@Table(name = "t_user")
public class User extends BaseDomain{

    private static final long serialVersionUID = 6465851066255870026L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id ;

    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
