package com.designpatterns.template;

import java.util.ArrayList;
import java.util.Arrays;

public class ForManagersEmailGenerator extends EmailGenerator {

    @Override
    public void setToList() {
        to = Arrays.asList("managers@interia.pl", "adam.ceo@onet.eu");
    }

    @Override
    public void setTopic() {
        topic = "Email for managers";
    }
}
