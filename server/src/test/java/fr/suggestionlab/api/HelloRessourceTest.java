package fr.suggestionlab.api;

import fr.suggestionlab.api.dto.HelloResponse;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloResourceTest {

    @Test
    void shouldReturnSuggestionLabMessage() {

        HelloResource resource = new HelloResource();

        HelloResponse response = resource.hello();

        assertEquals("Suggestion Lab", response.getMessage());
    }
}