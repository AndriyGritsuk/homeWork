public class Calculation {

    private int coating;
    private static String type;
    private float budget;
    private static String frameSize;
    private int height;
    private static Bicycle usersBicycle;

    public static String calculationTypeOfBicycle(int coating) {
        switch (coating) {

            case 1:
                type = "mtb";
                break;
            case 2:
                type = "road bike";
                break;
            case 3:
                type = "gravel";
                break;
            case 4:
                type = "city bike";
                break;
            case 5:
                type = "touring";
                break;
        }
        return type;
    }

    public static String calculationSizeOfBicycle(int height) {

            if (height >= 158 && height < 170){
                frameSize = "Your frame size is S";
            } else if (height >= 170 && height < 180){
                frameSize = "Your frame size is M";
            } else if (height >= 180 && height < 190) {
                frameSize = "Your frame size is L";
            } else if (height >= 190 && height < 210) {
                frameSize = "Your frame size is XL";
            }

            return frameSize;
        }

    public static Bicycle selectBicycle (int coating, int height, float budget) {
        type = calculationTypeOfBicycle(coating);
            frameSize = calculationSizeOfBicycle(height);
        budget = budget;
        for (Bicycle bicycle : ExistingBicycles.typesOfBicycles){
            if (type == bicycle.getType() && budget >= bicycle.getPrice()){
                usersBicycle = new Bicycle(bicycle.getModel(),
                                                   frameSize,
                                                   bicycle.getLink(),
                                                   bicycle.getPrice(),
                                                   type);
            }
        }
    return usersBicycle;
    }
}



