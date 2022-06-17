Feature: Consulta de respuestas(status) al Project

  Background:
    Given Los datos proporcionados correctos

  @Success1
  Scenario Outline: Consulta exitoso
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>
    #And se verifica la '<duration>' del time entrie

    Examples:
      | operation | entity       | jsonName       | status | duration |
      | GET       | TIME_ENTRIES | timeEntries/rq | 200    | PT11H11M |

    @Success1
    Scenario Outline: Agregar
      When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
      And se obtuvo el status code <status>
      Then Se verifica la descripcion

      Examples:
        | operation | entity       | jsonName               | status |
        | POST      | TIME_ENTRIES | timeEntries/rq_addTime | 201    |