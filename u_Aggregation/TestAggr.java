package u_Aggregation;

public class TestAggr {

    public static void main(String[] args) {

        MusicPlayer player=new MusicPlayer("Sony");

        Car breeza= new Car("Breeza",player);

        System.out.println("Car is "+breeza.getName());

        breeza.startPlayer();
        breeza.stopPlayer();












    }
}
