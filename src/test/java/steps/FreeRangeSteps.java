package steps;

import io.cucumber.java.en.Given;
import pages.PaginaPrincipal;

public class FreeRangeSteps {
    
//isntancia que llama a pagina principal trayendosus metodos:

PaginaPrincipal LandingPage = new PaginaPrincipal();


@Given("I navigate to www.freerangetesters.com")

public void inavigatetoFRT(){

 LandingPage.navigateToFreeRangeTesters(); 
    
}

}
