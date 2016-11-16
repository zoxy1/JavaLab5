package iao.ru;

public class PersonTwo {

//private String pole1="У победы много отцов, только поражение –  сирота";
//private String pole2="Талейран"; 
    private String pole1="Жизнь — это бесконечное совершенствование. Считать себя совершенным — значит убить себя.";
    private String pole2="Фридрих Геббель"; 
    private float pole3=-2.2f;
    private String hi = "Привет, ";
    private String mom = "Мир!";
    private String name ="Андрей Кудрявцев";
    public PersonTwo() {
	
    }
public void displayQuote(){
    // выводим высказывание Фридриха Геббельта
    System.out.println("\""+pole1+"\""+"\n\""+pole2+"\"");
    
    //сравнение двух строк
    System.out.println(pole1.equals(pole2));
    
    //вычисляем модуль переменной pole3
    System.out.println(Math.abs(pole3));
   
    // складываем строки 
    // 1 способ
    System.out.println(hi+mom);// сложение двух строк
    // 2 способ
    System.out.println(hi.concat(mom));// складываем две строки с помощью метода concat
    // 3 способ
    StringBuffer stBuff = new StringBuffer(hi);// создаем переменную класса StringBuffer
    //помещаем туда с помощью конструктора строку hi 
    stBuff.append(mom); // добавляем вторую строку mom
    System.out.println(stBuff);//выводим  
    // 4 способ
    /*класс StringBuilder обладает большей производительностью. 
      Однако он не синхронизирован, поэтому его не нужно 
      использовать в тех случаях, когда к изменяемой строке обращаются несколько потоков.*/
    StringBuilder stBuff1 = new StringBuilder(hi);// создаем  переменную класса StringBuilder
    //помещаем туда с помощью конструктора строку hi 
    stBuff1.append(mom); // добавляем вторую строку mom
    System.out.println(stBuff1);//выводим 
    
    // Выделяем инициалы из имени и фамилии   
    System.out.println(name); // выводим имя и фамилию 
    String nameSplit[] = name.split(" ");  // разделяем на слова по пробелу
    StringBuffer initials=new StringBuffer(); //создаем объект типа StringBuffer 
    //и ссылку на него присваиваем переменной  initials
    for(int i=0;i<nameSplit.length;i++){ // пробегаемся по всем словам
	initials.append(nameSplit[i].charAt(0)+"."); // добавляем в initials первые буквы слов
	//и добавляем символ '.'
    }
    System.out.println("Инициалы: "+initials); // выводим инициалы

}

}
