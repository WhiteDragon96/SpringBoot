package com.tcs.mapper;


import org.apache.ibatis.annotations.Param;

public interface AccountMapper {

    int transferMoney(@Param("username") String username, @Param("money") int money);
}
