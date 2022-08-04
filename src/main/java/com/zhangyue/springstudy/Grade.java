package com.zhangyue.springstudy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @Author zhangyue
 **/
public class Grade {
    private static final Log LOGGER = LogFactory.getLog(Grade.class);

    private Integer gradeId;
    private String gradeName;

    public Integer getGradeId() {
        return gradeId;
    }

    public Grade() {
    }

    public void setGradeId(Integer gradeId) {
        this.gradeId = gradeId;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName;
    }

//    @Override
//    public String toString() {
//        return "Grade{" +
//                "gradeId=" + gradeId +
//                ", gradeName='" + gradeName + '\'' +
//                '}';
//    }

    public Grade(Integer gradeId, String gradeName) {
        LOGGER.info("正在执行 Course 的有参构造方法，参数分别为：gradeId=" + gradeId + ",gradeName=" + gradeName);

        this.gradeId = gradeId;
        this.gradeName = gradeName;
    }

}
