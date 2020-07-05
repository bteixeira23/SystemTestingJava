@beleite
Feature: Add Novo usuario

  Scenario Outline: Adicionando no usuario
    Given o usuario esteja na pagina do agapito-server
    And o usuario clica no menu usuario
    And o usuario clica no botao Novo usuario
    And o usuario preenche o "Login" com o valor de "<User>"
    And o usuario preenche o "Nome Completo" com o valor de "<Completo>"
    And o usuario preenche o "Email" com o valor de "Testebiajames@teste.com"
    And o usuario preenche o "Idade" com o valor de "28"
    When o usuario clicar no botao Salvar
    Then o usuario irá visualizar "Usuário foi criado com sucesso."

    Examples:
      |User  |Completo|
      |Testes Casa| Vila Maria|
      |Testes ap|São Paulo    |