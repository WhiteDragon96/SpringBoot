package com.example.demo.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.demo.mapper.Cnarea2018Mapper;
import com.example.demo.bean.Cnarea2018Example;
import com.example.demo.bean.Cnarea2018;
import com.example.demo.service.Cnarea2018Service;
@Service
public class Cnarea2018ServiceImpl implements Cnarea2018Service{

    @Resource
    private Cnarea2018Mapper cnarea2018Mapper;

    @Override
    public long countByExample(Cnarea2018Example example) {
        return cnarea2018Mapper.countByExample(example);
    }

    @Override
    public int deleteByExample(Cnarea2018Example example) {
        return cnarea2018Mapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return cnarea2018Mapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Cnarea2018 record) {
        return cnarea2018Mapper.insert(record);
    }

    @Override
    public int insertSelective(Cnarea2018 record) {
        return cnarea2018Mapper.insertSelective(record);
    }

    @Override
    public List<Cnarea2018> selectByExample(Cnarea2018Example example) {
        return cnarea2018Mapper.selectByExample(example);
    }

    @Override
    public Cnarea2018 selectByPrimaryKey(Integer id) {
        return cnarea2018Mapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Cnarea2018 record,Cnarea2018Example example) {
        return cnarea2018Mapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Cnarea2018 record,Cnarea2018Example example) {
        return cnarea2018Mapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Cnarea2018 record) {
        return cnarea2018Mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Cnarea2018 record) {
        return cnarea2018Mapper.updateByPrimaryKey(record);
    }

}
