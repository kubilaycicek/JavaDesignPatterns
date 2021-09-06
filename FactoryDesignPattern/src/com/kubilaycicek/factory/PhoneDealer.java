package com.kubilaycicek.factory;

import com.kubilaycicek.factory.model.Phone;

public class PhoneDealer {
    public static void main(String[] args) {
        Phone iphone12 = PhoneFactory.getPhone("Iphone12", "3000 mah", 4, 6);
        Phone iphone13 = PhoneFactory.getPhone("Iphone13", "5000 mah", 4, 6);

        System.out.println(iphone12);
        System.out.println(iphone13);
    }
}
