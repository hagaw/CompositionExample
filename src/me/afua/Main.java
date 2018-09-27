package me.afua;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner names = new Scanner(System.in);
        int parentCounter;

        do {
            parentCounter = 0;
            System.out.println("Is there any Parent to register in my list? ");
            String nextParent = names.nextLine();
            if ((nextParent).equalsIgnoreCase("yes")) {
            System.out.println("Hello Parent! What is you name?");
            String theparent = names.nextLine();
            Person parent = new Person();
            parent.setName(theparent);

                System.out.println(theparent + "\t How many children you have? ");
                int childNumber = names.nextInt();
                names.nextLine();
                for(int childCounter =1; childCounter <=childNumber; childCounter++){
                    System.out.println("please write your child's name ");
                    String theChild = names.nextLine();
                    Person child = new Person();
                    child.setName(theChild);
                    parent.addAChild(child);
                }
            ArrayList<String> theirNames = new ArrayList<>();
            for (Person eachChild :parent.getMyChildren()) {

                theirNames.add(eachChild.getName());
                System.out.println(parent.getName() + "'s child is " + eachChild.getName());
            }
                parentCounter =1;
                Collections.sort(theirNames);
                System.out.println("Mr./Mrs. " +theparent+" Your children are listed below in alphabetic order :\n");
                for(String aName:theirNames) {
                    System.out.println(aName);
                }
            }
        } while (parentCounter == 1);

        System.out.println("Thank you, Good Bye !!!");
    }
}



