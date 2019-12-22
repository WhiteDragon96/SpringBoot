package com.example.demo.service;

import java.util.List;
import com.example.demo.bean.Cnarea2018Example;
import com.example.demo.bean.Cnarea2018;
public interface Cnarea2018Service{


    long countByExample(Cnarea2018Example example);

    int deleteByExample(Cnarea2018Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cnarea2018 record);

    int insertSelective(Cnarea2018 record);

    List<Cnarea2018> selectByExample(Cnarea2018Example example);

    Cnarea2018 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(Cnarea2018 record,Cnarea2018Example example);

    int updateByExample(Cnarea2018 record,Cnarea2018Example example);

    int updateByPrimaryKeySelective(Cnarea2018 record);

    int updateByPrimaryKey(Cnarea2018 record);

}
