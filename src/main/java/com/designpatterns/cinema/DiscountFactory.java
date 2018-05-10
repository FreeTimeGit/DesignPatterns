package com.designpatterns.cinema;

public class DiscountFactory {

    private static DiscountFactory discountFactory = null;

    private DiscountFactory() {

    }

    public static DiscountFactory getInstance() {
        if (discountFactory == null)
            discountFactory = new DiscountFactory();
        return discountFactory;
    }

    public Discount createDiscount(DiscountConditionChecker discountConditionChecker) {
        if (discountConditionChecker.extrasDiscountTrue()) {
            return new ExtrasDiscount();
        } else if (discountConditionChecker.tickestsAmountDiscountTrue()) {
            return new TicketsAmountDiscount();
        } else return new NoDiscount();
    }

}
