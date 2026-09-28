package fr.suggestionlab.api.dto;

public class HelloResponse {
    
    private final String message;

    public HelloResponse(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}