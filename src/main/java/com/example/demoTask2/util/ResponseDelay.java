package com.example.demoTask2.util;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import com.example.demoTask2.Config;

public class ResponseDelay {
    public static void doRandomDelay(long form_milliseconds, long to_milliseconds) {
        if (!Config.IS_TURN_ON_RESPONSE_DELAY){
            outDelayValue(0);
            return;
        }
        Random random = new Random();
        long delayTime = form_milliseconds + random.nextLong(to_milliseconds - form_milliseconds);
        outDelayValue(delayTime);
        // IS_TURN_ON_RESPONSE_DELAY
        doDelay(delayTime);
        
    }
    private static void doDelay(long delayTime){
        try {
            TimeUnit.MILLISECONDS.sleep(delayTime);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    private static void outDelayValue(long delayTime){
        if (Config.IS_PRINT_DELAY_TIME){
            System.out.printf("DELAY_TIME: %d milliseconds\n", delayTime);
        }
    }
    
}
