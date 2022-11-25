public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача1");
        int yearsOld = 16;
        if (yearsOld >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }
        if (yearsOld <18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");
        }

        // Задача 2
        System.out.println("Задача 2");
        int age = 8;
        if (age >= 7) {
            System.out.println("Ребёнок ходит в школу");
        }
        int time = 20;
        if (time >= 18) {
            System.out.println("Человек уже закончил школу и может отправляться в университет!");
        }
        int old = 29;
        if (old >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
        }

        // Задание 3
        System.out.println("Задание 3");
        int wagonCapacity = 102;
        int seat = 60;
        int standing = wagonCapacity-seat;
        int nowInTheTrainCar = 100;
        if (nowInTheTrainCar >60) {
            System.out.println("В вагоне можно ехать только стоя");
        }
        if (nowInTheTrainCar <=60) {
            System.out.println("В вагоне есть сидячие места");
        }
        if (nowInTheTrainCar ==102) {
            System.out.println("В вагоне нет свободных мест");
        }


    }
}