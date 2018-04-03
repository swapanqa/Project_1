Feature: Browse products by categorize

  Background:
    Given Not a valid user
    When User browse to the site
    Then Costco home page will be display
    #When User click Signin link
    #Then Signin page will be dispaly
    #When User enter valid email address as "ma_raz@yahoo.com"
    #And  User enter valid password as "amar1234@"
    #And User click signin button
    #Then My account page will be display


  Scenario:Shopping from optical page

    When User move cursor to Optical
    Then Optical page will be drop down
    When User can select a category as "Sunglasses"
    Then User select a item as "Men's Sunglasses"
    Then Mens Sunglass page will display

