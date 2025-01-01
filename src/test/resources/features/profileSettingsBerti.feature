Feature: Profile information

  Background: Login in the hectorware
    Given that you are in hectorWare
    And you click profile module

  #Full name verification
  #Full name verification
  @fullname @berti
  Scenario Outline: Verify the FULL NAME field with VALID input

    When you write "<valid>" input on the full name field
    Then you should see the "<expected>" on the full name
    Examples:
      | valid                  | expected               |
      | berti                  | berti                  |
      | Albert Shima           | Albert Shima           |
      | berti amel shima       | berti amel shima       |
      | berti amel shima nasle | berti amel shima nasle |

  #EMAIL VERIFICATION
  #EMAIL VERIFICATION^^
  @email @berti
  Scenario Outline: Verify the EMAIL field with VALID input

    When you write "<input>" input on email field
    And going form email to dashboard and again to profile module
    Then you should see the "<expected>" on the email field

    @validemail
    Examples: Valid input
      | input              | expected           |
      | albertsh@gmail.com | albertsh@gmail.com |
      | shalbert@gmail.com | shalbert@gmail.com |
      | employee@gmail.com | employee@gmail.com |

  @email @berti
  Scenario Outline: Verify the EMAIL field with INVALID input

    When you write "<invalid>" input on email field
    And going form email to dashboard and again to profile module
    Then you should not see the "<invalid>" on the email field


    @invalidemail
    Examples: Valid input
      | invalid           |
      | albertsh@gmail    |
      | albertshgmail.com |
      | 123456789         |
      | @hotmal           |
      | @gmail            |
      |                   |

  #Phone number VERIFICATION
  #Phone number VERIFICATION
  @phonenumber @berti
  Scenario Outline: Verify the PHONE NUMBER field with VALID input

    When you write "<input>" input on phone number field
    And going form phone number to dashboard and again to profile module
    Then you should see the "<expected>" on the phone number field

    @validphonenumber
    Examples: Valid input
      | input      | expected   |
      | 0692724576 | 0692724576 |
      | 0175638723 | 0175638723 |

  @phonenumber @berti
  Scenario Outline: Verify the PHONE NUMBER field with INVALID input
    When you write "<invalid>" input on phone number field
    And going form phone number to dashboard and again to profile module
    Then you should not see the "<invalid>" on the phone number field

    @invalidphonenumber
    Examples: Invalid input
      | invalid      |
      | sakdjh3424   |
      | letters      |
      | lette  123rs |
      |              |

  #Address VERIFICATION
  #Address VERIFICATION
  @address @berti
  Scenario Outline: Verify the ADDRESS field with VALID input

    When you write "<input>" input on ADDRESS field
    And going form ADDRESS to dashboard and again to profile module
    Then you should see the "<expected>" on the ADDRESS field

    @validaddress
    Examples: Valid input
      | input                     | expected                  |
      | Rr Niko Avrami 12/3       | Rr Niko Avrami 12/3       |
      | Ish sheshi Shqiponja 12/3 | Ish sheshi Shqiponja 12/3 |

  @address @berti
  Scenario Outline: Verify the ADDRESS field with INVALID input
    When you write "<invalid>" input on ADDRESS field
    And going form ADDRESS to dashboard and again to profile module
    Then you should not see the "<invalid>" on the ADDRESS field

    @invalidaddress
    Examples: Invalid input
      | invalid   |
      | 21376 231 |
      | 123456789 |
      |           |

  #Website VERIFICATION
  #Website VERIFICATION
  @address @berti
  Scenario Outline: Verify the WEBSITE field with VALID input

    When you write "<input>" input on WEBSITE field
    And going form WEBSITE to dashboard and again to profile module
    Then you should see the "<expected>" on the WEBSITE field

    @validwebsite
    Examples: Valid input
      | input                  | expected               |
      | https://www.google.com | https://www.google.com |
      | www.youtube.com        | www.youtube.com        |

  @address @berti
  Scenario Outline: Verify the WEBSITE field with INVALID input
    When you write "<invalid>" input on WEBSITE field
    And going form WEBSITE to dashboard and again to profile module
    Then you should not see the "<invalid>" on the WEBSITE field

    @invalidwebsite
    Examples: Invalid input
      | invalid           |
      | https://www.gogle |
      | www.youtbe.com    |
      |                   |

  #Twiter VERIFICATION
  #Twiter VERIFICATION
  @address @berti
  Scenario Outline: Verify the TWITTER field with VALID input

    When you write "<input>" input on WEBSITE field
    And going form WEBSITE to dashboard and again to profile module
    Then you should see the "<expected>" on the WEBSITE field

    @validwebsite
    Examples: Valid input
      | input                  | expected               |
      | https://www.google.com | https://www.google.com |
      | www.youtube.com        | www.youtube.com        |

  @address @berti
  Scenario Outline: Verify the WEBSITE field with INVALID input
    When you write "<invalid>" input on WEBSITE field
    And going form WEBSITE to dashboard and again to profile module
    Then you should not see the "<invalid>" on the WEBSITE field

    @invalidwebsite
    Examples: Invalid input
      | invalid           |
      | https://www.gogle |
      | www.youtbe.com    |
      |                   |

  #All VERIFICATIONs
  #All VERIFICATIONS
  #@address @berti
  #Scenario Outline: Verify the All fields with VALID input
   # Given a list of web elements from profile module
   # When you write "<Full_name>", "<Email>", "<Phone_number>", "<Address>", "<Website>", "<Twitter>" input on ALL fields


  #  @validaddress
   # Examples: Valid input
    #  | Full_name    | Email              | Phone_number | Address                   | Website                 | Twitter    |
     # | Albert Shima      | albertsh@gmail.com | 2187361287 | Ish sheshi Shqiponja 12/3 | https://www.google.com  | ashima     |
      #| Berti             | shalbert@gmail.com | 0692736172 | Rr Niko Avrami 12/3 | https://www.youtube.com | shalbert08 |

  #Language dropdown verification
  #Language dropdown verification
  @language @berti
  Scenario: Checking all options for the LANGUAGE drop down list

    When you click profile module
    Then you should see all the options of dropdown


