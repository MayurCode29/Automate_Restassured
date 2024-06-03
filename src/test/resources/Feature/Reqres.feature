Feature: Test All ReqRes API

@test
Scenario Outline: List_All_Users_TC01
Given endpoint having path "<path>"
When user perform "<method>" operation
Then user can validate response status code "<statuscode>"
And validate response data
Examples:
|path | method |statuscode|
|/api/users?page=2|Get |200|
|/api/users?page=2|Get |200|
|api/users|Post|201|
|api/users|Get |200|
|/api/users?page=2|Get |200|
|/api/users?page=2|Get |200|







Scenario: List_All_Users_TC01
Given endpoint having path "/api/users?page=2"
When user perform get operation
Then user can validate response status code
And validate response data

Scenario: List_Single_User_TC02
Given endpoint having path "/api/users/2"
When user perform get operation
Then user can validate response status code
And validate response data


Scenario: Create_Single_User_TC03
Given endpoint having path "/api/users"
When user perform post operation
Then user can validate response status code
And validate response data


Scenario: Update_Single_User_TC04
Given endpoint having path "/api/users/2"
When user perform put operation
Then user can validate response status code
And validate response data

Scenario: Update_partial_Single_User_TC05
Given endpoint having path "/api/users/2"
When user perform patch operation
Then user can validate response status code
And validate response data

Scenario: Delete_Single_User_TC06
Given endpoint having path "/api/users/2"
When user perform delete operation
Then user can validate response status code
And validate response data



