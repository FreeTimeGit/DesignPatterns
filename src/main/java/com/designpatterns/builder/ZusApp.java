package com.designpatterns.builder;

import static com.designpatterns.builder.ZusForm.*;

public class ZusApp {

    public static void main(String[] args) {

        ZusForm zusForm = ZusFormBuilder.builder()
                .name("Tomek")
                .surname("Niedbalski")
                .build();
        ZusForm zusForm1 = ZusFormBuilder.builder()
                .street("Króla")
                .age(41)
                .build();
        ZusForm zusForm2 = ZusFormBuilder.builder()
                .name("Tomek")
                .surname("Niedbalski")
                .build();

    }
}
