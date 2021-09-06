package com.kubilaycicek.afactory;

import com.kubilaycicek.model.Iphone12;
import com.kubilaycicek.model.Phone;

public class Iphone12Factory implements PhoneFactory {
    @Override
    public Phone getPhone(String model, String battery, int width, int height) {
        return new Iphone12(model, battery, width, height);
    }
}
