Feature: Test login functionality
  Scenario Outline: Check login is successful with valid credentials
    Given trinh duyet duoc mo
    And user dang o trang login
    When user nhap <username> va <password>
    And user click vao nut dang nhap
    Then user den trang chu

    
    Examples:
    |username|password|
    |Raghav  |123455  |
    |Ele     |12345   |