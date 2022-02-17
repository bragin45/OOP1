package ru.netology.radio;

public class RadioService {

    private int currentStation;
    private int currentVolume;
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int numberStation = maxStation + 1;

    public RadioService() {

    }

    public RadioService(int numberStation) {
        this.numberStation = maxStation + 1;

    }

    public int getNumberStation() {
        return numberStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {
        this.currentStation = currentStation + 1;
        if (currentStation > maxStation) {
            this.currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation == minStation) {
            this.currentStation = maxStation;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume > maxVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void upVolume() {
        if (currentVolume < maxVolume) {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void downVolume() {
        if (currentVolume > minVolume) {
            this.currentVolume = currentVolume - 1;
        }
    }

}
