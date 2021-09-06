package com.kubilaycicek.afactory;

import com.kubilaycicek.model.Iphone13;
import com.kubilaycicek.model.Phone;

public class Iphone13Factory implements PhoneFactory {
    @Override
    public Phone getPhone(String model, String battery, int width, int height) {
        return new Iphone13(model, battery, width, height);
    }
}
