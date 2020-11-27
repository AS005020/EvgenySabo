package Git04.AggregationAndComposition.Task2;

public class Car {
    String brand;
    Engine engine;
    Wheel[] wheels;
    double tank;
    int borderTank = 60;

    public Car(String brand) {
        this.brand = brand;
        initialization();
    }

    public void initialization(){
        engine = new Engine();
        wheels = new Wheel[4];
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel();
        }
        setTank(60);

    }


    public void showBrand(){
        System.out.println("Марка автомобиля " + brand);
        System.out.println();
    }

    public double getTank() {
        return tank;
    }

    public void fillTank(double tank) {
        double sumFuel = this.tank + tank;
        if(sumFuel>borderTank) {
            System.out.println("Вы перелили " + (sumFuel - borderTank) + " бензина");
            sumFuel = borderTank;
        }
        setTank(sumFuel);
    }

    public void setTank(double tank) {
        this.tank = tank;
    }

    public void toDrive(double m){
      double posipility  = tank/ engine.fuelСonsumptionPerMeter;
      double different = posipility-m;
      double rideMeter = 0;
      if(different <= 0) {
          System.out.println("У вас кончился бензин");
          rideMeter = posipility;
          setTank(0);
      }
      else{
          setTank(tank-m*engine.fuelСonsumptionPerMeter);
          rideMeter = m;

      }
        System.out.println("Вы проехали " + rideMeter + " метров");
        System.out.println("В баке " + getTank() +  " литров");
        wheelWear(rideMeter);
        this.showWearWheels();
    }

    private void wheelWear(double rideMeter){
        for (int i = 0; i < wheels.length; i++) {
            wheels[i].wearOnMeter(rideMeter);
        }
    }

    public void showWearWheels(){
        System.out.println("Износ шин");
        for (int i = 0; i < wheels.length; i++) {
            if(!wheels[i].isAlive)
                System.out.println("Шина взорвана");
            else
                System.out.println(wheels[i].getDurability()+"/"+wheels[i].maxWear);
        }
        System.out.println();
    }

    public void changeWheel(Wheel wheel){
        double minDurability = wheels[0].getDurability();
        int minInd = 0;
        for (int i = 1; i < wheels.length; i++) {
            if(minDurability > wheels[i].getDurability())
            {
                minDurability = wheels[i].getDurability();
                minInd = i;
            }
        }
        wheels[minInd] = wheel;
        this.showWearWheels();
    }

    public void refuel(double litr){
        System.out.println("Заправка на " + litr + " литров");
        fillTank(litr);
    }
}
