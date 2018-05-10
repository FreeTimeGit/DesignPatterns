package com.designpatterns.template;

public class EmailFactory {

    EmailGenerator emailGenerator;

    public EmailGenerator createEmail(int emailChoice) {
        switch (emailChoice) {
            case 1:
                emailGenerator = new ForManagersEmailGenerator();
                break;
            case 2:
                emailGenerator = new ForHrEmailGenerator();
                break;
            case 3:
                emailGenerator = new ForEmployeeEmailGenerator();
                break;
        }
        throw new RuntimeException("Wrong choice");
    }
}
