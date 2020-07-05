package pages;

import support.DriverQA;

public class Salvar extends BasePage {
    public Salvar(DriverQA stepDriver) {
        super(stepDriver);
    }

    public void clicksalvar() {
        driver.click("#btn-save", "css");
    }


}
