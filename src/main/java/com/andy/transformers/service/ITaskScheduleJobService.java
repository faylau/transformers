package com.andy.transformers.service;

import com.andy.transformers.pojo.TaskScheduleJob;

/**
 * Created by pc on 2017/9/4.
 */
public interface ITaskScheduleJobService {

    TaskScheduleJob findById(Long id);
}
