package com.nisrinekane.daikichipathvariables;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiPathVarsController  {
    //index
    @RequestMapping("/")
    public String index() {
        return "welcome";
    }
    //today
    @RequestMapping("/today")
    public String today() {
        return "today you will find luck in all your endeavors";
    }
    //tomorrow
    @RequestMapping("/tomorrow")
    public String tomorrow() {
        return "tomorrow an opportunity will arise, so be sure to be open to new ideas";
    }
    // travel honolulu (hardcoded)
    @RequestMapping("/travel/honolulu")
    public String showHonolulu(){
        return "congratulations, you will soon travel to honolulu.";
    }
    //lotto 6 (hardcoded)
    @RequestMapping("/lotto/6")
    public String showLotto6(){
        return "you will take a grand journey in the near future, but be wary of tempting offers.";
    }

    //city (dynamic)
    @RequestMapping("/{travel}/{city}")
    public String showTravel(@PathVariable String travel, @PathVariable String city){
        return "congratulations, you will soon travel to " + city + "!";
    }
    //lotto  (dynamic)
    @RequestMapping("/lotto/{num}")
    public String showLotto(@PathVariable int num){
        //even
        return num % 2 == 0
        ?
        "You will take a grand journey in the near future, but be weary of tempting offers."
         //odd
        :
        "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
    }

}
