@beleite
Feature: Consultando usuarios

  Scenario: Consultar o usuario
    Given o usuario esteja na pagina do agapito-server
    And o usuario clica no menu usuario
    And o usuario clica no botao Novo usuario
    And o usuario preenche o "Login" com o valor de "Teste Bia"
    And o usuario preenche o "Nome Completo" com o valor de "Teste James"
    And o usuario preenche o "Email" com o valor de "Testebiajames@teste.com"
    And o usuario preenche o "Idade" com o valor de "28"
    And o usuario clicar no botao Salvar
    And o usuario retorno para a tela usuario
    When o usuario clica no botao mostrar
    Then o usuario visualiza o Login com o valor "Teste Bia"


