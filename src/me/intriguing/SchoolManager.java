package me.intriguing;

import me.intriguing.util.TextMenu;

import java.util.Scanner;

public class SchoolManager {


    public static void main(String[] args) {
        int response = new TextMenu("Welcome to the HAUSD School Program.\n\nLogging in as...")
                                    .add("Student")
                                    .add("Teacher")
                                    .add("Administration")
                                    .add("District Administration")
                                    .run();

        System.out.println(response);
    }


    /**
     * Calls the correct menu based on the role number
     * @param roleNumber
     */
//    public static void findLogin(int roleNumber) {
//        switch(roleNumber) {
//            case 1:
//                studentMenu();
//                break;
//            case 2:
//                teacherMenu();
//                break;
//            case 3:
//                administrationMenu();
//                break;
//            case 4:
//                districtAdministrationMenu();
//                break;
//            default:
//                break;
//        }
//    }
//
//    public static void studentMenu() {
//        while(true) {
//            System.out.println("Student Menu");
//            System.out.println(" ");
//            System.out.println("Logging in as...");
//            System.out.println("1 - Login as Student");
//            System.out.println("2 - Teacher");
//            System.out.println("3 - Administration");
//            System.out.println("4 - District Administration");
//            break;
//        }
//    }




}
