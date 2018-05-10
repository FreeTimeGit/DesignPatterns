package com.designpatterns.factory;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("hey how would you like to send invitation?");
        System.out.println("1. SMS");
        System.out.println("2. EMAIL");
        System.out.println("3. FAX");

        InvitationSenderFactory factory = new InvitationSenderFactory();
        int i = scanner.nextInt();
        InvitationSender invitationSender;
        if(i == 1){
            invitationSender = factory.createInvitationSender(InvitationSenderType.SMS);
        }
        else if(i == 2){
            invitationSender = factory.createInvitationSender(InvitationSenderType.EMAIL);
        }
        else if(i == 3){
            invitationSender = factory.createInvitationSender(InvitationSenderType.FAX);
        }
        else{
            System.out.println("BAD ARGUMENT");
            return;
        }

        Invitation invitation = new Invitation("Rafał", "Kilanowski", "Russia");
        invitationSender.sendInvitation(invitation);

    }
}
