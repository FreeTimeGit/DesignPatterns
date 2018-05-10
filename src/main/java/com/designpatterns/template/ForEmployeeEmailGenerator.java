package com.designpatterns.template;

import java.util.Arrays;

public class ForEmployeeEmailGenerator extends EmailGenerator {

    @Override
    public void setToList() {
        to = Arrays.asList("employee.kovalsky@interia.pl");
    }

    @Override
    public void setTopic() {
        topic = "Email for employee";
    }
}
