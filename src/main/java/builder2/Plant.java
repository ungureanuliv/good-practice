package builder2;

import com.jogamp.nativewindow.UpstreamSurfaceHook;

public class Plant {

    private String name;
    private String species;
    private String genus;
    private String color;

    private Plant() {
    }
    public static class PlantBuilder {
        private String name;
        private String species;
        private String genus;
        private String color;

        public PlantBuilder setName(String name1)  {
            this.name = name1;
            return this;
        }

        public PlantBuilder setSpecies(String species) {
            this.species = species;
            return this;
        }

        public PlantBuilder setGenus(String genus) {
            this.genus = genus;
            return this;
        }

        public PlantBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public Plant build() {
            Plant plant = new Plant();
            plant.name = this.name;
            plant.species = this.species;
            plant.genus = this.genus;
            plant.color = this.color;
            return plant;
        }
    }
}
