package az.edu.turing.module02.part01.lesson11;

import java.util.Random;

public class SeatApp {

    public static void main(String[] args) {

        String[] people = {
                "Fəxri Babayev", "Lala Hamidova", "Raminə Səlimova", "Seyran Xəlilzadə", "Gunay İskandarova", "Sənubər Abbasova",
                "Mammadov Famil", "Gülər Əbilova", "Rəvan Ağayev", "Ruslan Cerkezov", "Nicat Məcidov", "Yetər Nəbiyeva",
                "Ali Muradov", "Dilbar Mirzeyeva", "Aynur Mammadova", "Ella Piriyeva", "Tural Nəzərov", "Ömər Ələkbərov",
                "Rena Mehdiyeva", "Hüseynov Məhəmməd", "Rəvan Əliyev", "İbrahim Ələkbərov", "Pervin Bedelova"
        };
        int totalSeats = people.length;
        assignSeats(people, totalSeats);
    }

    public static void assignSeats(String[] people, int totalSeats) {
        boolean[] seatsAssigned = new boolean[totalSeats];
        Random random = new Random();

        for (String person : people) {
            int seat;
            do {
                seat = random.nextInt(totalSeats);
            } while (seatsAssigned[seat]);

            seatsAssigned[seat] = true;
            System.out.println(person + " - Seat " + (seat + 1));
        }
    }
}
