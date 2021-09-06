package com.kubilaycicek;


import com.kubilaycicek.afactory.Iphone12Factory;
import com.kubilaycicek.afactory.Iphone13Factory;
import com.kubilaycicek.model.Phone;

public class PhoneDealer {
    public static void main(String[] args) {

        Iphone12Factory iphone12Factory = new Iphone12Factory();
        Phone iphone12 = iphone12Factory.getPhone("Iphone12", "300mah", 4, 6);
        System.out.println(iphone12);

        Iphone13Factory iphone13Factory = new Iphone13Factory();
        Phone iphone13 = iphone13Factory.getPhone("Iphone13", "300mah", 4, 6);
        System.out.println(iphone13);
    }
}
