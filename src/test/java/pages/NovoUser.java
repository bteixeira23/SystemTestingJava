package pages;

import org.openqa.selenium.By;
import support.DriverQA;

public class NovoUser extends BasePage {
   public NovoUser(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void clickNovousuario() {
        driver.click("#btn-new", "css");
    }

    public void clickvisualiza(String ultimouser) {
       String id = "btn-show_" + ultimouser;
       System.out.print(ultimouser);
       driver.click(id);
    }

    public void clickeditar(String ultimouser) {
        String id = "btn-edit_" + ultimouser;
        System.out.print(ultimouser);
        driver.click(id);
    }

    public void clickapagar(String ultimouser) {
        String id = "btn-delete_" + ultimouser;
        System.out.print(ultimouser);
        driver.click(id);
    }

    public void deleteok() {
        driver.ChooseOkOnNextConfirmation();
    }

    public void espera(String ultimouser) {
        String id = "btn-delete_" + ultimouser;
        System.out.print(ultimouser);
        driver.waitElement(id);
    }

    public boolean verifuser(String ultimouser) {
        String id = "btn-delete_" + ultimouser;
       return driver.getDriver().findElement(By.id(id)) != null;
    }
}
