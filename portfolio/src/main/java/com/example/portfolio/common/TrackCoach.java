package com.example.portfolio.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


//Primary is used so autowired knows where to grab the correct class for the constuctor
//Lazy is used to tell the spring framework to not initialize this class until needed
@Component
// @Primary
@Lazy
public class TrackCoach implements Coach{

    public TrackCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }
    
}
