Feature: Verify User search

  Scenario Outline: Verify API is working fine
    Given The user API endpoint is accessible
    When I make a GET request to the user endpoint
    Then The response status code should be <status_code>, users should be <user_count> on page <page_number>
    Examples:
      | status_code | user_count | page_number |
      | 200        | 6          | 1           |


  Scenario Outline: Verify user search on each page
    Given The user API endpoint is accessible
    When I make a GET request to the user endpoint
    Then The response should contains "<first_name>","<last_name>","<email>","<avatar>" based on <page_number>
    Examples:
      | first_name | last_name | email                  | avatar                 |page_number|
      | Janet      | Weaver    | janet.weaver@reqres.in | https://reqres.in/img/faces/2-image.jpg |1|
      | Byron      | Fields    | byron.fields@reqres.in | https://reqres.in/img/faces/10-image.jpg |2|

    Scenario Outline: Verify that on page 12 data is empty
      Given The user API endpoint is accessible
      When I make a GET request to the user endpoint
      Then Verify that data is empty on <page_number>
      Examples:
        | page_number |
        |12           |
