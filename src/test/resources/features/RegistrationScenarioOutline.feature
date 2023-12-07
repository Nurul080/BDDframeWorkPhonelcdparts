
@sprint2
Feature: Registration Scenario Withoutline
    			


  Scenario Outline: user want to create a account in phonelcdpart application user open application to create account 
   									click my account button and click create account button and input firstname and lastname and
   									email and password and confirm password and click create account button
    
    Given user open browser <browser> and give url <url> to open application
    And user click <myaccount button> and <carteaccount button> to put valid information
    When user enter <firstname> in firstnamefield
    And user enter <lastname> in lastnamefield
    And user enter <email> in emailfield
    And user enter <password> in passwordfield
    And user enter <confirm password> in confirmpasswordfield
    And user click the create account button
    Then user close the application
    
    Examples: 
      | browser  	|						url 										  | firstname  |	lastname	|					email							|	password	  |	confirm password		|
      | "Chrome"  | "https://www.phonelcdparts.com/"		| "ashar"		 |	"alo"	 		|	"ashaeralo@gmail.com"			| "a1234567"	|	"a1234567"					|
      | "Edge" 	  | "https://www.phonelcdparts.com/"		| "suvo"		 |	"sokal"	 	|	"suvosokal@gmail.com"			| "s1234567"	|	"s1234567"					|
      | "Firefox" | "https://www.phonelcdparts.com/"		| "poronto"	 |	"bikel"	 	|	"porontobikel@gmail.com"	| "p1234567"	|	"p1234567"					|
      
      
