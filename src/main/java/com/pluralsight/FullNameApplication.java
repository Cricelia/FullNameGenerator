package com.pluralsight;

import javax.xml.transform.Source;
import java.util.Scanner;

public class FullNameApplication {
    static Scanner asking = new Scanner(System.in);
    static char enterChar = '↵';
    static String firstName;
    static String middleName;
    static String lastName;
    static String suffix;
    static String fullName;

    public static void FullName() {
        System.out.println("Please enter your name:");
        System.out.println("First name: " + enterChar);
        firstName = asking.nextLine();
        System.out.println("Middle name: " + enterChar);
        middleName = asking.nextLine();
        System.out.println("Last name:" + enterChar);
        lastName = asking.nextLine();
        System.out.println("Suffix:" + enterChar);
        suffix = asking.nextLine();
        }


        public static void CompleteName() {
            fullName = firstName;
            if (!middleName.isEmpty()) {
                fullName += " " + middleName;
            }
            fullName += " " + lastName;
            if (!suffix.isEmpty()) {
                fullName += ", " + suffix;
            }
            System.out.println("Full name: " + fullName);

        }

    }
