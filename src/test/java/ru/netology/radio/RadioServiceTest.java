package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioServiceTest {

    @Test
    public void shouldSetStation0() {
        RadioService radio = new RadioService(0, 25, 10, 0, 100, 0);
        radio.setCurrentStation(-1);
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldSetStation10() {
        RadioService radio = new RadioService(10, 25, 10, 0, 100, 0);
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStation5() {
        RadioService radio = new RadioService(5, 25, 10, 0, 100, 0);
        radio.nextStation();
        assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldNextStation10() {
        RadioService radio = new RadioService(10, 25, 10, 0, 100, 0);
        radio.nextStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation5() {
        RadioService radio = new RadioService(5, 25, 10, 0, 100, 0);
        radio.prevStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    public void shouldPrevStation0() {
        RadioService radio = new RadioService(0, 25, 10, 0, 100, 0);
        radio.prevStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    public void shouldSetVolume100() {
        RadioService radio = new RadioService(4, 100, 10, 0, 100, 0);
        radio.setCurrentVolume(101);
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldSetVolume0() {
        RadioService radio = new RadioService(4, 0, 10, 0, 100, 0);
        radio.setCurrentVolume(-1);
        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void shouldUpVolume60() {
        RadioService radio = new RadioService(4, 60, 10, 0, 100, 0);
        radio.upVolume();
        assertEquals(61, radio.getCurrentVolume());
    }

    @Test
    public void shouldUpVolume100() {
        RadioService radio = new RadioService(4, 100, 10, 0, 100, 0);
        radio.upVolume();
        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void shouldDownVolume60() {
        RadioService radio = new RadioService(4, 60, 10, 0, 100, 0);
        radio.downVolume();
        assertEquals(59, radio.getCurrentVolume());
    }

    @Test
    public void shouldDownVolume0() {
        RadioService radio = new RadioService(4, 0, 10, 0, 100, 0);
        radio.downVolume();
        assertEquals(0, radio.getCurrentVolume());
    }

}