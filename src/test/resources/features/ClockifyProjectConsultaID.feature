Feature: Consulta de respuestas(status) al Project por ID

  @Success1
  Scenario Outline: Consulta Project por ID con resultado exitoso
    Given Un api-key valido
    And Un workspace-id valido
    And Un projectId valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Se valida que existe el project

    Examples:
      | operation | entity    | jsonName     | status |
      | GET       | PROJECTID | projectId/rq | 200    |

  @Success1
  Scenario Outline: Consulta Project por ID con api key invalido
    Given Un api-key invalido
    And Un workspace-id valido
    And Un projectId valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <jsonResponse>

    Examples:
      | operation | entity  | jsonName     | status | jsonResponse   |
      | GET       | ERRORID | projectId/rq | 401    | project/rs_401 |

  @Success1
  Scenario Outline: Consulta Project por ID con workspace invalido
    Given Un api-key valido
    And Un workspace-id invalido
    And Un projectId valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>

    Examples:
      | operation | entity | jsonName     | status |
      | GET       | ERRORID | projectId/rq | 403    |

  @Success1
  Scenario Outline: Consulta Project por ID invalido
    Given Un api-key valido
    And Un workspace-id valido
    And Un projectId invalido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <jsonResponse>

    Examples:
      | operation | entity  | jsonName     | status | jsonResponse     |
      | GET       | ERRORID | projectId/rq | 400    | projectId/rs_400 |

  @Success1
  Scenario Outline: Consulta Project por ID con workspace vacio
    Given Un api-key valido
    And Un workspace-id vacio
    And Un projectId valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <jsonResponse>
    Examples:
      | operation | entity  | jsonName     | status | jsonResponse   |
      | GET       | ERRORID | projectId/rq | 404    | project/rs_404 |






