package cn.zyf.service;

import cn.zyf.dao.UserRepositoty;
import cn.zyf.domain.User;
import cn.zyf.dubboservice.IUserServiec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZYF_JOKER on 2018/1/20.
 */
@Service
@com.alibaba.dubbo.config.annotation.Service
public class IUserServiceImpl implements IUserServiec{

    @Autowired
    private UserRepositoty userRepositoty;

    @Override
    public User findById(Long id){
      return userRepositoty.findById(id);
    }
    //
}
