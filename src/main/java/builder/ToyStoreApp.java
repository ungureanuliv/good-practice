package builder;

public class ToyStoreApp {
    public static void main(String[] args) {
        Toy carToy = new Toy("Blue car", "The perfect toy for a car lover", "blue",
                "plastic", 15, 25, 10, 200);

        // 1. to many params can cause to create objects with values in wrong order
        // we've switched the madeFrom with the color
        Toy carToy2 = new Toy("Blue car", "The perfect toy for car lovers",
                "blue", "plastic", 15, 25, 10, 200 );


        //5. ue the builder, nor, the construct with a lot of params should be deleted,
        // but we keep it here so that the above lines also compile.

        Toy.ToyBuilder builder = new Toy.ToyBuilder ();

        builder.setName ("Blue car")
                .setDescription("The perfect toy for car lovers")
                .setColor("blue")
                .setMadeFrom("plastic")
                .setWeight(200)
                .setWidth(10)
                .setLength(25)
                .setHeight(15); //please note, that there's not; between the multiple invocations of the methods.

        Toy car3 = builder.build();


//        String name = "John" + "Doe";
//        StringBuilder sb = new StringBuilder();
//        sb.append("John")
//                .append("Doe");
//        String name2 = sb.toString();
    }
}
