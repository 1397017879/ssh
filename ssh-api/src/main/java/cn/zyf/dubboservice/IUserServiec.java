package cn.zyf.dubboservice;

import cn.zyf.domain.User;

import java.util.List;

/**
 * Created by ZYF_JOKER on 2018/1/20.
 */
public interface IUserServiec {

    public User findById(Long id);

}
