package singleton.example;

public class TestHouse {

    public static void main(String[] args) {
        House house1 = House.getSingleton().get(12);
        house1.displayHouseDim();
        House house2 = House.getSingleton().get(39);
        house2.displayHouseDim();
        House house3 = House.getSingleton().get(13);
        house3.displayHouseDim();
        System.out.println(house1.hashCode());
        System.out.println(house2.hashCode());
        System.out.println(house3.hashCode());
    }
}
