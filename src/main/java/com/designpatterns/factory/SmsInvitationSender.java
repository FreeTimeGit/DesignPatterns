package com.designpatterns.factory;

public class SmsInvitationSender implements InvitationSender {

    public void sendInvitation(Invitation invitation) {
        System.out.println("Send invitation via sms to: " +
                invitation.getName() + " " + invitation.getSurname());
        System.out.println(invitation.getAddress());
        System.out.println("SMS SEND");
    }

}
