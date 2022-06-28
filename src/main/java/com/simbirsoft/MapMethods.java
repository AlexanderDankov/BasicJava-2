package com.simbirsoft;

import com.github.javafaker.Faker;

import java.util.*;

public class MapMethods {

    static Faker faker = new Faker();

    public static void main(String[] args) {

        Map<String, String> phoneBook = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            phoneBook.put(faker.name().fullName(), faker.phoneNumber().cellPhone());
        }

        System.out.println("Полный список контактов: Всего контактов - " + phoneBook.size());
        for(Map.Entry<String, String> entry: phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("\nПочистим список контактов: удалим записи, где номер меньше 14 символов. Теперь контактов - " + phoneBook.size());

        Collection<String> numbers = phoneBook.values();
        numbers.removeIf(number -> number.length() < 14);

        for(Map.Entry<String, String> entry: phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Map<String, String> sortedPhoneBook = new TreeMap<>(phoneBook);

        System.out.println("\nНаведем порядок. Отсоритруем список контактов в алфавитном порядке:");
        for(Map.Entry<String, String> entry: sortedPhoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
