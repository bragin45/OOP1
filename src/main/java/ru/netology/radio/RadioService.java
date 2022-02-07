package ru.netology.radio;

public class RadioService {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            currentStation = 0;
        }
        if (currentStation > 9) {
            currentStation = 9;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        this.currentStation = currentStation + 1;
        if (currentStation > 9) {
            this.currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation == 0) {
            this.currentStation = 9;
        } else {
            this.currentStation = currentStation - 1;
        }

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    public void upVolume() {
        if (currentVolume < 10) {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void downVolume() {
        if (currentVolume > 0) {
            this.currentVolume = currentVolume - 1;
        }
    }

}
