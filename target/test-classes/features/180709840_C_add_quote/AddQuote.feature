@AddQuoteFeature
Feature: Add quote feature

  @Positive @AddQuoteSuccess
  Scenario: As user I want to add quote and see my name
    Given user want to open add quote page
    When user want to input quote '180709840_Ryo_C_Quote'
    And user want to input author '180709840_AdityaRyoHandoko'
    And user click dropdown background color
    And user want to choose 'aqua' as a background color
    And user click Add quote button
    Then user can see their name successfully added