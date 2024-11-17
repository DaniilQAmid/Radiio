package ru.netology.javaqa.Radiio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetRadioStationNumber(){
        Radio radio = new Radio();

        radio.setRadioStationNumber(10);

        int expected = 0;
        int actual = radio.getRadioStationNumber();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume(){
        Radio radio = new Radio();

        radio.setVolume(1009);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadioStationNumber(){
        Radio radio = new Radio();

        radio.setToMaxRadioStationNumber();

        int expected = 9;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume(){
        Radio radio = new Radio();

        radio.setToMaxVolume();

        int expected = 100;
        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseRadioStationNumber(){
        Radio radio = new Radio();

        radio.radioStationNumber = 9;
        radio.increaseRadioStationNumber();

        int expected = 0;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseRadioStationNumber(){
        Radio radio = new Radio();

        radio.radioStationNumber = 0;
        radio.decreaseRadioStationNumber();

        int expected = 9;
        int actual = radio.radioStationNumber;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume(){
        Radio radio = new Radio();

        radio.volume = 100;
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume(){
        Radio radio = new Radio();

        radio.volume = 100;
        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.volume;

        Assertions.assertEquals(expected, actual);
    }

}
