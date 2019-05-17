import java.util.Scanner;

public class BicycleSelection {

    public static void main(String[] args) throws Exception {

        int coating;
        int height;
        float budget;

        System.out.println("Hello! You decide to buy a bike and our application can help you to choose your new" + "  two wheller friend. \n\n" + "Select coverage's type you will ride on from the list and enter this number:");


        while (true) {
            try {
                Scanner in = new Scanner(System.in);

                System.out.println("1. Parks, forest paths, dirt roads\n" + "2. Asphalt\n" + "3. Gravel, bad roads, short trips\n" + "4. City\n" + "5. Long trips\n" + "--------------");
                coating = in.nextInt();
                if (coating < 1 || coating > 5)
                    throw new Exception("Please, enter number more than 1 and less than 5.");

                System.out.println("Enter your height (cm):");
                height = in.nextInt();
                if (height < 158 || height > 210)
                    throw new Exception("Please, enter height more than 158 and less than 210.");

                System.out.println("Enter your budget (UAH):");
                budget = in.nextInt();
                if (budget < 7000) throw new Exception("Please, enter budget more than 7 000.");

                Bicycle yourBicycle = Calculation.selectBicycle(coating, height, budget);
                System.out.println("Your bicycle: " + yourBicycle.getModel() + "\n" +
                        "Frame size: " + yourBicycle.getSize() + "\n" +
                        "More information is available here: " + yourBicycle.getLink()
                );

                continue;
            }
            catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }


    }
}



