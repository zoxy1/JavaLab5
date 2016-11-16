package iao.ru;

public class CustomerTest {

    public CustomerTest() {
	
    }

    public static void main(String[] args) {
	Customer cObject1=new Customer();
	Customer cObject2=new Customer();
	cObject1.customerID=1;
	cObject1.name="Андрей";
	cObject1.emailAddress="andrey@yandex.ru";
	cObject2.customerID=2;
	cObject2.name="Петр";
	cObject2.emailAddress="petr@yandex.ru";
	cObject1.displayCustomerInfo();
	cObject2.displayCustomerInfo();
	
	cObject2=cObject1;
	cObject1.displayCustomerInfo();
	cObject2.displayCustomerInfo();
    /*  при присвоении переменной cObject2 значение переменной cObject1 мы получаем, 
     * что обе переменные ссылаются на один и тот же объект, поэтому выводится два 
     * раза первый созданный объект, на второй созданный объект ссылка теряется 
     * и его из памяти удаляет garbage collector  */
    }

}
