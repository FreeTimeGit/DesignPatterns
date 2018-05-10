package com.designpatterns.template;

import java.util.Collections;
import java.util.List;

public abstract class EmailGenerator {

    List<String> to;
    List<String> cc;
    String topic;

    public abstract void setToList();

    public void setCcList(){
        cc = Collections.emptyList();
    }

    public abstract void setTopic();

    public final void sendEmail(){
        setToList();
        setCcList();
        setTopic();
        printEmail();

    }
    private void printEmail(){
        System.out.println("Email topic: "+ topic);
        System.out.print("Email to: ");
        to.forEach(s-> System.out.println(s));
        System.out.println();
        System.out.print("Email cc: ");
        cc.forEach(System.out::print);
        System.out.println();
        System.out.println("Email content : THIS IS EMAIL CONTENT");
    }

}
