package ro.jademy.carRent;

import ro.jademy.carRent.car.Audi.A4;
import ro.jademy.carRent.car.Audi.A6;
import ro.jademy.carRent.car.Audi.Audi;
import ro.jademy.carRent.car.Car;
import ro.jademy.carRent.car.CarState;
import ro.jademy.carRent.car.Dacia.Dacia;
import ro.jademy.carRent.car.Dacia.Duster;
import ro.jademy.carRent.car.Dacia.Sandero;
import ro.jademy.carRent.car.Engine;
import ro.jademy.carRent.people.Salesman;

import java.math.BigDecimal;
import java.util.*;

public class Shop {
    //hashSet
    private ArrayList<Salesman> salesmens = new ArrayList<>();
    private ArrayList<Dacia> daciaCars = new ArrayList<>();
    private ArrayList<Audi> audiCars = new ArrayList<>();
    //hashMap
    private ArrayList<Car> carList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Shop() {
        Salesman s1 = new Salesman("Dogaru", "Catalina", "dc", "123");
        Salesman s2 = new Salesman("Filip", "Ion", "fc", "1234");
        Salesman s3 = new Salesman("Slavescu", "Marius", "sm", "12345");
        salesmens.addAll(Arrays.asList(s1, s2, s3));

        Car duster = new Duster("Dacia", "Duster", "SUV",
                new Engine(105, 1598), 5, "gasoline",
                "Orange Atacama", "manual", 2018, new BigDecimal(22000),
                "Available");

        Car sandero = new Sandero("Dacia", "Sandero", "SUV",
                new Engine(90, 1461), 5, "diesel",
                "Gris Platine", "automatic", 2016, new BigDecimal(20000),
                "Available");
        //daciaCars.addAll(Arrays.asList(duster, sandero));

        Car a4 = new A4("Audi", "A4", "Sedan",
                new Engine(110, 1896), 4, "diesel",
                "Gray", "automatic", 2017, new BigDecimal(18000),
                "Available");
        Car a6 = new A6("Audi", "A6", "Sedan",
                new Engine(133, 2309), 4, "gasoline",
                "Yellow", "manual", 2017, new BigDecimal(18000),
                "Rented");
        // audiCars.addAll(Arrays.asList(a4, a6));

        carList.addAll(Arrays.asList(duster, sandero, a4, a6));
    }

    public boolean login() {
        boolean isLogin=false;
        do {
            // TODO: implement a basic user login
            // Scanner scan = new Scanner(System.in);
            System.out.println("Please enter your username and your password");
            System.out.println("Username:");

            String username = sc.nextLine();
            for (Salesman salesman : salesmens) {
                if (username.equals(salesman.getUsername())) {
                    System.out.println("Password:");
                    String password = sc.nextLine();
                    if (password.equals(salesman.getPassword())) {
                        System.out.println(username + " successfully logged in.");
                        isLogin=true;
                        return false;
                    }
                }
            }
            System.out.println("Wrong username or password , try again.");
        }while(isLogin==false);

        return true;
    }

    public void carRental() {

        System.out.println();

        System.out.println("Enter the desired car  model ");

        String carModel = sc.next();


        GregorianCalendar startDate = new GregorianCalendar();

        GregorianCalendar endDate = new GregorianCalendar();

        for (Car car : carList) {

            if (car.getModel().equals(carModel)) {

                System.out.println("Enter start date");

                startDate = dateEnter();

                System.out.println("Enter end date");

                endDate = dateEnter();

                car.rentCar(startDate, endDate);

                System.out.println(startDate.getTime());

                System.out.println(endDate.getTime());

                showHeader();

                car.showCarSpecifications();

            }

        }

    }


    public GregorianCalendar dateEnter() {

        GregorianCalendar date = new GregorianCalendar();

        System.out.println("Enter Year ");

        int year = sc.nextInt();

        System.out.println("Enter Month ");

        int month = sc.nextInt();

        System.out.println("Enter Day ");

        int day = sc.nextInt();

        date.set(GregorianCalendar.YEAR, year);

        date.set(GregorianCalendar.MONTH, (month - 1));

        date.set(GregorianCalendar.DATE, day);

        return date;


    }


    public void showMenu() {

        System.out.println(" -----------------------------------------------");
        System.out.println("|    Welcome to the Jademy Car Rental Service   |");
        System.out.println(" -----------------------------------------------");
        System.out.println();
        System.out.println("                    MAIN MENU                   ");
        System.out.println("1. List all carList");
        System.out.println("2. List available carList");
        System.out.println("3. List rented carList");
        System.out.println("4. Check income");
        System.out.println("5. Login");
        System.out.println("6. Logout");
        System.out.println("7. Exit");
        optionMenu();
    }

