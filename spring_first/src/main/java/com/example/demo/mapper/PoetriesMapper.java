package com.example.demo.mapper;

import com.example.demo.bean.Poetries;
import com.example.demo.bean.PoetriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PoetriesMapper {
    long countByExample(PoetriesExample example);

    int deleteByExample(PoetriesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Poetries record);

    int insertSelective(Poetries record);

    List<Poetries> selectByExample(PoetriesExample example);

    Poetries selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Poetries record, @Param("example") PoetriesExample example);

    int updateByExample(@Param("record") Poetries record, @Param("example") PoetriesExample example);

    int updateByPrimaryKeySelective(Poetries record);

    int updateByPrimaryKey(Poetries record);
}