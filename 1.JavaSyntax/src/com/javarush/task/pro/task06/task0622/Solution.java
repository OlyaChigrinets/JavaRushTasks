package com.javarush.task.pro.task06.task0622;

import java.util.Scanner;

/* 
Диабло (1)
*/

public class Solution {
    public static String getFirstPositionPhrase = "Помоги Амиго определить, где спрятался Диабло? Введи номер позиции (1, 2, 3 или 4):";
    public static String getPositionPhrase = "Диабло не обнаружен. Давай попробуем снова. Введи номер позиции (1, 2, 3 или 4):";
    public static String findDiabloPhrase = "Амиго обнаружил Диабло.";
    public static String diabloDefendPhrase = "Амиго атакует. Диабло отбил атаку Амиго и нанес ответный удар.";
    public static String amigoAttackPhrase = "Удар Амиго достиг цели. Диабло потерял 3 жизни.";
    public static String winPhrase = "Амиго одержал победу над Диабло и выбил из его головы загадочный кристалл.";
    public static String loosePhrase = "Диабло победил Амиго.";
    public static int diabloPosition;
    public static void findDiablo(){
        System.out.println(getFirstPositionPhrase);
        Scanner s = new Scanner(System.in);
        int x = 0;
        while (s.hasNextInt()) {
            x = s.nextInt();
            if(x == diabloPosition) {
                System.out.println(findDiabloPhrase);
                break;
            }else {
                System.out.println(getPositionPhrase);
            }
        }
    }
    public static void main(String[] args) {
        diabloPosition = getRandomNumber(4);
        findDiablo();
        battle();
        isAmigoWin();
        if (isAmigoWin()) {
            System.out.println(winPhrase);
        } else {
            System.out.println(loosePhrase);
        }
    }
    public static int getRandomNumber(int range) {
        return (int) (Math.random() * range) + 1;
    }
    public static int amigoLives = 9;
    public static int diabloLives = 9;
    public static void amigoLostLife(){amigoLives = amigoLives - 1;}
    public static void diabloLostLife(){diabloLives = diabloLives - 3;}
    public static int amigoAttacks(){
        int numb = getRandomNumber(3);
        return numb;
    }
    public static int diabloDefends() {
        int numb = getRandomNumber(3);
        return numb;
    }
    public static void battle() {
        while (true){
            if(amigoLives == 0 || diabloLives == 0) {
                break;
            }
            if(amigoAttacks() == diabloDefends() ){
                System.out.println(diabloDefendPhrase);
                amigoLostLife();
            } else {
                System.out.println(amigoAttackPhrase);
                diabloLostLife();
            }
        }
    }
    public static boolean isAmigoWin () {
        boolean result = diabloLives == 0;
        return result;
        }
    }


