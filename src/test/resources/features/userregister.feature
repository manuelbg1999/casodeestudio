Feature: Register user in izyacademy
  Scenario Outline: Register user correct in iziacademy
    Given the user access a the platform click on register button
    When the user enter the <name> as name
    When the user enter the <username> as username
    When the user enter the <country> as country
    When the user enter the <city> as city
    When the user enter the <id> as id
    When the user enter the <phonenumber> as phonenumber
    When the user enter the <email> as email
    When the user enter the <password> as password
    When the user the click in the button register
    Then the user the click in the perfil y look your <mensaje>

    Examples:
      |name|username|country|city|id|phonenumber|email|password|mensaje|
      |Manuel |manuel123 |colombia|cerete|1234423|30222273482|mbolano2@qvisi.us.com|manuel123|Cerrar Sesión|










