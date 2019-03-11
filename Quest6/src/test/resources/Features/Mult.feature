Feature: Multiplication of numbers

  Scenario Outline: Verify Multiplication of given  numbers
    Given First number is  "<First Number>"
    Given Second number is"<Second Number>"
    Given Third number is"<Third Number>"
    When I multiply 4 and 5 and 6
    Then The result should be 120

    Examples: 
      | First Number | Second Number | Third Number |
      |            4 |             5 |            6 |
