package cn.zyf.service;

import cn.zyf.dao.UserRepositoty;
import cn.zyf.domain.User;
import cn.zyf.dubboservice.IUserServiec;
import cn.zyf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ZYF_JOKER on 2018/2/1.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private IUserServiec iUserServiec;

    @Autowired
    private UserRepositoty userRepositoty;

    @Override
    public User findById(Long id){
        return iUserServiec.findById(id);
    }

}
