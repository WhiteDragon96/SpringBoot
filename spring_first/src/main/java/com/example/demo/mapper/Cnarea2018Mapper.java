package com.example.demo.mapper;

import com.example.demo.bean.Cnarea2018;
import com.example.demo.bean.Cnarea2018Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Cnarea2018Mapper {
    long countByExample(Cnarea2018Example example);

    int deleteByExample(Cnarea2018Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cnarea2018 record);

    int insertSelective(Cnarea2018 record);

    List<Cnarea2018> selectByExample(Cnarea2018Example example);

    Cnarea2018 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cnarea2018 record, @Param("example") Cnarea2018Example example);

    int updateByExample(@Param("record") Cnarea2018 record, @Param("example") Cnarea2018Example example);

    int updateByPrimaryKeySelective(Cnarea2018 record);

    int updateByPrimaryKey(Cnarea2018 record);
}