Feature: favorite operations

  Scenario: Add fav
    When we open page "https://www.avito.ru/nikel/knigi_i_zhurnaly/domain-driven_design_distilled_vaughn_vernon_2639542363"
    And click on element with class name - "desktop-usq1f1"
    And click on element with class name - "index-counter-UxPCj"
    And Element with xpath ".//div[@data-marker = 'item-2639542363']" is on the page
    And Close browser