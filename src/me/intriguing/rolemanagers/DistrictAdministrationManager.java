package me.intriguing.rolemanagers;

import me.intriguing.util.TextMenu;

public class DistrictAdministrationManager {

    public static void init() {
        int response = new TextMenu("Student Options\n")
                            .add("1 - List Students")
                            .add("2 - Add Student")
                            .add("3 - Remove Students")
                            .add("4 - View Student Grades")
                            .add("5 - View Student Attendance")
                            .add("6 - View Student Information")
                            .run();
    }

}
