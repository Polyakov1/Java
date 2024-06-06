package org.example;
import  AnotherClass.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main
{
    enum Holiday {
        NONE,
        NEW_YEAR,
        MARCH_8,
        FEBRUARY_23,

        JUNE_6
    }

    public static void main(String[] args)
    {
        Seller[] sellers = {

                new Seller("Gay Richi", 35, "2223", "Mechanix"),
                new Seller("Gay Richi1", 35, "2223", "TRANSFORMER"),
                new Seller("Gay Richi2", 35, "2223", "TRANSFORMER"),
                new Seller("Gay Richi3", 35, "2223", "Mechanix")
        };

        LocalDate today = LocalDate.now();
        Holiday currentHoliday = getHoliday(today);

        greetSeller(sellers, currentHoliday);

    }
    static Holiday getHoliday(LocalDate date) {
        if (date.getMonthValue() == 1 && date.getDayOfMonth() == 1) {
            return Holiday.NEW_YEAR;
        } else if (date.getMonthValue() == 3 && date.getDayOfMonth() == 8) {
            return Holiday.MARCH_8;
        } else if (date.getMonthValue() == 2 && date.getDayOfMonth() == 23) {
            return Holiday.FEBRUARY_23;
        } else if ((date.getMonthValue() == 6 && date.getDayOfMonth() == 6)) {
            return Holiday.JUNE_6;
        } else {
            return Holiday.NONE;
        }
    }
    static void greetSeller(Seller[] sellers, Holiday holiday) {
        for (Seller seller : sellers) {
            if (holiday == Holiday.NEW_YEAR) {
                System.out.println("С Новым Годом, " + seller.getSurnameFirstNamePatronymic() + "!");
            } else if (holiday == Holiday.MARCH_8 && seller.getGender().equals("TRANSFORMER")) {
                System.out.println("С 8 марта, " + seller.getSurnameFirstNamePatronymic() + "!");
            } else if (holiday == Holiday.FEBRUARY_23 && seller.getGender().equals("Mechanix")) {
                System.out.println("С 23 февраля, " + seller.getSurnameFirstNamePatronymic() + "!");
            }else {
                System.out.println("Another Day");
            }
        }
    }

    // Мне лень использовать ООП и это последний день для сдачи, прошу пощадить, что пишу тут и таким способом. Спасибо.


}