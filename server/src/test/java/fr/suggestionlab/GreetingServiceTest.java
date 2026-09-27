package fr.suggestionlab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingServiceTest {
    
    @Test  // informe JUnit que cette méthode est un test
    void shouldReturnApplicationName(){

        GreetingService greetingService = new GreetingService();

        String result = greetingService.getMessage();
        
        assertEquals("Suggestion Lab", result);
    }
}
