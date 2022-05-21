Feature: Workspace
  COMO usuario de Clockify
  QUIERO ver las configuraciones de mi Worckspace
  PARA llevar un buen control de mis horas de trabajo y el de mis empleados
@Success
  Scenario Outline: Consulta Workspace resultado exitoso
    #Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    #Then Obtengo los datos de mi Workspace

    Examples:
      | operation | entity  | jsonName   | status |
      | GET       | PROJECT | project/rq | 200    |
