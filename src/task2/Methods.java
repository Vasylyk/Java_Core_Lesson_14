package task2;

import java.util.*;

public class Methods {
    static List<Commodity>list = new ArrayList<>();
    static private String nextInt;

    static void addCommodity(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишіть назву товару");
        String name = sc.nextLine();
        Iterator<Commodity>iterator=list.listIterator();
        while (iterator.hasNext()){
            if (iterator.next().getName().equalsIgnoreCase(name)){
                System.out.println("Такий товар вже існує");
                addCommodity();
            }
        }
        System.out.println("Напишіть довжину товару");
        int length = sc.nextInt();
        System.out.println("Напишіть ширину товару");
        int width = sc.nextInt();
        System.out.println("Напишіть масу товару");
        int weight = sc.nextInt();
        nextInt=sc.nextLine();
        list.add(new Commodity(name,length,width,weight));
    }

    static void removeCommodity(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Напишіть назву товару");
        String name = sc.nextLine();
        Iterator<Commodity>iterator=list.listIterator();
        boolean flag = true;
        while (iterator.hasNext()){
            Commodity next = iterator.next();
            if (next.getName().equalsIgnoreCase(name)){
                iterator.remove();
                flag=false;
            }
        }
        if (flag){
            System.out.println("Товару з таким іменем немає");
        }
    }

    static void changeCommodity() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Напишіть назву товару, який хочете замінити");
            String removeName = sc.nextLine();

            Iterator<Commodity> iterator = list.listIterator();
            boolean flag = true;
            while (iterator.hasNext()) {
                Commodity next = iterator.next();
                if (next.getName().equalsIgnoreCase(removeName)) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println("Товару з таким іменем немає");
                changeCommodity();
                throw new ChangeCommodityExcrption();
            }


            System.out.println("Напишіть назву товару");
            String name = sc.nextLine();
            Iterator<Commodity> iterator2 = list.listIterator();
            while (iterator2.hasNext()) {
                if (iterator2.next().getName().equalsIgnoreCase(name)) {
                    System.out.println("Такий товар вже існує");
                    changeCommodity();
                    throw new ChangeCommodityExcrption();
                }
            }
            System.out.println("Напишіть довжину товару");
            int length = sc.nextInt();
            System.out.println("Напишіть ширину товару");
            int width = sc.nextInt();
            System.out.println("Напишіть масу товару");
            int weight = sc.nextInt();
            nextInt = sc.nextLine();

            for (Commodity c : list) {
                if (c.getName().equalsIgnoreCase(removeName)) {
                    c.setName(name);
                    c.setLength(length);
                    c.setWidth(width);
                    c.setWeight(weight);
                }
            }
        }
        catch (ChangeCommodityExcrption a){

        }
    }

    static void sortByName(){
        Collections.sort(list, new CommodityNameComparator());
    }

    static void sortByLength(){
        Collections.sort(list, new CommodityLengthComparator());
    }

    static void sortByWidth(){
        Collections.sort(list, new CommodityWidthComparator());
    }

    static void sortByWeight(){
        Collections.sort(list, new CommodityWeightComparator());
    }

    static void showCommodity(){
        System.out.println("Напишіть назву товару, який хочете побачити");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        boolean flag = true;
        for (Commodity c:list){
            if (c.getName().equalsIgnoreCase(name)){
                System.out.println(c.toString());
                flag=false;
            }
        }
        if (flag){
            System.out.println("Такого товару немає");
        }
    }







    static void showList(){
        for(Commodity c:list){
            System.out.println(c);
        }
    }
}
