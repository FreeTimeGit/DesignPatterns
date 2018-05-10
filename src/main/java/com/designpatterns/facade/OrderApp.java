package com.designpatterns.facade;

public class OrderApp {

    public static void main(String[] args) {

        Order order = new Order("1234");

//        SaveOrderService saveOrderService = new SaveOrderService();
//        saveOrderService.saveOrder(order);
//
//        SendSmsToDriverService sendSmsToDriverService = new SendSmsToDriverService();
//        sendSmsToDriverService.sendSmsToDriver();
//
//        SendEmailToUserService sendEmailToUserService = new SendEmailToUserService();
//        sendEmailToUserService.sendEmailToUser();
//
//        GenerateBillService generateBillService = new GenerateBillService();
//        generateBillService.generateBill();

        OrderFacade facade = new OrderFacade();
        facade.processOrder(order);
    }
}
