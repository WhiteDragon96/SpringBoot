package com.example.demo.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.example.demo.mapper.PoetriesMapper;
import java.util.List;
import com.example.demo.bean.Poetries;
import com.example.demo.bean.PoetriesExample;
import com.example.demo.service.PoetriesService;
@Service
public class PoetriesServiceImpl implements PoetriesService{

    @Resource
    private PoetriesMapper poetriesMapper;

    @Override
    public long countByExample(PoetriesExample example) {
        return poetriesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(PoetriesExample example) {
        return poetriesMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return poetriesMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Poetries record) {
        return poetriesMapper.insert(record);
    }

    @Override
    public int insertSelective(Poetries record) {
        return poetriesMapper.insertSelective(record);
    }

    @Override
    public List<Poetries> selectByExample(PoetriesExample example) {


        return poetriesMapper.selectByExample(example);
    }

    @Override
    public Poetries selectByPrimaryKey(Integer id) {
        return poetriesMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByExampleSelective(Poetries record,PoetriesExample example) {
        return poetriesMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(Poetries record,PoetriesExample example) {
        return poetriesMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(Poetries record) {
        return poetriesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Poetries record) {
        return poetriesMapper.updateByPrimaryKey(record);
    }

}
