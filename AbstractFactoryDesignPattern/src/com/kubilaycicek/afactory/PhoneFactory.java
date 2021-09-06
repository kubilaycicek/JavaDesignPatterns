package com.kubilaycicek.afactory;

import com.kubilaycicek.model.Iphone12;
import com.kubilaycicek.model.Iphone13;
import com.kubilaycicek.model.Phone;

public interface PhoneFactory {
    Phone getPhone(String model, String battery, int width, int height);
}
