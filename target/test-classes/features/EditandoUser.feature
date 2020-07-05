@beleite
Feature: Editando usuarios

  Background: Adicionar usuario
    Given o usuario esteja na pagina do agapito-server
    And o usuario clica no menu usuario
    And o usuario clica no botao Novo usuario
    And o usuario preenche o "Login" com o valor de "Teste Bia"
    And o usuario preenche o "Nome Completo" com o valor de "Teste James"
    And o usuario preenche o "Email" com o valor de "Testebiajames@teste.com"
    And o usuario preenche o "Idade" com o valor de "28"
    And o usuario clicar no botao Salvar
    And o usuario retorno para a tela usuario


  Scenario: Editar usuario
    Given o usuario clica no botao editar
    And o usuario altera o "Nome Completo" com o valor de "Teste Cookie"
    When o usuario clicar no botao Salvar
    Then o usuario irá visualizar "Usuário foi atualizado com sucesso."
