package cn.zyf.dao;

import cn.zyf.domain.BaseDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import java.io.Serializable;

/**
 * Created by ZYF_JOKER on 2018/1/22.
 */
@NoRepositoryBean
public interface  BaseJpaRepository <T extends BaseDomain,ID extends Serializable>
        extends JpaRepository<T,ID> {
}