Feature: Workspace
  COMO usuario de Clockify
  QUIERO ver las configuraciones de mi Worckspace
  PARA llevar un buen control de mis horas de trabajo y el de mis empleados
  @Success
  Scenario Outline: Consulta Workspace resultado exitoso
    #Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and 'key:<key>,workspace:<workspace>'
    And se obtuvo el status code <status>
    #Then Obtengo los datos de mi Workspace

    Examples:
      | operation | entity  | jsonName   | status | key                                              | workspace                |
      | GET       | PROJECT | project/rq | 200    | MjQ0YjVlYjktYjU4Ni00YTM5LTk2YjYtZjk5ZjYyYzNjNTlh | 628418d1de42d9011b50949d |

@Success1
  Scenario Outline: Consulta Workspace resultado exitoso
    #Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and 'key:MjQ0YjVlYjktYjU4Ni00YTM5LTk2YjYtZjk5ZjYyYzNjNTlh,workspace:628418d1de42d9011b50949d'
    And se obtuvo el status code <status>
    #Then Obtengo los datos de mi Workspace

    Examples:
      | operation | entity  | jsonName   | status |
      | GET       | PROJECT | project/rq | 200    |


@Success1
  Scenario Outline: Consulta Workspace resultado exitoso
    #Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    #Then Obtengo los datos de mi Workspace

    Examples:
      | operation | entity  | jsonName   | status |
      | GET       | PROJECT | project/rq | 200    |