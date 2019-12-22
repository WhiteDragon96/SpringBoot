package com.example.demo.mapper;

import com.example.demo.bean.UserOrderT;
import com.example.demo.bean.UserOrderTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserOrderTMapper {
    long countByExample(UserOrderTExample example);

    int deleteByExample(UserOrderTExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserOrderT record);

    int insertSelective(UserOrderT record);

    List<UserOrderT> selectByExample(UserOrderTExample example);

    UserOrderT selectByPrimaryKey(Integer id);

    List<UserOrderT> selectByUid(int uid);

    int updateByExampleSelective(@Param("record") UserOrderT record, @Param("example") UserOrderTExample example);

    int updateByExample(@Param("record") UserOrderT record, @Param("example") UserOrderTExample example);

    int updateByPrimaryKeySelective(UserOrderT record);

    int updateByPrimaryKey(UserOrderT record);


}
