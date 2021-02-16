public class Car 
{
    private String paintColor;
    private String carBrand;
    private String carModel;
    private String wheelType;

    public Car(String paintColor, String carBrand, String carModel, String wheelType)
    {
        setPaintColor(paintColor);
        setCarBrand(carBrand);
        this.carModel = carModel;
        this.wheelType = wheelType;
    }

    public void paintColor(String paintColor)
    {
        this.paintColor = paintColor;
    }

    public void carBrand(String carBrand)
    {
        this.carBrand = carBrand;
    }

    public String getCarModel()
    {
        return carModel;
    }

    public String getWheelType()
    {
        return wheelType;
    }

    public void startEngine()
    {
        twoStartEngine();
    }

    public void drive()
    {
        oneDrive();
    }

    public static void main(String args[])
    {
        Car ElonMusk = new Car("red", "Toyota", "electric", "Alloy")
        ElonMusk.setPaintColor("blue");
        ElonMusk.setCarBrand("Tesla");
        System.out.println(ElonMusk.getCarModel());
        System.out.println(ElonMusk.getWheelType());
        ElonMusk.startEngine
        ElonMusk.drive
    }
    public static void startEngine()
    {
        System.out.println("vroom");
        System.out.println("vroom");
    }
    public static void drive()
    {
        System.out.println("drive");
    }
}