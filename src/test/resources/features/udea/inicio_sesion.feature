Feature: Login Users And Log Out

  Scenario: SSMU Login User
    Given client wants to log in
    When  he enters his user 'Elza.Jacobs39@gmail.com' and password 'afyA8hCuNDxu5mY'
    Then  he is logged in correctly and his profile is 'Usuario'

  Scenario: SSMU Login Admin
    Given client wants to log in
    When  he enters his user 'Monroe.Rippin98@yahoo.com' and password 'x55K9SebZcVO4PO'
    Then  he is logged in correctly and his profile is 'Administrador'

  Scenario: SSMU Login partner
    Given client wants to log in
    When  he enters his user 'Ismael.Heaney2@gmail.com' and password 'yvgI6PY8WeuiJJY'
    Then  he is logged in correctly and his profile is 'Socio'

  Scenario: SSMU Login fail
    Given client wants to log in
    When  he enters his user 'Ismael.Heaney2@gmail.com' and password 'yvgI6PY8WeuiJ'
    Then  he fails to log in and sees a message 'Usuario o contraseña incorrectos.'

  Scenario: SSMU Log Out
    Given customer is actively logged in
    When  he closes the section
    Then  he should see the logon screen