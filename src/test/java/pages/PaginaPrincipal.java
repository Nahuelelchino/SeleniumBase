package pages;

public class PaginaPrincipal extends BasePage{
    
public PaginaPrincipal(){

    super(driver);
}

//metodo navegar:

public void navigateToFreeRangeTesters(){


navigateTo("https://www.freerangetesters.com");

}



}