    public void optionMenu() {
        System.out.println("Insert the number:");

        int number = sc.nextInt();
        switch (number) {
            case 1:
                showListAllCars();
                showFiterMenu();
                break;
            case 2:
                showListAvailableCars();
                break;

            case 3:
                showListRentedCars();
                break;
            case 4:
                checkIncome();
                break;
            case 5:
                login();
                break;
            case 6:
                logout();
                break;
            case 7:
                System.exit(0);
                break;
        }
    }

    public void showListAllCars() {
        //System.out.println();
        showHeader();
        for (Car car : carList) {
            car.showCarSpecifications();
        }
    }

    public void showHeader() {
        String header = String.format("|| %-10s || %-10s || %-10s || %-28s || %-5s || %-10s || %-15s || %-15s || %-10s " +
                        "|| %-10s || %-10s ||", "MAKE", "MODEL", "CARTYPE", "ENGINE(HorsePawer/Capacity)",
                "DOORS", "FUELTYPE", "COLOR", "TRANSMISIONTYPE", "YEAR", "BASEPRICE", "AVAILABLE");
        String header1 = String.format("|| %-38s || %-12s || %-12s ||", " ", "HorsePawer", "Capacity");
        System.out.println("------------------------------------------------------------------------------------------" +
                "-----------------------------------------------------------------------------------------");
        System.out.println(header);
        System.out.println("------------------------------------------------------------------------------------------" +
                "-----------------------------------------------------------------------------------------");
        System.out.println(header1);
        System.out.println("==========================================================================================" +
                "=========================================================================================");
    }

    public void showListAvailableCars() {
        showHeader();
        System.out.println();
        for (Car car : carList) {
            if (car.getAvailability().equals("Available")) {
                car.showCarSpecifications();
            }
        }
    }

    public void showListRentedCars() {
        showHeader();
        System.out.println();
        for (Car car : carList) {
            if (car.getAvailability().equals("Rented")) {
                car.showCarSpecifications();
            }
        }
    }

    public void checkIncome() {

        BigDecimal sum = new BigDecimal(0);

        BigDecimal finalPrice = new BigDecimal(0);

        CarState carState = new CarState();

        for (Car car : carList) {

            if (car.getCarState().isRented()) {

                GregorianCalendar startDate = carState.getStartDate();

                GregorianCalendar endDate = carState.getStartDate();
                ;

                finalPrice = daysBetween(startDate, endDate).multiply(car.getBasePrice());

                sum = sum.add(finalPrice);

                System.out.println(sum);

            }

        }

    }

    public BigDecimal check(BigDecimal n) {
        return null;
    }

    public void logout() {

    }


    public void showFiterMenu() {

        System.out.println("Select an action from below:");
        System.out.println("1. Filter by make");
        System.out.println("2. Filter by model");
        System.out.println("3. Filter by budget");
        // TODO: add additional filter methods based on car specs

        System.out.println("4. Back to previous menu");
        System.out.println("Insert the number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        optionsListMenu(number);
    }

    public void optionsListMenu(int number) {

        //int number = 0;
        switch (number) {
            case 1:
                showFilterByMake();
                break;
            case 2:
                showFilterByModel();
                break;
            case 3:
                showFilterByBudget();
                break;
            case 4:
                backToPreviousMenu();
                break;
        }
    }

    public void showFilterByMake() {
        System.out.println("Insert the desired car");

        String makeCar = sc.next();
        showHeader();
        System.out.println();
        for (Car car : carList) {
            if (car.getMake().equals(makeCar)) {
                car.showCarSpecifications();
            }
        }
    }

    public void showFilterByModel() {
        System.out.println("Insert the desired car");

        String modelCar = sc.next();
        showHeader();
        System.out.println();
        for (Car car : carList) {
            if (car.getModel().equals(modelCar)) {
                car.showCarSpecifications();
            }
        }
    }

    public void showFilterByBudget() {
        System.out.println();

        System.out.println("Enter the available amount");
        BigDecimal availableAmount = sc.nextBigDecimal();
        showHeader();
        for (Car car : carList) {
            if (car.getBasePrice().compareTo(availableAmount) == -1
                    || car.getBasePrice().compareTo(availableAmount) == 0) {
                car.showCarSpecifications();
            }
        }
    }

    public BigDecimal daysBetween(GregorianCalendar startDate, GregorianCalendar endDate) {

        long differenceInSeconds = (endDate.getTimeInMillis() - startDate.getTimeInMillis()) / (1000 * 60 * 60 * 24);

        return new BigDecimal(differenceInSeconds);


    }

    public void sortCarListDefault() {
        Collections.sort(carList);
        showHeader();

        for (Car car : carList) {
            car.showCarSpecifications();
        }
    }

    public void backToPreviousMenu() {
        showMenu();
    }
}
