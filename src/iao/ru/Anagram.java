package iao.ru;

import java.util.Arrays;// подключаем класс Arrays,чтобы использовать его статический метод sort()

// Вычисляем являются ли строки анаграммами
public class Anagram {
		
	public static void main(String[] args) {
	
		 String string1="software";
		 String string2="swear oft";
		      
		 string1=string1.replaceAll(" ", "");// удаляем пробелы из строк
		 string2=string2.replaceAll(" ", "");
		 	
		 char char1[] = string1.toLowerCase().toCharArray(); // метод toLowerCase() переводит символы в нижний регистр
		 char char2[] = string2.toLowerCase().toCharArray(); // метод toCharArray() копирует символы в этой строке в массив символов.
		 Arrays.sort(char1); // сортируем массивы 
		 Arrays.sort(char2);
		            
		 // проверяем с помощью метода equals() равны ли строки  
		 if (Arrays.equals(char1, char2)==true)
		     System.out.println("Строки являются анаграммами");   
		 else
		     System.out.println("Строки не являются анаграммами");  
		        
	}

}
