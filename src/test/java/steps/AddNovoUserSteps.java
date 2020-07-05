package steps;


import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.*;
import support.BaseSteps;

public class AddNovoUserSteps extends BaseSteps {
    private Home home = new Home (driver);
    private Indice menu = new Indice (driver);
    private NovoUser userGrid = new NovoUser (driver);
    private Login login = new Login (driver);
    private Salvar salvar = new Salvar (driver);
    private Visualizar visualiza = new Visualizar (driver);

    @Given("^o usuario esteja na pagina do agapito-server$")
    public void oUsuarioEstejaNaPaginaDoAgapitoServer() {
        home.openPage();
    }

    @And("^o usuario clica no menu usuario$")
    public void oUsuarioClinaNoMenuUsuario() {
        menu.clickUsuario();
    }

    @And("^o usuario clica no botao Novo usuario$")
    public void oUsuarioClicaNoBotaoNovoUsuario() {
        userGrid.clickNovousuario();
    }

    @And("^o usuario preenche o \"([^\"]*)\" com o valor de \"([^\"]*)\"$")
    public void oUsuarioPreencheOComOValorDe(String dados, String valor) throws Throwable {
        login.preenche (dados,valor);

    }

    @When("^o usuario clicar no botao Salvar$")
    public void oUsuarioClicarNoBotaoSalvar() {
        salvar.clicksalvar ();
        visualiza.salvarultimoid();
    }

    @Then("^o usuario irá visualizar \"([^\"]*)\"$")
    public void oUsuarioIráVisualizar(String mensagem) throws Throwable {
        String retorno =  visualiza.visualizar ();
        Assert.assertEquals(mensagem,retorno);

    }

    @And("^o usuario retorno para a tela usuario$")
    public void oUsuarioRetornoParaATelaUsuario() {
        visualiza.retorna();
    }

    @When("^o usuario clica no botao mostrar$")
    public void oUsuarioClicaNoBotaoMostrar() {
        userGrid.clickvisualiza(visualiza.getUltimouser());
    }

    @Then("^o usuario visualiza o Login com o valor \"([^\"]*)\"$")
    public void oUsuarioVisualizaOComOValor(String valor ) throws Throwable {
        String validalogin =  visualiza.visualizar2();
        Assert.assertEquals(valor,validalogin);

    }

    @And("^o usuario clica no botao editar$")
    public void oUsuarioClicaNoBotaoEditar() {
        userGrid.clickeditar(visualiza.getUltimouser());
    }

    @And("^o usuario altera o \"([^\"]*)\" com o valor de \"([^\"]*)\"$")
    public void oUsuarioAlteraOComOValorDe(String dados, String valor) throws Throwable {
        login.preenche (dados,valor);

    }

    @Then("^o usuario clica no botao apagar$")
    public void oUsuarioClicaNoBotaoEditarApagar() {
        userGrid.espera(visualiza.getUltimouser());
        userGrid.clickapagar(visualiza.getUltimouser());
       // userGrid.verifuser(visualiza.getUltimouser());
    }

    @Then("^o usuário confirma deleção$")
    public void oUsuárioConfirmaDeleção() throws InterruptedException {
        Thread.sleep(2000);
        userGrid.deleteok();
    }
}
