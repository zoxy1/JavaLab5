package iao.ru;

import java.util.Arrays;// ���������� ����� Arrays,����� ������������ ��� ����������� ����� sort()

// ��������� �������� �� ������ �����������
public class Anagram {
		
	public static void main(String[] args) {
	
		 String string1="software";
		 String string2="swear oft";
		      
		 string1=string1.replaceAll(" ", "");// ������� ������� �� �����
		 string2=string2.replaceAll(" ", "");
		 	
		 char char1[] = string1.toLowerCase().toCharArray(); // ����� toLowerCase() ��������� ������� � ������ �������
		 char char2[] = string2.toLowerCase().toCharArray(); // ����� toCharArray() �������� ������� � ���� ������ � ������ ��������.
		 Arrays.sort(char1); // ��������� ������� 
		 Arrays.sort(char2);
		            
		 // ��������� � ������� ������ equals() ����� �� ������  
		 if (Arrays.equals(char1, char2)==true)
		     System.out.println("������ �������� �����������");   
		 else
		     System.out.println("������ �� �������� �����������");  
		        
	}

}
