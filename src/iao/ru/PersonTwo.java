package iao.ru;

public class PersonTwo {

//private String pole1="� ������ ����� �����, ������ ��������� �  ������";
//private String pole2="��������"; 
    private String pole1="����� � ��� ����������� �����������������. ������� ���� ����������� � ������ ����� ����.";
    private String pole2="������� �������"; 
    private float pole3=-2.2f;
    private String hi = "������, ";
    private String mom = "���!";
    private String name ="������ ���������";
    public PersonTwo() {
	
    }
public void displayQuote(){
    // ������� ������������ �������� ���������
    System.out.println("\""+pole1+"\""+"\n\""+pole2+"\"");
    
    //��������� ���� �����
    System.out.println(pole1.equals(pole2));
    
    //��������� ������ ���������� pole3
    System.out.println(Math.abs(pole3));
   
    // ���������� ������ 
    // 1 ������
    System.out.println(hi+mom);// �������� ���� �����
    // 2 ������
    System.out.println(hi.concat(mom));// ���������� ��� ������ � ������� ������ concat
    // 3 ������
    StringBuffer stBuff = new StringBuffer(hi);// ������� ���������� ������ StringBuffer
    //�������� ���� � ������� ������������ ������ hi 
    stBuff.append(mom); // ��������� ������ ������ mom
    System.out.println(stBuff);//�������  
    // 4 ������
    /*����� StringBuilder �������� ������� �������������������. 
      ������ �� �� ���������������, ������� ��� �� ����� 
      ������������ � ��� �������, ����� � ���������� ������ ���������� ��������� �������.*/
    StringBuilder stBuff1 = new StringBuilder(hi);// �������  ���������� ������ StringBuilder
    //�������� ���� � ������� ������������ ������ hi 
    stBuff1.append(mom); // ��������� ������ ������ mom
    System.out.println(stBuff1);//������� 
    
    // �������� �������� �� ����� � �������   
    System.out.println(name); // ������� ��� � ������� 
    String nameSplit[] = name.split(" ");  // ��������� �� ����� �� �������
    StringBuffer initials=new StringBuffer(); //������� ������ ���� StringBuffer 
    //� ������ �� ���� ����������� ����������  initials
    for(int i=0;i<nameSplit.length;i++){ // ����������� �� ���� ������
	initials.append(nameSplit[i].charAt(0)+"."); // ��������� � initials ������ ����� ����
	//� ��������� ������ '.'
    }
    System.out.println("��������: "+initials); // ������� ��������

}

}
