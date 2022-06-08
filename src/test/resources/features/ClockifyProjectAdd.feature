Feature: Project

  @Success1
  Scenario Outline: Consulta Project resultado exitoso
    Given Un api-key valido
    And Un workspace-id
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Se valida que existen projectos

    Examples:
      | operation | entity  | jsonName   | status |
      | GET       | PROJECT | project/rq | 200    |
