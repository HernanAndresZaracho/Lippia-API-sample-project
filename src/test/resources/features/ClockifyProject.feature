Feature: Project

  @Success
  Scenario Outline: Consulta Project con workspace vacio
    Given Un api-key valido
    And Un workspace-id vacio
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Examples:
      | operation | entity | jsonName   | status |
      | GET       | ERROR  | project/rq | 404    |

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
  Scenario Outline: Consulta Project con api key invalido
    Given X-Api-Key invalido
    And Un workspace-id
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <jsonResponse>
    Examples:
      | operation | entity | jsonName   | status | jsonResponse   |
      | GET       | ERROR  | project/rq | 401    | project/rs_401 |

  @Success
  Scenario Outline: Consulta Project resultado exitoso
    Given Un api-key valido
    And Un workspace-id
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se muestran los project del perfil

    Examples:
      | operation | entity  | jsonName   | status |
      | GET       | PROJECT | project/rq | 200    |

  @SuccessEjemplos
  Scenario Outline: Consulta Workspace resultado exitoso por parametros
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and 'key:<key>,workspace:<workspace>'
    And se obtuvo el status code <status>

    Examples:
      | operation | entity  | jsonName   | status | key                                              | workspace                |
      | GET       | PROJECT | project/rq | 200    | MjQ0YjVlYjktYjU4Ni00YTM5LTk2YjYtZjk5ZjYyYzNjNTlh | 628418d1de42d9011b50949d |

  @SuccessEjemplos
  Scenario Outline: Consulta Workspace resultado exitoso desde el gherkin
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and 'key:MjQ0YjVlYjktYjU4Ni00YTM5LTk2YjYtZjk5ZjYyYzNjNTlh,workspace:628418d1de42d9011b50949d'
    And se obtuvo el status code <status>

    Examples:
      | operation | entity  | jsonName   | status |
      | GET       | PROJECT | project/rq | 200    |

