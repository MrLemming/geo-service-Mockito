package ru.netology.i18n;

import org.junit.jupiter.api.*;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationServiceImpl;

@DisplayName("Тестирование: LocalizationServiceImpl")
public class LocalizationServiceImplTest {
    private Country country;
    private LocalizationServiceImpl localizationService;

    @BeforeEach
    void setUp() {
        localizationService = new LocalizationServiceImpl();
        System.out.println("Вызываюсь до выполнения теста");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Вызываюсь после вызова теста");
    }

    @Test
    @DisplayName("Тестирование на русский текст")
    void testRus() {
        country = Country.RUSSIA;
        Assertions.assertEquals("Добро пожаловать", localizationService.locale(country));
    }

    @Test
    @DisplayName("Тестирование на английский текст")
    void testEng() {
        country = Country.GERMANY;
        Assertions.assertEquals("Welcome", localizationService.locale(country));
    }
}