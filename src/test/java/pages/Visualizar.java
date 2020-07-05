package pages;

import support.DriverQA;

public class Visualizar extends BasePage {
    private String ultimouser;

    public Visualizar(DriverQA stepDriver) {
        super(stepDriver);
    }

    public String visualizar() {
        return driver.getText("#notice", "css");
    }

    public void salvarultimoid() {
            insertuser(driver.getText("codigo"));
        }

    private void insertuser(String codigo) {
        ultimouser = codigo;
    }
    public String getUltimouser(){
        return ultimouser;
    }

    public void retorna() {
        driver.click(".ls-btn-primary-danger", "css");
    }
    public String visualizar2 (){
        return driver.getText("#login", "css");
    }
}
