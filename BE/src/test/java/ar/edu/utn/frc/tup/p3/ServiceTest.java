package ar.edu.utn.frc.tup.p3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ServiceTest {

    @InjectMocks
    private Service service;

    @Test
    public void exampleTest() {
        // Arrange
        when(horaService.getHora()).thenReturn(9L);
        // Act
        String result = messageService.getMessage();
        // Assert
        assertEquals("Buenos dias!", result);
    }
}
