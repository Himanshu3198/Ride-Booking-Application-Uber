package hs.core.Util;


import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class OTPGenerator {

    public static int getOTP(){
        Random random = new Random();
        return random.nextInt(1000,10000);
    }
}
