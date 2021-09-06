package com.kubilaycicek.factory;

import com.kubilaycicek.factory.model.Iphone12;
import com.kubilaycicek.factory.model.Iphone13;
import com.kubilaycicek.factory.model.Phone;

public class PhoneFactory {
    public static Phone getPhone(String model, String battery, int height, int width) {
        Phone phone;

        if ("Iphone12".equalsIgnoreCase(model)) {
            phone = new Iphone12(model, battery, width, height);
        } else if ("Iphone13".equalsIgnoreCase(model)) {
            phone = new Iphone13(model, battery, width, height);
        } else {
            throw new IllegalArgumentException("No valid model !");
        }

        return phone;
    }
}
