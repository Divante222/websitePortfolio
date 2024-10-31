package com.example.portfolio.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.portfolio.common.Coach;



@RestController
public class FunRestController {

    private Coach myCoach;

    // inject properties for: coach.name and team.name
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // the spring framework knows to look for the coach class
    // @Autowired
    // public void setCoach(Coach theCoach){
    //     myCoach = theCoach;
    // }

    // constructor injection
    // annotation that tells spring to inject a dependency
    // @Autowired
    // public FunRestController(@Qualifier("cricketCoach") Coach theCoach){
    //     myCoach = theCoach;
    // }

    
    @Autowired
    public FunRestController(@Qualifier("swimCoach")Coach theCoach){
                System.out.println("In constructor: " + getClass().getSimpleName());
                myCoach = theCoach;
    }

    // @GetMapping("/check")
    // public String getCheck() {
    //     return "Comparing beans: myCoach == anotherCoach, " + (myCoach == anotherCoach);
    // }
    
    @GetMapping("/teaminfo")
    public String getMethodName() {
        return "Coach:" + coachName + "\nTeam Name: " + teamName;
    }

    // expose a "/" that returns "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/workout")
    public String getWorkout(){
        return "Run a hard 5k";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day!";
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
