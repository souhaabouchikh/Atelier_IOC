package ma.ace.Presentation;

import ma.ace.Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("ma.ace.Metier", "ma.ace.Dao");
        IMetier iMetier = (IMetier) applicationContext.getBean(IMetier.class);
        System.out.println(iMetier.calcule());



        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        IMetier iMetier = (IMetier) applicationContext.getBean("metier_constInjc");
        System.out.println(iMetier.calcule());*/
    }
}