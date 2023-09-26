public enum Season {
    WINTER(-30), SUMMER(35), AUTUMN(20), SPRING(25);

    int temperature;

    Season(int temperature){
        this.temperature = temperature;
    }

    int getTemperature(){
        return temperature;
    }
}
