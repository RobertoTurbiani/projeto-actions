package actions.projeto.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.server.ResponseStatusException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraServiceTest {

    @Test
    @DisplayName("Quando acionado com 10 e 2, então deve retornar 5")
    public void testDividir(){

        CalculadoraService calculadoraService = new CalculadoraService();

        double a = 10;
        double b = 2;

        var expectedMessage = "400 BAD_REQUEST\" Divisão por zero não permitida\"";

        ResponseStatusException exception = assertThrows(
                ResponseStatusException.class,() ->{
                    calculadoraService.dividir(a,b);
                });

        assertEquals(expectedMessage, exception.getMessage());

    }
}
