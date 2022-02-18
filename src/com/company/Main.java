package com.company;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String C$="\u2103";
        final double _otKel = 273.15;
        String F$="\u2109";
        final double _otCel = (9.00/5.00);
        String K$="K";
        final double _otFar = (5.00/9.00);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Конвертер температур");
        System.out.println("1. "+C$+" в "+F$);
        System.out.println("2. "+C$+" в "+K$);
        System.out.println("3. "+F$+" в "+C$);
        System.out.println("4. "+F$+" в "+K$);
        System.out.println("5. "+K$+" в "+C$);
        System.out.println("6. "+K$+" в "+F$);
        System.out.print("Выберите нужный пункт: ");

        int userIn = scanner.nextInt();
        DecimalFormat df= new DecimalFormat("###.##");
        DecimalFormatSymbols dfs= new DecimalFormatSymbols(Locale.ENGLISH);
        System.out.println("\u001B[36m"+"Внимание! Разделитель дробной части запятая (,)"+"\u001B[0m");

        switch (userIn) {
            case 1: {
                System.out.println("Введите температуру в цельсиях: ");
                double C = scanner.nextDouble();
                double F = C*_otCel+32;
                System.out.println(df.format(C)+C$+" = "+df.format(F)+F$);
                break;
            }
            case 2: {
                System.out.println("Введите температуру в цельсиях: ");
                double C = scanner.nextDouble();
                double K = C+_otKel;
                System.out.println(df.format(C)+C$+" = "+df.format(K)+K$);
                break;
            }
            case 3: {
                System.out.println("Введите температуру в фаренгейтах: ");
                double F = scanner.nextDouble();
                double C = _otFar*(F-32);
                System.out.println(df.format(F)+F$+" = "+df.format(C)+C$);
                break;
            }
            case 4: {
                System.out.println("Введите температуру в фаренгейтах: ");
                double F = scanner.nextDouble();
                double K = (F-32)*_otFar+_otKel;
                System.out.println(df.format(F)+F$+" = "+df.format(K)+K$);
                break;
            }
            case 5: {
                System.out.println("Введите температуру в кельвинах: ");
                double K = scanner.nextDouble();
                double C = K-_otKel;
                System.out.println(df.format(K)+K$+" = "+df.format(C)+C$);
                break;
            }
            case 6: {
                System.out.println("Введите температуру в кельвинах: ");
                double K = scanner.nextDouble();
                double F = (K-_otKel)*_otCel+32;
                System.out.println(df.format(K)+K$+" = "+df.format(F)+F$);
                //System.out.printf("%.2f %n",F);
                break;
            }
            default:
                System.out.println("Конец");
        }
    }
}
