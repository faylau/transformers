package com.andy.transformers.mapper;

import com.andy.transformers.pojo.TaskScheduleJob;
import com.andy.transformers.pojo.TaskScheduleJobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskScheduleJobMapper {
    long countByExample(TaskScheduleJobExample example);

    int deleteByExample(TaskScheduleJobExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TaskScheduleJob record);

    int insertSelective(TaskScheduleJob record);

    List<TaskScheduleJob> selectByExample(TaskScheduleJobExample example);

    TaskScheduleJob selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TaskScheduleJob record, @Param("example") TaskScheduleJobExample example);

    int updateByExample(@Param("record") TaskScheduleJob record, @Param("example") TaskScheduleJobExample example);

    int updateByPrimaryKeySelective(TaskScheduleJob record);

    int updateByPrimaryKey(TaskScheduleJob record);
}