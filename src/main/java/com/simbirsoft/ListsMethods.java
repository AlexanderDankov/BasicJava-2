package com.simbirsoft;

import java.util.*;

public class ListsMethods {

    static Scanner scanner = new Scanner(System.in);
    static int command;

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        System.out.println("Создадим коллекцию из 5 слов");

        for (int i = 0; i < 5; i++) {
            System.out.print("Введите " + (i+1) + " слово:");
            String word = scanner.nextLine();
            words.add(i, word);
        }

        System.out.print("Наша коллекция готова: ");
        System.out.println(words);

        do {
            System.out.println("\nВыберите, что вы хотите сделать с коллекцией:");
            System.out.println("1 - Отсортировать в алфавитном порядке по возрастанию");
            System.out.println("2 - Отсортировать в алфавитном порядке по убыванию");
            System.out.println("3 - Добавить слово в коллекцию");
            System.out.println("4 - Убрать слово из коллекции");
            System.out.println("5 - Посчитать кол-во элементов в коллекции");
            System.out.println("6 - Вывести самое маленькое слово");
            System.out.println("7 - Вывести самое большое слово");
            System.out.println("8 - Удалить все элементы из коллекции");
            System.out.println("9 - Вывести список уникальных слов");
            System.out.println("10 - Получить часть списка по индексам");
            System.out.println("0 - Выход");
            System.out.print("Введите номер пункта меню: ");
            command = scanner.nextInt();

            switch (command) {
                case 1 -> sortAlphabetical(words);
                case 2 -> sortReverseAlphabetical(words);
                case 3 -> addWord(words);
                case 4 -> removeWord(words);
                case 5 -> System.out.println("Количество элементов: " + words.size());
                case 6 -> System.out.println("Самое маленькое слово в коллекции: " + minValue(words));
                case 7 -> System.out.println("Самое большое слово в коллекции: " + maxValue(words));
                case 8 -> removeAll(words);
                case 9 -> System.out.println("Уникальные значения в списке: " + uniqueList(words));
                case 10 -> getSublist(words);
                case 0 -> System.out.println("Пока!");
                default -> System.out.println("Некорректное значение, попробуйте еще раз!");
            }

        } while (command !=0);
    }

    public static void sortAlphabetical(List<String> words) {
        Collections.sort(words);
        System.out.println("Отсортированная в алфавитном порядке по возрастанию коллекция:");
        System.out.println(words + "\n");
    }

    public static void sortReverseAlphabetical(List<String> words) {
        words.sort(Collections.reverseOrder());
        System.out.println("Отсортированная в алфавитном порядке по убыванию коллекция:");
        System.out.println(words + "\n");
    }

    public static void addWord(List<String> words) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nВведите слово, которое хотите добавить: ");
        String word = sc.nextLine();
        words.add(word);
        System.out.println("Обновленная коллекция: " + words);
    }
    public static void removeWord(List<String> words) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nВведите слово, которое хотите убрать: ");
        String word = sc.nextLine();
        words.remove(word);
        System.out.println("Обновленная коллекция: " + words);
    }

    public static String minValue(List<String> words) {
       int min = words.get(0).length();
       String minValue = "";
        for (String next : words) {
            if (next.length() < min) {
                minValue = next;
            }
        }
        return minValue;
    }

    public static String maxValue(List<String> words) {
        int max = words.get(0).length();
        String maxValue = "";
        for (String next : words) {
            if (next.length() > max) {
                maxValue = next;
            }
        }
        return maxValue;
    }

    public static void removeAll(List<String> words) {
        words.clear();
        System.out.println("\nНаша коллекция теперь пустая: " + words);
    }

    public static Set<String> uniqueList(List<String> words) {
        return new HashSet<>(words);
    }

    public static void getSublist(List<String> words) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nРазмер нашего списка: " + words.size() + ". Список: " + words);
        System.out.println("Введите номер начального элемента:");
        int firstIndex = sc.nextInt() - 1;
        System.out.println("Введите номер конечного элемента:");
        int secondIndex = sc.nextInt();
        System.out.println("Часть списка по указанным номерам элементов: " + words.subList(firstIndex, secondIndex));
    }
}
