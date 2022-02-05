package ru.netology.radio;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioServiceTest {

    @ParameterizedTest
    @CsvSource(value = {
            "limit values,-1,0",
            "limit values,0,0",
            "limit values,1,1",
            "limit values,8,8",
            "limit values,9,9",
            "limit values,10,9",
    })

    public void shouldSetStation(String testName, int currentStation, int expected) {
        RadioService radio = new RadioService();
        radio.setCurrentStation(currentStation);
        assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "limit values,0,1",
            "limit values,1,2",
            "limit values,8,9",
            "limit values,9,0",
    })

    public void shouldNextStation(String testName, int currentStation, int expected) {
        RadioService radio = new RadioService();
        radio.setCurrentStation(currentStation);
        radio.nextStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "limit values,0,9",
            "limit values,1,0",
            "limit values,8,7",
            "limit values,9,8",
    })

    public void shouldPrevStation(String testName, int currentStation, int expected) {
        RadioService radio = new RadioService();
        radio.setCurrentStation(currentStation);
        radio.prevStation();
        assertEquals(expected, radio.getCurrentStation());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "limit values,-1,0",
            "limit values,0,0",
            "limit values,1,1",
            "limit values,9,9",
            "limit values,10,10",
            "limit values,11,10",
    })

    public void shouldSetVolume(String testName, int currentVolume, int expected) {
        RadioService radio = new RadioService();
        radio.setCurrentVolume(currentVolume);
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "limit values,0,1",
            "limit values,1,2",
            "limit values,9,10",
            "limit values,10,10",
    })

    public void shouldUpVolume(String testName, int currentVolume, int expected) {
        RadioService radio = new RadioService();
        radio.setCurrentVolume(currentVolume);
        radio.upVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(value = {
            "limit values,0,0",
            "limit values,1,0",
            "limit values,9,8",
            "limit values,10,9",
    })

    public void shouldDownVolume(String testName, int currentVolume, int expected) {
        RadioService radio = new RadioService();
        radio.setCurrentVolume(currentVolume);
        radio.downVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

}