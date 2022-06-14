Feature: Login positive/negative scenarios

  Scenario: Positive authorization
    Given open 'Login page'
    When enter standard_user user name
    And enter secret_sauce password
    And click 'login' CTA
    Then customer checks current url
    And customer checks current main title

  Scenario: Negative authorization
    Given open 'Login page'
    When enter locked_out_user user name
    And enter secret_sauce password
    And click 'login' CTA
    Then customer sees error message