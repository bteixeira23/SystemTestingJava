package pages;

import support.DriverQA;

public class Indice extends BasePage {
    public Indice (DriverQA stepsDriver) {
        super(stepsDriver);
    }

    public void clickUsuario() {
        driver.click("#users","css");
    }
}
