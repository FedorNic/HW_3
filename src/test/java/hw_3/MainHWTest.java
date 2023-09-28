package hw_3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainHWTest {

    MainHW mainHW;
    // Тестовый метод вызывается перед каждым тестом. Дает каждый раз чистый экземпляр класса для тестов
    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }
    // Проверка функции на заведомо четные числа
    @Test
    void checkFunctionTrue() {
        assertTrue(mainHW.evenOddNumber(4));
        assertTrue(mainHW.evenOddNumber(0));
        assertTrue(mainHW.evenOddNumber(-8));
    }

    // Немного извращений =)
    @Test
    void checkFunctionTrueInCycle() {
        for (int i = -100; i < 100; i+=2) {
            assertTrue(mainHW.evenOddNumber(i));
        }
    }

    // Проверка функции на заведомо НЕчетные числа
    @Test
    void checkFunctionFalse() {
        assertFalse(mainHW.evenOddNumber(300000001));
        assertFalse(mainHW.evenOddNumber(1001));
        assertFalse(mainHW.evenOddNumber(-455));
    }
    // Проверка функции на заведомо подходящий интервал
    @Test
    void checkFunctionIntervalTrue() {
        assertTrue(mainHW.numberInInterval(25));
        assertTrue(mainHW.numberInInterval(50));
        assertTrue(mainHW.numberInInterval(100));
    }
    // Проверка функции на заведомо НЕподходящий интервал
    @Test
    void checkFunctionIntervalFalse() {
        assertFalse(mainHW.numberInInterval(4));
        assertFalse(mainHW.numberInInterval(101));
    }
}