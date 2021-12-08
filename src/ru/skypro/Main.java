package ru.skypro;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Задание один");

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("Задание два");

        String fullName1 = fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName1);

        System.out.println("Задание три");

        String fullName2 = fullName.replace(" ","; ");
        System.out.println("Данные ФИО сотрудника для административного отдела — " + fullName2);

        System.out.println("Задание четыре");

        String fullName3 = ("Иванов Семён Семёнович");
        String fullName4 = fullName3.replace ("ё","e");
        System.out.println("Данные ФИО сотрудника — " + fullName4);
    }
}