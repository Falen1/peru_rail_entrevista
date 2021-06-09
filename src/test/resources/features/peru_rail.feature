@peruRail
Feature: Reservar boleto de tren
  Yo como cliente
  quiero reservar o comprar mi boleto
  para viajar en tren

  @ida
  Scenario Outline: Comprar un boleto solo ida

    Given abro pagina PeruRail
    When busco viaje solo ida
      | destino   | ruta   | tren   |
      | <destino> | <ruta> | <tren> |
    And completo datos de cabina
      | tipo_cabina  | cantidad_cabinas | adultos | ninos |
      | SUITE CABINS |                1 |       2 |     0 |
    And completo los datos de los pasajeros
      | nombre  | apellido | fec_nac    | nacionalidad | tipo_doc            | numero_doc | sexo    | telefono  | email              | recieve_offers |
      | Carla   | Llanos   | 05-05-1985 | Peru         | Identification Card |   43016516 | Female  | 946545124 | callanosf@gmail.com | true           |
      | Juan    | Perez    | 16-02-1970 | Peru         | Identification Card |   44447111 | Male    | 915151523 | jp@gmail.com    | true           |
    Then verifico los montos obtenidos

    Examples: 
      | destino | ruta                    | tren                    |
      | Cusco   | Puno > Cusco            | Belmond Andean Explorer |
      | Cusco   | Arequipa > Puno > Cusco |                         |
