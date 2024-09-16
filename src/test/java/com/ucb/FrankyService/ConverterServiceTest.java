package com.ucb.FrankyService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ConverterServiceTest {

    @Mock
    ConfigurationParam configurationParam;

    @InjectMocks
    ConverterService converterService;

    @Test
    @DisplayName("Method to Convert Celsius To Fahrenheit")
    void celsiusToFahrenheit()
    {
        assertEquals(212, converterService.CelsiusToFahrenheit(100));
    }

    @Test
    @DisplayName("Method to Convert Fahrenheit To Celsius ")
    void fahrenheitToCelsius()
    {
        assertEquals(100, converterService.FahrenheitToCelsius(212));
    }

    @Test
    @DisplayName("Method to Convert Bolivian To Dollar ")
    void bolivianToDollar()
    {
        when(configurationParam.getOfficialDollar()).thenReturn(6.96);
        assertEquals(1, converterService.BolivianToDollar(6.96));
    }
}