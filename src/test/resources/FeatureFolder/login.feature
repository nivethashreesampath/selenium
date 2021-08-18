Feature: Checking the Automation Functionality in webpage


  Scenario: Handling DropDown listbox in webpage
    Given Login into webpage
    When user handling dropdown list box and implicitly wait in 5seconds
    Then Exit into webpage
  

  Scenario: Handling Drag and Drop listbox in webpage
    Given Login into webpage2
    When user handling drag and drop in webpage
    Then Exit into webpage2
  
  Scenario: Handling popup window in webpage
    Given Login into webpage3
    When user handling popup windows in webpage
    Then Exit into webpage3
  
