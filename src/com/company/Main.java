package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean IsItTrue = true;
        while (IsItTrue) {
            User user= new User();
            Scanner inName = new Scanner(System.in);
            try {
                System.out.println("Введите Ваше имя: ");
                user.setName(inName.nextLine());
            }catch (IllegalNameLengthException e){
                System.out.println("Введите корректное имя");
            }


            Scanner inAge = new Scanner(System.in);
            try {
                System.out.println("Введите возраст: ");
                user.setAge(inAge.nextInt());
            } catch (IllegalAgeException e) {
                System.out.println("Введите верный возраст");



            }
        }
    }
}
