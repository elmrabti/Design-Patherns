package dao_pathern.pres;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dao_pathern.metier.IMetier;

public class PresSpringAnnotaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext("dao_pathern.dao", "dao_pathern.metier") ;
		IMetier metier = context.getBean(IMetier.class) ;
		
		//IMetier metier_ = (IMetier) context.getBean("metier") ; // On peut trouver le bean par son non.
		System.out.println(metier.calcul());
	}

}
