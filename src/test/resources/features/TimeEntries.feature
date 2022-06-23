Feature: Agrega, edita y elimina horas al proyecto, ademas de cambiar su descripcion

  Background:
    Given Los datos proporcionados correctos

  @ProyectoFinal @ConsultaHoras
  Scenario Outline: Consulta las horas del proyecto
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>
    And Consulta las <horas> del proyecto

    Examples:
      | operation | entity       | jsonName       | status | horas    |
      | GET       | TIME_CONSULT | timeEntries/rq | 200    | PT384H2M |

  @ProyectoFinal @AgregarHoras
  Scenario Outline: Agregar horas al proyecto
    When Se agrega una <descripcion> al time entry
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Se verifica que la hora agregada tenga <descripcion> colocada

    Examples:
      | operation | entity   | jsonName               | status | descripcion        |
      | POST      | TIME_ADD | timeEntries/rq_addTime | 201    | ProyectoIntegrador |

  @ProyectoFinal @EditaDescripcion
  Scenario Outline: Edita la descripcion del proyecto
    When I perform a 'GET' to 'TIME_CONSULT' endpoint with the 'timeEntries/rq' and ''
    When Se busca el proyecto por <descripcion>
    And Se reemplaza por la <nuevaDescripcion>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Se verifica que la <nuevaDescripcion> se establecio

    Examples:
      | operation | entity      | jsonName                | status | descripcion | nuevaDescripcion |
      | PUT       | TIME_UPDATE | timeEntries/rq_editTime | 200    | Edit        | Edited           |

  @ProyectoFinal @EliminaHoraAgregada
  Scenario Outline: Elimina un time entry del proyecto
    When I perform a 'GET' to 'TIME_CONSULT' endpoint with the 'timeEntries/rq' and ''
    When Se busca el proyecto por <descripcion>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then se obtuvo el status code <status>

    Examples:
      | operation | entity      | jsonName                  | status | descripcion |
      | DELETE    | TIME_DELETE | timeEntries/rq_deleteTime | 204    | Delete      |

