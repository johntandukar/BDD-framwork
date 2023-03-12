@jenkinsRun
Feature: Retail Application Account Feature

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'james12345@gmail.com' and password 'Home/1234'
    And User click on login button
    And User should be logged in into Account

  @smokeTest
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Jack' and Phone '1012028855'
    And User click on Update button
    Then User profile information should be updated

  @test5
  Scenario: Verify User can Update password
    When User click on Account option
    And User enter below information
      | previousPassword | newPassword | confirmPassword |
      | Home/12345       | Home/1234   | Home/1234       |
    And User click on Change Password button
    Then a message should be displayed ‘Password Updated Successfully’

  @test6
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4563783745631110 | James Bond |               6 |           2034 |          007 |
    And User click on Add your card button
    Then a message should be displayed ‘Payment Method added successfully’

  @test7
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber       | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 4589789563254712 | Toby Stark |              11 |           2026 |          021 |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  @test8
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  @test9
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress  | apt | city  | state    | zipCode |
      | United States | Robiny   |  7045647685 | 115 nowhere st |   4 | salem | Illinois |   45878 |
    And User click Add Your Address button
    Then a message should be displayed 'Address Added Successfully'

  @test10
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
      | country       | fullName | phoneNumber | streetAddress | apt | city   | state    | zipCode |
      | United States | bird Eye |  7013452344 | 1245 movie st |   2 | marvel | Virginia |   56894 |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  @test13
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
