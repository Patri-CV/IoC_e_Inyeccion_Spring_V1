import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import Hotel.config.AppConfig;
import Hotel.controller.ReservaController;;

public class Main {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ReservaController controller = context.getBean(ReservaController.class);
		controller.ejecutar();
		context.close();
	}
}
