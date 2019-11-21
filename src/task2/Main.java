package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("1 - додати товар");
            System.out.println("2 - видалити товар");
            System.out.println("3 - замінити товар");
            System.out.println("4 - сортувати за назвою");
            System.out.println("5 - сортувати за довжиною");
            System.out.println("6 - сортувати за шириною");
            System.out.println("7 - сортувати за вагою");
            System.out.println("8 - вивести елемент колекції");
            System.out.println("9 - вийти з програми");

            switch (sc.nextInt()){
                case 1:{
                    System.out.println();
                    Methods.addCommodity();
                    System.out.println();
                    Methods.showList();
                    break;
                }
                case 2:{
                    System.out.println();
                    Methods.removeCommodity();
                    System.out.println();
                    Methods.showList();
                    break;
                }
                case 3:{
                    System.out.println();
                    Methods.changeCommodity();
                    System.out.println();
                    Methods.showList();
                    break;
                }
                case 4:{
                    System.out.println();
                    System.out.println("Товар, відсортований за іменем");
                    Methods.sortByName();
                    Methods.showList();
                    break;
                }
                case 5:{
                    System.out.println();
                    System.out.println("Товар, відсортований за довжиною");
                    Methods.sortByLength();
                    Methods.showList();
                    break;
                }
                case 6:{
                    System.out.println();
                    System.out.println("Товар, відсортований за шириною");
                    Methods.sortByWidth();
                    Methods.showList();
                    break;
                }
                case 7:{
                    System.out.println();
                    System.out.println("Товар, відсортований за масою");
                    Methods.sortByWeight();
                    Methods.showList();
                    break;
                }
                case 8:{
                    System.out.println();
                    Methods.showCommodity();
                    break;
                }
                case 9:{
                    System.exit(0);
                    break;
                }
                default:{
                    System.out.println("Потрібно ввести число від 1 до 9");
                }
            }
        }
    }
}
