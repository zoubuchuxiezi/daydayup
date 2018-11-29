package com.daydayup.applicationEvent;

import com.daydayup.applicationEvent.StudentAddBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author admin
 * @date 2018/5/17 17:55
 * ApplicationContext在运行期会自动检测到所有实现了ApplicationListener的bean对象，并将其作为事件接收对象。
 * 当ApplicationContext的publishEvent方法被触发时，每个实现了ApplicationListener接口的bean都会收到ApplicationEvent对象，
 * 每个ApplicationListener可根据事件类型只接收处理自己感兴趣的事件，比如上面的StudentAddListener只接收StudentAddEvent事件。
 */
@RunWith(SpringRunner.class)
public class EventListenerTest {

    @Autowired
    private StudentAddBean studentBean;
    @Test
    public void test(){
        studentBean.addStudent("我是第一个学生");
        studentBean.addStudent("第二个学生已经添加");
    }

}
