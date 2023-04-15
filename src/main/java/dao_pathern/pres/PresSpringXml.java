package dao_pathern.pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao_pathern.metier.IMetier;


public class PresSpringXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml") ;
		IMetier metier = context.getBean(IMetier.class) ;
		System.out.println(metier.calcul());
	}

}
