package fr.suggestionlab;

public class Application {

    public static void main(String[] args){

        GreetingService greetingService = new GreetingService();

        System.out.println(greetingService.getMessage());
    
    }
}