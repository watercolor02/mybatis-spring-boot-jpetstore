package com.kazuki43zoo.jpetstore.mapper;

import com.kazuki43zoo.jpetstore.domain.Category;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
@CacheNamespace
public interface CategoryMapper {
    @Select("SELECT CATID AS categoryId, NAME, DESCN AS description FROM CATEGORY WHERE CATID = #{categoryId}")
    Category getCategory(String categoryId);
}
