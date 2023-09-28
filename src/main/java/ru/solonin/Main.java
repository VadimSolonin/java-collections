package ru.solonin;

public class Main {
    public static void main(String[] args) {

        Sony sonyA7 = new Sony("Alpha a7", "Mirrorless", 237900);
        Sony sonyA7_usedGoods = new Sony("Alpha a7 used goods", "Mirrorless", 137900);

        Sony sonyZVE1 = new Sony("Sony ZV-E1", "Mirrorless", 200900);
        Sony sonyZVE1_usedGoods = new Sony("Sony ZV-E1 used goods", "Mirrorless", 100900);

        Sony alphaSLTA99 = new Sony("Sony Alpha SLT-A99", "Single-Lens Reflex", 87896);
        Sony alphaSLTA99_usedGoods = new Sony("Sony Alpha SLT-A99 used goods", "Single-Lens Reflex", 57896);

        Sony alphaA6700 = new Sony("Sony Alpha a6700", "Mirrorless", 205590);
        Sony alphaA6700_usedGoods = new Sony("Sony Alpha a6700 used goods", "Mirrorless", 105590);


        Yarkiy yarkiy = new Yarkiy("St. Petersburg, Bolshaya Monetnaya st., 16", 3243309);
        Dns dns = new Dns("St. Petersburg, Bolshoy Prospekt P.S., 98, ", 707999);
        Eldorado eldorado = new Eldorado("St. Petersburg, Kolomyazhsky Ave. 17", 2502525);
        Mvideo mvideo = new Mvideo("St. Petersburg, st. Academician Pavlova, 5 lit. B", 6007775);

        System.out.println("Ниже представлена реализация в классе DNS цикла `for each` с коллекцией Map.");
        System.out.println("Добавим несколько моделей камер. Map:");
        dns.addSonyModel(sonyA7);
        dns.addSonyModel(sonyA7_usedGoods);
        dns.printCameraNames();
        System.out.println("Элемент `Alpha a7 used goods` есть в Map?");
        dns.findMapValue(sonyA7_usedGoods);
        System.out.println("Теперь удалим элемент.");
        dns.deleteMapValue(sonyA7_usedGoods);
        System.out.println("Результат Map после удаления:");
        dns.printCameraNames();

        System.out.println(" ");
        System.out.println("Ниже представлена реализация в классе Yarkiy цикла `for` с коллекцией List.");
        System.out.println("Добавим несколько моделей камер. List:");
        yarkiy.addSonyModel(sonyZVE1);
        yarkiy.addSonyModel(sonyZVE1_usedGoods);
        yarkiy.printCameraNames();
        System.out.println("Элемент `Sony ZV-E1 used goods` есть в List?");
        yarkiy.findListValue(sonyZVE1_usedGoods);
        System.out.println("Теперь удалим элемент.");
        yarkiy.deleteListValue(sonyZVE1_usedGoods);
        System.out.println("Результат List после удаления:");
        yarkiy.printCameraNames();

        System.out.println(" ");
        System.out.println("Ниже представлена реализация в классе Eldorado цикла `while` с коллекцией Set.");
        System.out.println("Добавим несколько моделей камер. Set:");
        eldorado.addSonyModel(alphaSLTA99);
        eldorado.addSonyModel(alphaSLTA99_usedGoods);
        eldorado.printCameraNames();
        System.out.println("Элемент `Sony Alpha SLT-A99 used goods` есть в Set?");
        eldorado.findSetValue(alphaSLTA99_usedGoods);
        System.out.println("Теперь удалим элемент.");
        eldorado.deleteSetValue(alphaSLTA99_usedGoods);
        System.out.println("Результат Set после удаления:");
        eldorado.printCameraNames();

        System.out.println(" ");
        System.out.println("Ниже представлена реализация в классе Mvideo цикла 'do while' с коллекцией Queue.");
        System.out.println("Добавим несколько моделей камер. Queue:");
        mvideo.addSonyModel(alphaA6700);
        mvideo.addSonyModel(alphaA6700_usedGoods);
        mvideo.printCameraNames();
        System.out.println("Элемент `Sony Alpha a6700 used goods` есть в Queue?");
        mvideo.findQueueValue(alphaA6700_usedGoods);
        System.out.println("Теперь удалим элемент.");
        mvideo.deleteQueueValue(alphaA6700_usedGoods);
        System.out.println("Результат Queue после удаления:");
        mvideo.printCameraNames();
    }


}