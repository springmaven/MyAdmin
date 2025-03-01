package com.ruoyi.order.mapper;

import com.ruoyi.order.domain.BdOrder;
import com.ruoyi.order.domain.BdOrderExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BdOrderMapper {
    long countByExample(BdOrderExample example);

    int deleteByExample(BdOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BdOrder record);

    int insertSelective(BdOrder record);

    List<BdOrder> selectByExample(BdOrderExample example);

    BdOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BdOrder record, @Param("example") BdOrderExample example);

    int updateByExample(@Param("record") BdOrder record, @Param("example") BdOrderExample example);

    int updateByPrimaryKeySelective(BdOrder record);

    int updateByPrimaryKey(BdOrder record);
}