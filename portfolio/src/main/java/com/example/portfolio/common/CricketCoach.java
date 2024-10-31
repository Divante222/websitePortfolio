package com.example.portfolio.common;

import org.springframework.stereotype.Component;

/*
 * Component marks the class as a Spring bean to make available for dependency injection
 */
@Component
// scope affects how objects are stored and whether or not you can compare them with ==
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    // define our init method
    // @PostConstruct
    // public void doMyStartupStuff(){
    //     System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    // }

    // @PreDestroy
    // public void doMyCleanupStuff(){
    //     System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    // }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
    
}
