Feature: Test Dang Ki Function
  Scenario: Kiem tra cac truong bat buoc
    Given Trinh duyet duoc mo
    And click icon dang nhap
    When click text dang ki
    And click loai tai khoan va tiep tuc
    Then nhap thong tin name va email va phoneNumber va password va retypePassword
    And click button dang ki
