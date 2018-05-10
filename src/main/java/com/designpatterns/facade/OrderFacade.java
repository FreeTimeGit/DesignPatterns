package com.designpatterns.facade;

public class OrderFacade {

    private SaveOrderService saveOrderService;
    private SendEmailToUserService sendEmailToUserService;
    private SendSmsToDriverService sendSmsToDriverService;
    private GenerateBillService generateBillService;

    public OrderFacade() {
        saveOrderService = new SaveOrderService();
        sendEmailToUserService = new SendEmailToUserService();
        sendSmsToDriverService = new SendSmsToDriverService();
        generateBillService = new GenerateBillService();
    }

    public void processOrder (Order order){
        saveOrderService.saveOrder(order);
        sendSmsToDriverService.sendSmsToDriver();
        sendEmailToUserService.sendEmailToUser();
        generateBillService.generateBill();
    }
}
