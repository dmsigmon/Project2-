package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /// using scanner to create password and creating an encrypt
        // key to assign to the password for encryption
        Scanner in = new Scanner(System.in);
        System.out.println("Create Password");
        String password = in.nextLine();
        String encryptKey = "P4$$w0rd_1$_N0w_$4f";
        int counter = 0;

        //The while loop will loop 3 times with the
        // counter to keep track of how many loops for each iteration.
        // Once at the maximum of 3 times the loop will break or
        // if the password is correct the if statement will break and
        // continue to the fibonacci sequence
        while (counter < 3) {
            counter++;
            // encryption of password using encryption key
            password = encryptKey + password + encryptKey;

            /// asking for password again for authorization
            System.out.println("Enter Password for Authorization");
            String newPassword = in.nextLine();

            //decryption of password by attaching the encryption key to
            // new password to make sure they match
            newPassword = encryptKey + newPassword + encryptKey;

            //if statement within the while loop is used to
            // determine if the passwords match and to print a message
            // of access granted or wrong password
            if (password.equals(newPassword)) {
                System.out.println("Welcome, Access Granted!");
                System.out.println();
                System.out.println("Enter a number");
                long n = in.nextInt();
                in.close();


                //Fibonacci Sequence
                // created the variable "n" as a scanner for
                // user input to ask for a number then printing
                // fibonacci sequence of '"n" terms
                long b = 0;
                long c  = 1;
                System.out.println("Fibonacci Sequence through the first " + n +" terms:");

                for (long i = 1; i<= n; i++) {
                    System.out.print(b + ", ");

                    long add = b + c;
                    b = c;
                    c = add;
                }
                break;
            } else {
                System.out.println("Wrong Password");
            }

        }


    }

}


