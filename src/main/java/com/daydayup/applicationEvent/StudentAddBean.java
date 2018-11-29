package com.daydayup.applicationEvent;
import com.daydayup.applicationEvent.StudentAddEvent;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author admin
 * @date 2018/5/17 17:45
 * 定义StudentAddBean触发StudentAddEvent事件
 * 新建StudentAddBean类，实现接口 org.springframework.context.ApplicationContextAware中的setApplicationContext方法，
 * 在构造bean的时候注入Spring的上下文对象，以便通过Spring上下文对象的publishEvent方法来触发StudentAddEvent事件
 */
@Component
public class StudentAddBean implements ApplicationContextAware {
    /**
     * 定义Spring上下文对象
     */
    private ApplicationContext applicationContext = null;

    /*
     * (non-Javadoc)
     *
     * @see
     * org.springframework.context.ApplicationContextAware#setApplicationContext
     * (org.springframework.context.ApplicationContext)
     */
    public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        this.applicationContext = applicationContext;

    }

    /**
     * 增加一个学生
     *
     * @param studentName
     */
    public void addStudent(String studentName) {
        // 1.构造一个增加学生的事件
        StudentAddEvent aStudentEvent = new StudentAddEvent(
                applicationContext, studentName);
        // 2.触发增加学生事件
        applicationContext.publishEvent(aStudentEvent);
    }

}