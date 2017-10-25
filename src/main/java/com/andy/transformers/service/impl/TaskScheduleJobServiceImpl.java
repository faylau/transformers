package com.andy.transformers.service.impl;

import com.andy.transformers.mapper.TaskScheduleJobMapper;
import com.andy.transformers.pojo.TaskScheduleJob;
import com.andy.transformers.service.ITaskScheduleJobService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by pc on 2017/9/4.
 */
@Component
public class TaskScheduleJobServiceImpl implements ITaskScheduleJobService {

    private static final Logger logger = LoggerFactory.getLogger(TaskScheduleJobServiceImpl.class);

    @Autowired
    private TaskScheduleJobMapper taskScheduleJobMapper;

    @Override
    public TaskScheduleJob findById(Long id) {
        return taskScheduleJobMapper.selectByPrimaryKey(id);
    }
}
