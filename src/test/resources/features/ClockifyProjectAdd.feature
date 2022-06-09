Feature: Creacion de nuevos Projects

  @Success
  Scenario Outline: Creacion de Project exitoso
    Given Un api-key valido
    And Un workspace-id valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Se valida el project con el nombre puesto

    Examples:
      | operation | entity  | jsonName          | status |
      | POST      | PROJECT | projectAdd/rq_add | 201    |

  @Success
  Scenario Outline: Error al crear por Project ya existente (nombre)
    Given Un api-key valido
    And Un workspace-id valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <jsonResponse>

    Examples:
      | operation | entity | jsonName          | status | jsonResponse      |
      | POST      | ERROR  | projectAdd/rq_add | 400    | projectAdd/rs_400 |

  @Success
  Scenario Outline: Error al crear por Project ya existente (nombre)
    Given Un api-key invalido
    And Un workspace-id valido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <jsonResponse>

    Examples:
      | operation | entity | jsonName          | status | jsonResponse   |
      | POST      | ERROR  | projectAdd/rq_add | 401    | project/rs_401 |

  @Success
  Scenario Outline: Error al crear por Project ya existente (nombre)
    Given Un api-key valido
    And Un workspace-id invalido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>

    Examples:
      | operation | entity | jsonName          | status |
      | POST      | ERROR  | projectAdd/rq_add | 403    |

  @Success
  Scenario Outline: Error al crear por Project ya existente (nombre)
    Given Un api-key valido
    And Un workspace-id vacio
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <jsonResponse>

    Examples:
      | operation | entity | jsonName          | status | jsonResponse   |
      | POST      | ERROR  | projectAdd/rq_add | 404    | project/rs_404 |
