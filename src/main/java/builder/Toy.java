package builder;

public class Toy {

    private String name;
    private String description;

    private String color;
    private String madeFrom;

    private int height;
    private int length;

    private int width;

    private int weight;


    public Toy() {}

    public Toy(String name, String description, String color, String madeFrom, int height, int length, int width, int weight) {
        this.name = name;
        this.description = description;
        this.color = color;
        this.madeFrom = madeFrom;
        this.height = height;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }


    // 1. declare an inner class named following the pattern Class+ Builder => ToyBuilder
    public static class ToyBuilder {

        // 2. declare the same fields as the ones in the class we want to build
        private String name;
        private String description;

        private String color;
        private String madeFrom;

        private int height;
        private int length;

        private int width;

        private int weight;


        // 3. for each of the properties, create a setter that sets the value and then returns "this"
        public ToyBuilder setName(String aName) {
            this.name = aName;
            return this;
        }

        public ToyBuilder setDescription(String aDescription) {
            this.description = aDescription;
            return this;
        }

        public ToyBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public ToyBuilder setMadeFrom(String madeFrom) {
            this.madeFrom = madeFrom;
            return this;
        }

        public ToyBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public ToyBuilder setLength(int length) {
            this.length = length;
            return this;
        }

        public ToyBuilder setWidth(int width) {
            this.width = width;
            return this;
        }

        public ToyBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        // 4. create a build method with no params
        // that return an instance of the class we build
        public Toy build() {
            Toy toy = new Toy();
            toy.name = this.name;
            toy.description = this.description;
            toy.color = this.color;
            toy.madeFrom = this.madeFrom;
            toy.height = this.height;
            toy.length = this.length;
            toy.width = this.width;
            toy.weight = this.weight;
            return toy;
        }
    }
}
