Feature: Update de Projects

  @Success1
  Scenario Outline: Cambiamos el nombre del Project
    Given Un api-key valido
    And Un workspace-id valido
    And Un projectId valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Se valida el project con el nombre puesto y color puesto

    Examples:
      | operation | entity    | jsonName          | status |
      | PUT       | PROJECTID | projectUpd/rq_upd | 200    |

  @Success1
  Scenario Outline: Error al editar el Project por ID con api key invalido
    Given Un api-key invalido
    And Un workspace-id valido
    And Un projectId valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <jsonResponse>

    Examples:
      | operation | entity  | jsonName          | status | jsonResponse   |
      | GET       | ERRORID | projectUpd/rq_upd | 401    | project/rs_401 |

  @Success1
  Scenario Outline: Error al editar el Project por ID con workspace invalido
    Given Un api-key valido
    And Un workspace-id invalido
    And Un projectId valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>

    Examples:
      | operation | entity  | jsonName          | status |
      | GET       | ERRORID | projectUpd/rq_upd | 403    |

  @Success1
  Scenario Outline: Error al editar el Project por ID invalido
    Given Un api-key valido
    And Un workspace-id valido
    And Un projectId invalido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <jsonResponse>

    Examples:
      | operation | entity  | jsonName          | status | jsonResponse     |
      | GET       | ERRORID | projectUpd/rq_upd | 400    | projectId/rs_400 |

  @Success1
  Scenario Outline: Error al editar el por ID con workspace vacio
    Given Un api-key valido
    And Un workspace-id vacio
    And Un projectId valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <jsonResponse>
    Examples:
      | operation | entity  | jsonName          | status | jsonResponse   |
      | GET       | ERRORID | projectUpd/rq_upd | 404    | project/rs_404 |
