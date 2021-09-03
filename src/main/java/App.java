import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld beanHWOne =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHWOne.getMessage());

        HelloWorld beanHWSec =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanHWOne == beanHWSec);

        Cat beanCat = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat.getName());

        Cat beanCatSec = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCat == beanCatSec);

    }
}