package com.example.demo.util;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/**
 *
 * @author ailianshuo
 * @date 2017年9月2日
 * @param <T>
 */
public interface MyMapper<T> extends Mapper<T>,MySqlMapper<T> {

}
