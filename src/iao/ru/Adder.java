package iao.ru;
// считаем сумму аргументов
public class Adder {

	public static void main(String[] args) {
		
		if(args.length==0){
			System.out.println("Ќе введены аргументы");	
		}
		else{	
			float sum=0; // переменна€ хран€щ€ю сумму
			int numberElemets=args.length; // переменна€ хранит количество аргументов
			for(int i=0;i<numberElemets;i++){ // пробегаем по всем аргументам
			sum=sum+(Float.valueOf(args[i]) ).floatValue(); //c помощью метода valueOf() преобщазуем строки в тип float и прибавл€ем в переменную sum   
			}
		System.out.println("—умма всех аргументов:"+sum);
		}

	}
}