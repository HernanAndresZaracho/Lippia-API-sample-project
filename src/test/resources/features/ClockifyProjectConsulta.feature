Feature: Consulta de respuestas(status) al Project

  @Success
  Scenario Outline: Consulta Project resultado exitoso
    Given Un api-key valido
    And Un workspace-id valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Se valida que existen projectos

    Examples:
      | operation | entity  | jsonName   | status |
      | GET       | PROJECT | project/rq | 200    |

  @Success
  Scenario Outline: Consulta Project con api key invalido
    Given Un api-key invalido
    And Un workspace-id valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <jsonResponse>

    Examples:
      | operation | entity | jsonName   | status | jsonResponse   |
      | GET       | ERROR  | project/rq | 401    | project/rs_401 |

  @Success
  Scenario Outline: Consulta Project con workspace invalido
    Given Un api-key valido
    And Un workspace-id invalido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>

    Examples:
      | operation | entity | jsonName   | status |
      | GET       | ERROR  | project/rq | 403    |

  @Success
  Scenario Outline: Consulta Project con workspace vacio
    Given Un api-key valido
    And Un workspace-id vacio
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <jsonResponse>
    Examples:
      | operation | entity | jsonName   | status | jsonResponse   |
      | GET       | ERROR  | project/rq | 404    | project/rs_404 |



