package com.designpatterns.factory;

public class EmailInvitationSender implements InvitationSender {

    public void sendInvitation(Invitation invitation) {
        System.out.println("Send invitation via email to: " +
                invitation.getName() + " " + invitation.getSurname());
        System.out.println(invitation.getAddress());
        System.out.println("EMAIL SEND");
    }
}
