package iao.ru;
// ������� ����� ����������
public class Adder {

	public static void main(String[] args) {
		
		if(args.length==0){
			System.out.println("�� ������� ���������");	
		}
		else{	
			float sum=0; // ���������� �������� �����
			int numberElemets=args.length; // ���������� ������ ���������� ����������
			for(int i=0;i<numberElemets;i++){ // ��������� �� ���� ����������
			sum=sum+(Float.valueOf(args[i]) ).floatValue(); //c ������� ������ valueOf() ����������� ������ � ��� float � ���������� � ���������� sum   
			}
		System.out.println("����� ���� ����������:"+sum);
		}

	}
}