package ru.netology.javaqa.Radiio;

public class Radio {
    public int radioStationNumber;
    public int volume;

    public int getRadioStationNumber(){
        return radioStationNumber;
    }

    public int getVolume(){
        return volume;
    }

    public void setRadioStationNumber(int newRadioStationNumber){
        if (newRadioStationNumber < 0) {
            return;
        }
        if (newRadioStationNumber > 9) {
            return;
        }
        radioStationNumber = newRadioStationNumber;
    }

    public void setVolume(int newVolume){
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void setToMaxRadioStationNumber(){
        radioStationNumber = 9;
    }

    public void setToMaxVolume(){
        volume = 100;
    }

    public void increaseRadioStationNumber() {
        if (radioStationNumber <= 9) {
            radioStationNumber = radioStationNumber + 1;
        }
        if (radioStationNumber > 9) {
            radioStationNumber = 0;
        }
    }

    public void decreaseRadioStationNumber(){
        if (radioStationNumber <= 9) {
            radioStationNumber = radioStationNumber - 1;
        }
        if (radioStationNumber < 0) {
            radioStationNumber = 9;
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume(){
        if (volume <= 100) {
            volume = volume - 1;
        }
        if (volume <= 0) {
            volume = 0;
        }
    }

}
