Feature: Login Test

@Test
  Scenario Outline: Verify Login with Valid Credentials
    Given Launch orange HRM
    When User enters Valid Username "<Username>"
    And Enters valid password "<Password>"
    And the User gets onto the Auth Page and  Verifies the title of the page 
    
    Examples:
    |Username|Password|
    |admin  |admin123|
    
    
    
    
