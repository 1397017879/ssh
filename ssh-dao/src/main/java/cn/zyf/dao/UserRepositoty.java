package cn.zyf.dao;

import cn.zyf.domain.User;
import org.springframework.stereotype.Repository;


/**
 * Created by ZYF_JOKER on 2018/2/1.
 */
@Repository
public interface UserRepositoty extends BaseJpaRepository<User,Long> {
    public User findById(Long id);
}
