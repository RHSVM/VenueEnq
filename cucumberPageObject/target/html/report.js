$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Copy of addcustomer.feature");
formatter.feature({
  "id": "i-want-to-add-new-customer",
  "description": "",
  "name": "I want to add new customer",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "i-want-to-add-new-customer;add-new-person",
  "tags": [
    {
      "name": "@AddNewPerson",
      "line": 3
    }
  ],
  "description": "",
  "name": "Add New Person",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the CRM website",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "I navigate to registrations page",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "I populate the registration form with valid data",
  "keyword": "And ",
  "line": 7,
  "rows": [
    {
      "cells": [
        "Fields",
        "Value"
      ],
      "line": 8
    },
    {
      "cells": [
        "Last Name",
        "Test1223"
      ],
      "line": 9
    },
    {
      "cells": [
        "First Name",
        "Tester"
      ],
      "line": 10
    },
    {
      "cells": [
        "Initials",
        "Mr"
      ],
      "line": 11
    },
    {
      "cells": [
        "PreferedName",
        "Test"
      ],
      "line": 12
    }
  ]
});
formatter.match({
  "location": "bddStepDef.I_am_on_the_CRM_website()"
});
formatter.result({
  "duration": 91629254651,
  "status": "passed"
});
formatter.match({
  "location": "bddStepDef.I_navigate_to_registrations_page()"
});
formatter.result({
  "duration": 12507000657,
  "status": "passed"
});
formatter.match({
  "location": "bddStepDef.I_populate_the_registration_form_with_valid_data(DataTable)"
});
formatter.result({
  "duration": 29634409906,
  "status": "passed"
});
formatter.scenario({
  "id": "i-want-to-add-new-customer;add-new-organisation",
  "tags": [
    {
      "name": "@AddNewOrganisation",
      "line": 18
    }
  ],
  "description": "",
  "name": "Add New Organisation",
  "keyword": "Scenario",
  "line": 19,
  "type": "scenario",
  "comments": [
    {
      "value": "# | Date Of Birth | 10/09/200     |",
      "line": 14
    },
    {
      "value": "#| Email         | test1@rhs.com |",
      "line": 15
    },
    {
      "value": "#| Phone         | 09707079797   |",
      "line": 16
    },
    {
      "value": "#Then I check that the form has been submitted",
      "line": 17
    }
  ]
});
formatter.step({
  "name": "I am on the CRM website",
  "keyword": "Given ",
  "line": 20
});
formatter.step({
  "name": "I navigate to Org registrations page",
  "keyword": "When ",
  "line": 21
});
formatter.step({
  "name": "I populate the form for Organsation",
  "keyword": "And ",
  "line": 22,
  "rows": [
    {
      "cells": [
        "Fields",
        "Value"
      ],
      "line": 23
    },
    {
      "cells": [
        "First Name",
        "Test1223"
      ],
      "line": 24
    },
    {
      "cells": [
        "Last Name",
        "Tester"
      ],
      "line": 25
    },
    {
      "cells": [
        "Preferred Name",
        "SE17 3SF"
      ],
      "line": 26
    }
  ]
});
formatter.step({
  "name": "I check that the form has been submitted",
  "keyword": "Then ",
  "line": 27
});
formatter.match({
  "location": "bddStepDef.I_am_on_the_CRM_website()"
});
formatter.result({
  "duration": 9624795530,
  "status": "passed"
});
formatter.match({
  "location": "bddStepDef.I_navigate_to_Org_registrations_page()"
});
formatter.result({
  "duration": 7765244015,
  "status": "passed"
});
formatter.match({
  "location": "bddStepDef.I_populate_the_form_for_Organsation(DataTable)"
});
formatter.result({
  "duration": 17706789764,
  "status": "passed"
});
formatter.match({
  "location": "bddStepDef.I_check_that_the_form_has_been_submitted()"
});
formatter.result({
  "duration": 4999754588,
  "status": "passed"
});
formatter.scenario({
  "id": "i-want-to-add-new-customer;i-want-to-conduct-a-basic-search",
  "tags": [
    {
      "name": "@BasicSearch",
      "line": 30
    }
  ],
  "description": "",
  "name": "I want to conduct a basic search",
  "keyword": "Scenario",
  "line": 31,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the CRM HomePage",
  "keyword": "Given ",
  "line": 32
});
formatter.step({
  "name": "I navigate to the search bar",
  "keyword": "When ",
  "line": 33
});
formatter.step({
  "name": "I search by Person",
  "keyword": "And ",
  "line": 34
});
formatter.step({
  "name": "I search by Organisation",
  "keyword": "And ",
  "line": 35
});
formatter.step({
  "name": "I search by School",
  "keyword": "And ",
  "line": 36
});
formatter.step({
  "name": "I should get the corresponding result",
  "keyword": "Then ",
  "line": 37
});
formatter.match({
  "location": "bddStepDef.I_am_on_the_CRM_HomePage()"
});
formatter.result({
  "duration": 6516631395,
  "status": "passed"
});
formatter.match({
  "location": "bddStepDef.I_navigate_to_the_search_bar()"
});
formatter.result({
  "duration": 1054579949,
  "status": "passed"
});
formatter.match({
  "location": "bddStepDef.I_search_by_Person()"
});
formatter.result({
  "duration": 43159374722,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "bddStepDef.I_should_get_the_corresponding_result()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "id": "i-want-to-add-new-customer;add-new-venue",
  "tags": [
    {
      "name": "@AddNewTrainer",
      "line": 77
    }
  ],
  "description": "",
  "name": "Add New Venue",
  "keyword": "Scenario",
  "line": 78,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the HRS CRM website",
  "keyword": "Given ",
  "line": 79
});
formatter.step({
  "name": "I navigate to trainer\u0027s page",
  "keyword": "When ",
  "line": 80
});
formatter.step({
  "name": "I populate the form for Trainers",
  "keyword": "And ",
  "line": 81,
  "rows": [
    {
      "cells": [
        "Fields",
        "Value"
      ],
      "line": 82
    },
    {
      "cells": [
        "Trainer",
        "Test"
      ],
      "line": 83
    },
    {
      "cells": [
        "Name",
        "Mrs Andrea Ayre Paster"
      ],
      "line": 84
    },
    {
      "cells": [
        "Additional Work Details",
        "Trainers testing note and should be for trainers only and not for any other purpose"
      ],
      "line": 85
    },
    {
      "cells": [
        "Note",
        "Trainers testing note and should be for trainers only and not for any other purpose"
      ],
      "line": 86
    }
  ]
});
formatter.step({
  "name": "I new trainer should be added",
  "keyword": "Then ",
  "line": 87
});
formatter.match({
  "location": "bddStepDef.I_am_on_the_HRS_CRM_website()"
});
formatter.result({
  "duration": 10732626354,
  "status": "passed"
});
formatter.match({
  "location": "bddStepDef.I_navigate_to_Venue_page()"
});
formatter.result({
  "duration": 7129102431,
  "status": "passed"
});
formatter.match({
  "location": "bddStepDef.I_populate_the_form_for_Venue(DataTable)"
});
formatter.result({
  "duration": 32922409067,
  "status": "passed"
});
formatter.match({
  "location": "bddStepDef.I_new_venue_should_be_added()"
});
formatter.result({
  "duration": 1185270981,
  "status": "passed"
});
formatter.scenario({
  "id": "i-want-to-add-new-customer;add-new-venues",
  "tags": [
    {
      "name": "@AddNewVenue",
      "line": 89
    }
  ],
  "description": "",
  "name": "Add New Venues",
  "keyword": "Scenario",
  "line": 90,
  "type": "scenario"
});
formatter.step({
  "name": "I am on the HRS CRM websites",
  "keyword": "Given ",
  "line": 91
});
formatter.step({
  "name": "I navigate to Venue pages",
  "keyword": "When ",
  "line": 92
});
formatter.step({
  "name": "I populate the form for Venues",
  "keyword": "And ",
  "line": 93
});
formatter.step({
  "name": "I new venue should now be added",
  "keyword": "Then ",
  "line": 94
});
formatter.match({
  "location": "bddStepDef.I_am_on_the_HRS_CRM_websites()"
});
formatter.result({
  "duration": 10890748674,
  "status": "passed"
});
formatter.match({
  "location": "bddStepDef.I_navigate_to_Venue_pages()"
});
formatter.result({
  "duration": 4153559260,
  "status": "passed"
});
formatter.match({
  "location": "bddStepDef.I_populate_the_form_for_Venues()"
});
formatter.result({
  "duration": 12137677735,
  "status": "passed"
});
formatter.match({
  "location": "bddStepDef.I_new_venue_should_now_be_added()"
});
formatter.result({
  "duration": 1320979646,
  "status": "passed"
});
formatter.uri("Courses.feature");
formatter.feature({
  "id": "i-want-to-add-and-amend-courses-information",
  "description": "",
  "name": "I want to add and amend courses information",
  "keyword": "Feature",
  "line": 1
});
formatter.scenario({
  "id": "i-want-to-add-and-amend-courses-information;i-want-to-create-a-new-course",
  "tags": [
    {
      "name": "@CreateNewCourse",
      "line": 3
    }
  ],
  "description": "",
  "name": "I want to create a new Course",
  "keyword": "Scenario",
  "line": 4,
  "type": "scenario"
});
formatter.step({
  "name": "I am RHS CRM",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "I navigate to \u0027Course\u0027 Session",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "I fill the course Main details",
  "keyword": "And ",
  "line": 7,
  "rows": [
    {
      "cells": [
        "Fields",
        "Value"
      ],
      "line": 8
    },
    {
      "cells": [
        "Code Name",
        "RHS Ah Hoc Doc Template"
      ],
      "line": 9
    },
    {
      "cells": [
        "Course Title",
        "Tester\u0027s Note This is for testing purpose\u0027"
      ],
      "line": 10
    },
    {
      "cells": [
        "Course Summary",
        "This Course is for the RHS student and yes"
      ],
      "line": 11
    },
    {
      "cells": [
        "Web Image Url",
        "/getmedia/d9dd6b6b-b359-4485-86fd-869f7e1d8889/Growing-and-Cooking-with-Maths-and-Science"
      ],
      "line": 12
    },
    {
      "cells": [
        "Learning Outcome",
        "RHS Ah Hoc Doc Template"
      ],
      "line": 13
    },
    {
      "cells": [
        "Addictional Info",
        "Tester\u0027s Note This is for testing purpose\u0027"
      ],
      "line": 14
    }
  ]
});
formatter.step({
  "name": "I fill Out Date/Location",
  "keyword": "And ",
  "line": 15,
  "rows": [
    {
      "cells": [
        "Fields",
        "Value"
      ],
      "line": 16
    },
    {
      "cells": [
        "Website Venue Desc",
        "Tester\u0027s Note This is for testing purpose\u0027"
      ],
      "line": 17
    }
  ]
});
formatter.step({
  "name": "I fill Out Session",
  "keyword": "And ",
  "line": 18,
  "rows": [
    {
      "cells": [
        "Fields",
        "Value"
      ],
      "line": 19
    },
    {
      "cells": [
        "Title",
        "RHS Ah Hoc Doc Session TitleTemplate"
      ],
      "line": 20
    },
    {
      "cells": [
        "Max Paid Bookings",
        "10"
      ],
      "line": 21
    },
    {
      "cells": [
        "Max Complimentary Bookings",
        "10"
      ],
      "line": 22
    }
  ]
});
formatter.step({
  "name": "I fill Out Ticket TicketPrice",
  "keyword": "And ",
  "line": 23,
  "rows": [
    {
      "cells": [
        "Fields",
        "Value"
      ],
      "line": 24
    },
    {
      "cells": [
        "Desc",
        "Tester\u0027s Note This is for testing purpose\u0027"
      ],
      "line": 25
    },
    {
      "cells": [
        "Price",
        "10"
      ],
      "line": 26
    },
    {
      "cells": [
        "Early Bird",
        "5"
      ],
      "line": 27
    },
    {
      "cells": [
        "Multi-Booking Discount",
        "0"
      ],
      "line": 28
    },
    {
      "cells": [
        "Multi-Booking Threadhold",
        "0"
      ],
      "line": 29
    }
  ]
});
formatter.step({
  "name": "I should be able to Create a Course",
  "keyword": "Then ",
  "line": 30
});
formatter.match({
  "location": "bddStepDef.I_am_RHS_CRM()"
});
formatter.result({
  "duration": 8875153623,
  "status": "passed"
});
formatter.match({
  "location": "bddStepDef.I_navigate_to_Course_Session()"
});
formatter.result({
  "duration": 53894,
  "status": "passed"
});
formatter.match({
  "location": "bddStepDef.I_fill_the_course_Main_details(DataTable)"
});
formatter.result({
  "duration": 29534870799,
  "status": "passed"
});
formatter.match({
  "location": "bddStepDef.I_fill_Out_Date_Location(DataTable)"
});
formatter.result({
  "duration": 28815019985,
  "status": "failed",
  "error_message": "org.openqa.selenium.ElementNotVisibleException: Cannot click on element (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 664 milliseconds\nBuild info: version: \u00272.44.0\u0027, revision: \u002776d78cf\u0027, time: \u00272014-10-23 20:02:37\u0027\nSystem info: host: \u00274199LOIT\u0027, ip: \u002710.2.2.121\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.7.0_80-ea\u0027\nSession ID: 5132a011-0f54-47e6-ae9c-508da19a9167\nDriver info: org.openqa.selenium.ie.InternetExplorerDriver\nCapabilities [{platform\u003dWINDOWS, javascriptEnabled\u003dtrue, elementScrollBehavior\u003d0, ignoreZoomSetting\u003dfalse, enablePersistentHover\u003dtrue, ie.ensureCleanSession\u003dfalse, browserName\u003dinternet explorer, enableElementCacheCleanup\u003dtrue, unexpectedAlertBehaviour\u003ddismiss, version\u003d11, pageLoadStrategy\u003dnormal, ie.usePerProcessProxy\u003dfalse, cssSelectorsEnabled\u003dtrue, ignoreProtectedModeSettings\u003dfalse, requireWindowFocus\u003dfalse, initialBrowserUrl\u003dhttp://localhost:5226/, handlesAlerts\u003dtrue, ie.forceCreateProcessApi\u003dfalse, nativeEvents\u003dtrue, browserAttachTimeout\u003d0, ie.browserCommandLineSwitches\u003d, takesScreenshot\u003dtrue}]\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:268)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:79)\r\n\tat cucumberPageObject.bddStepDef.I_fill_Out_Date_Location(bddStepDef.java:950)\r\n\tat ✽.And I fill Out Date/Location(Courses.feature:15)\r\n"
});
formatter.match({
  "location": "bddStepDef.I_fill_Out_Session(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "bddStepDef.I_fill_Out_Ticket_TicketPrice(DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "bddStepDef.I_should_be_able_to_Create_a_Course()"
});
formatter.result({
  "status": "skipped"
});
});