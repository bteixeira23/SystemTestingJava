package pages;

import support.DriverQA;

public class Login extends BasePage {
    public Login(DriverQA stepDriver) {
        super(stepDriver);

    }

    public void preenche(String dados, String valor) {
        switch (dados){
            case "Login":
                preencheLogin(valor);
                break;
            case "Nome Completo":
                preencheNomecompleto(valor);
                break;
            case "Email":
                preencheEmail(valor);
                break;
            case "Idade":
                preencheIdade(valor);
                break;
        }

    }

    private void preencheIdade(String valor) {
        driver.sendKeys(valor,"#user_age","css");
    }

    private void preencheEmail(String valor) {
        driver.sendKeys(valor, "#user_email","css");
    }

    private void preencheNomecompleto(String valor) {
        driver.sendKeys(valor,"#user_full_name","css");
    }

    private void preencheLogin(String valor) {
        driver.sendKeys(valor,"#user_login","css");

    }
}
