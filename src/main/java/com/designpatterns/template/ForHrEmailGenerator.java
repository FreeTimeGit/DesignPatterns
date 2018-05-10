package com.designpatterns.template;

import java.util.Arrays;

public class ForHrEmailGenerator extends EmailGenerator {

    @Override
    public void setToList() {
        to = Arrays.asList("hr@gmail.com");
    }

    @Override
    public void setTopic() {
        topic = "Email for HR";
    }

    @Override
    public void setCcList() {
        cc = Arrays.asList("managers@interia.eu");
    }
}
