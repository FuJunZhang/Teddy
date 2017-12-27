package com.xingoo.streaming.monitor.service;

import com.xingoo.streaming.monitor.Application;
import com.xingoo.streaming.monitor.manager.ProcessManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class JobManagerTest {

    @Autowired
    private ProcessManager processManager;

    @Test
    public void startPing(){}
}
