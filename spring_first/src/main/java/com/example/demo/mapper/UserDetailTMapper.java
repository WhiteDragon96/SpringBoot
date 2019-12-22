package com.example.demo.mapper;

import com.example.demo.bean.UserDetailT;
import com.example.demo.bean.UserDetailTExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserDetailTMapper {
    long countByExample(UserDetailTExample example);

    int deleteByExample(UserDetailTExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserDetailT record);

    int insertSelective(UserDetailT record);

    List<UserDetailT> selectByExample(UserDetailTExample example);

    UserDetailT selectByPrimaryKey(Integer id);

    UserDetailT selectByUid(int id);

    int updateByExampleSelective(@Param("record") UserDetailT record, @Param("example") UserDetailTExample example);

    int updateByExample(@Param("record") UserDetailT record, @Param("example") UserDetailTExample example);

    int updateByPrimaryKeySelective(UserDetailT record);

    int updateByPrimaryKey(UserDetailT record);
}
