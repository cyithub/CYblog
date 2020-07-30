package yyl.com.perblog.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.jpa.repository.JpaRepository;
import yyl.com.perblog.Entity.Mto_User;

import javax.annotation.Resource;

@Mapper
public interface UserDao extends JpaRepository<Mto_User, Integer> {


    Mto_User findById(int id);

}
