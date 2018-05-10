package com.designpatterns.lombok;

public class ProjectApp {

    public static void main(String[] args) {
        Project project = Project.builder()
                .company("Company")
                .name("Projecct name")
                .build();

        System.out.println(project);
    }

}
