package ru.netology.geo;

import org.junit.jupiter.api.*;
import ru.netology.entity.Country;
import ru.netology.geo.GeoServiceImpl;

class GeoServiceImplTest {

    private static final String MOSCOW_IP = "172.0.32.11";
    private static final String NEW_YORK_IP = "96.44.183.149";
    private static final String RUSSIA_IP = "172.0.0.0";
    private GeoServiceImpl geoServiceImpl;

    @BeforeEach
    void setUp() {
        geoServiceImpl = new GeoServiceImpl();
        System.out.println("Вызываюсь до выполнения теста");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Вызываюсь после вызова теста");
    }

    @Test
    @DisplayName("Тестирование IP из Москвы")
    void testIPMoscow() {
        Assertions.assertEquals("Moscow", geoServiceImpl.byIp(MOSCOW_IP).getCity());
    }

    @Test
    @DisplayName("Тестирование IP из Нью-Йорка")
    void testIPNewYork() {
        Assertions.assertEquals("New York", geoServiceImpl.byIp(NEW_YORK_IP).getCity());
    }

    @Test
    @DisplayName("Тестирование IP из России")
        void testIPAmerica() {
        Assertions.assertEquals(Country.RUSSIA, geoServiceImpl.byIp(RUSSIA_IP).getCountry());
    }
}