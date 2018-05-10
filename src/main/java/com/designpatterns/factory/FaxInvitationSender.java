package com.designpatterns.factory;

public class FaxInvitationSender implements InvitationSender {

    public void sendInvitation(Invitation invitation) {
        System.out.println("Send invitation via fax to: " +
                invitation.getName() + " " + invitation.getSurname());
        System.out.println(invitation.getAddress());
        System.out.println("FAX SEND");
    }
}
