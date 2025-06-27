package com.example.demoTask2.util;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ResponseDelay {
    public static void doRandomDelay(long form_milliseconds, long to_milliseconds) {
        Random random = new Random();
        long delayTime = form_milliseconds + random.nextLong(to_milliseconds - form_milliseconds);
        System.out.printf("DELAY_TIME: %d\n", delayTime);
        try {
            TimeUnit.MILLISECONDS.sleep(delayTime);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    
}
