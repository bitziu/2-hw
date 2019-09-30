package com.company;

public class Main {

    public static void main(String[] args) {
        String name = "dadad";
        int Age = 35 , temperature =30;

        if ((Age >= 20 && Age <= 45) && temperature >= -20 && temperature <= 30) {
            System.out.println("Mojno gulyat' " + name);
        } else if ((Age < 20 && Age > 0) && temperature >= 0 && temperature < 28) {
            System.out.println("MOjno Gulyat'" + name );
        } else if ((Age > 45 && Age <= 115) && temperature > -10 && temperature< 25);
        System.out.println("Mojno gulyat'"+ name);
    }
}
