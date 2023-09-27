package builder2;

public class PlantApp {
    public static void main(String[] args) {

        Plant.PlantBuilder builder = new Plant.PlantBuilder();
        builder.setName("papadie")
                .setSpecies("buruiana")
                .setGenus("planta")
                .setColor("yellow");

        Plant plantaNoastra = builder.build();
        }
    }

