public class Cardriver {

public static void main(String [] args) {
    Car myCar = new Car();
    Car hisCar = new Car ("Black", 650,6.5,"Ferria");
    Car herCar = new Car ("Pink " ,300,2.5 , "Volks");

    System.out.println(myCar);
    System.out.println(hisCar);
    System.out.println(herCar);

   myCar.setColor("Blue"); myCar.setHorsePower (650); myCar.setEngineSize(6.5);myCar.setMake("Ferrari");

    System.out.println(myCar.getColor() + " " + myCar.getHorsePower() + " " +  myCar.getEngineSize() + " " + myCar.getMake());
    System.out.println(hisCar.getColor() + " " + hisCar.getHorsePower() + " " +  myCar.getEngineSize() + " " + hisCar.getMake());
    System.out.println(herCar.getColor() + " " + herCar.getHorsePower() + " " +  herCar.getEngineSize() + " " + herCar.getMake());

}



}












