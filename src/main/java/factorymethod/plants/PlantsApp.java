package factorymethod.plants;

public class PlantsApp {

    public static void main(String[] args) {
        Plantsfactory plantsFactory = new Plantsfactory();
        Plants plant1 = plantsFactory.create(24);
        Plants plant2 = plantsFactory.create(328);


        System.out.println(plant1.toString());
        System.out.println(plant2.toString());

    }
}
