package com.andy.transformers;

import com.andy.transformers.mapper.TaskScheduleJobMapper;
import com.andy.transformers.pojo.TaskScheduleJob;
import com.andy.transformers.service.ITaskScheduleJobService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TransformersApplicationTests {

    @Autowired
    private ITaskScheduleJobService taskScheduleJobService;

	@Test
	public void contextLoads() {
	}

	@Test
    public void test() {
        TaskScheduleJob taskScheduleJob = taskScheduleJobService.findById(0L);
        System.out.println(taskScheduleJob);
    }

}
