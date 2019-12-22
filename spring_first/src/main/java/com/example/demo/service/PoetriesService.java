package com.example.demo.service;

import java.util.List;
import com.example.demo.bean.Poetries;
import com.example.demo.bean.PoetriesExample;
public interface PoetriesService{


    long countByExample(PoetriesExample example);

    int deleteByExample(PoetriesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Poetries record);

    int insertSelective(Poetries record);

    List<Poetries> selectByExample(PoetriesExample example);

    Poetries selectByPrimaryKey(Integer id);

    int updateByExampleSelective(Poetries record,PoetriesExample example);

    int updateByExample(Poetries record,PoetriesExample example);

    int updateByPrimaryKeySelective(Poetries record);

    int updateByPrimaryKey(Poetries record);

}
