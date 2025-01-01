Feature: Contacts function

  User story: As a user, I should be able to create a new contact so that I can communicate with
  User Story: As a user, I should be able to delete any contact
  User Story: As a user, I should be able to edit any contact



  @seyma1
  Scenario: User can create a new contact by clicking "+ New contact" button and entering the valid name, valid
  title and valid company.
  Name  can contain up to 20 characters, uppercase and lowercase letters and space but cannot contain special
  and numeric characters
  Company’s name can contain up to 20 characters, uppercase and lowercase letters and space but cannot
  contain special and numeric characters
  Title can contain up to 10 characters, uppercase and lowercase letters and space but cannot contain
  special and numeric characters


    Given login to the "HECTORWARE-QA"
    And Navigate to Contacts module on the left side of the page
    When Click New contact button
    And Enter "name" in to Name inbox
    And Enter "company" in to Company inbox
    And Enter "title" in to Title inbox
    And Click any empty area on the page
    Then Verify new contact is shown in contact list

  @seyma2

  Scenario: User can not create a new contact by entering contact information outside the specified limits, user
  should see "Invalid Name", "Invalid Title" or "Invalid Title" error message on the page
  Name  can contain up to 20 characters, uppercase and lowercase letters and space but cannot contain special
  and numeric characters
  Company’s name can contain up to 20 characters, uppercase and lowercase letters and space but cannot
  contain special and numeric characters
  Title can contain up to 10 characters, uppercase and lowercase letters and space but cannot contain
  special and numeric characters

    Given login to the "HECTORWARE-QA"
    And Navigate to Contacts module on the left side of the page
    When Click New contact button
    And Enter invalid "name" in to Name inbox
    And Enter invalid "company" in to Company inbox
    And Enter invalid "title" in to Title inbox
    And Click any empty area on the page
    Then Verify Invalid Name, Invalid Company or Invalid Title error message occurs

  @seyma3
    Scenario: User can see any contact with all entered information on detail information page

      Given login to the "HECTORWARE-QA"
      And Navigate to Contacts module on the left side of the page
      When Click New contact button
      And Enter "name" in to Name inbox
      And Enter "company" in to Company inbox
      And Enter "title" in to Title inbox
      And Click any empty area on the page
      Then Verify new contact is shown in contact list
      And Click on created contact
      Then Verify contact's name is shown on detail information page
      Then Verify contact's company is shown on detail information page
      Then Verify contact's title is shown on detail information page



  @seyma4
    Scenario: User can edit any contact with entering valid informations
    Name  can contain up to 20 characters, uppercase and lowercase letters and space but cannot contain special
    and numeric characters
    Company’s name can contain up to 20 characters, uppercase and lowercase letters and space but cannot
    contain special and numeric characters
    Title can contain up to 10 characters, uppercase and lowercase letters and space but cannot contain
    special and numeric characters

      Given login to the "HECTORWARE-QA"
      And Navigate to Contacts module on the left side of the page
      When click "any contact"
      And edit "name" with entering valid name
      And edit "company" with entering valid company
      And edit "title" with entering valid title
      And Click any empty area on the page
      Then Verify edited contact is shown in contact list


  @seyma5
      Scenario: User cannot edit any contact with entering invalid informations
      Name  can contain up to 20 characters, uppercase and lowercase letters and space but cannot contain special
      and numeric characters
      Company’s name can contain up to 20 characters, uppercase and lowercase letters and space but cannot
      contain special and numeric characters
      Title can contain up to 10 characters, uppercase and lowercase letters and space but cannot contain
      special and numeric characters

        Given login to the "HECTORWARE-QA"
        And Navigate to Contacts module on the left side of the page
        When click "any contact"
        And edit name with entering invalid name
        And edit company with entering invalid company
        And edit title with entering invalid title
        And Click any empty area on the page
        Then Verify Invalid Name, Invalid Company or Invalid Title error message occurs


        @seyma6
        Scenario: User can see edited contact with all edited information on detail information page

          Given login to the "HECTORWARE-QA"
          And Navigate to Contacts module on the left side of the page
          When click "any contact"
          And edit "name" with entering valid name
          And edit "company" with entering valid company
          And edit "title" with entering valid title
          And Click any empty area on the page
          Then Verify edited contact is shown in contact list
          And click on edited contact
          Then Verify name is shown on detail information page
          Then Verify company is shown on detail information page
          Then Verify title is shown on detail information page

          @seyma7
          Scenario: User can delete any contact

            Given login to the "HECTORWARE-QA"
            And Navigate to Contacts module on the left side of the page
            And Click on any contact
            Then Verify selected contact's  page is opened
            And Click the three dots on the right side of the page
           Then Verify three dots button has three options: Download, Generate QR Code and Delete
            And Click Delete
            Then Verify No contact selected page is opened
            Then Verify contact has been removed from the contact list