package cucumberPageObject;

import org.openqa.selenium.By;

public class Selectors {
	public static String url = "http://vmcrmuat:9010/";
	public static String OrgUrl = "http://vmcrmuat:9010/#/customers/organisation/new";
	public static String CommUrl = "http://vmcrmuat:9010/#/customers/07d2887f-d3d5-422e-b6c3-58989b332e17/edit";
	public static String AdDocUrl = "http://vmcrmuat:9010/#/adhocdocs/templateeditor";
	public static String CourseUrl = "http://vmcrmuat:9010/#/cfsg/courseadmin/courses/add";
	public static String AddTrainerUrl = "http://vmcrmuat:9010/#/cfsg/courseadmin/trainers";
	public static String AddVenueUrl="http://vmcrmuat:9010/#/cfsg/courseadmin/venues";
	public static String RMUrl="http://www.rightmove.co.uk/svr/1710";
	public static String BizSectorUrl="http://vmcrmdev:9010/#/customers/3f65d54f-b8ac-442d-a0e1-b149b3cdd8f7/maindetails";
	public static String CourseSessionUrl="http://vmcrmuat:9010/#/cfsg/courseadmin/courses/90";
	
	
//Text Fields	
public static String EnterSearchCriteria=".//*[@id='mainSection']/div/div/div/div/div[2]/div/div[2]/div[1]/input";
public static String Fname=".//*[@id='ng-app']/body/section/div/div/fieldset/accordion/div/div[1]/div[2]/div/form/div[1]/div/div[4]/div[1]/input";
public static String Surname=".//*[@id='ng-app']/body/section/div/div/fieldset/accordion/div/div[1]/div[2]/div/form/div[1]/div/div[3]/div[1]/input";
public static String Initial=".//*[@id='ng-app']/body/section/div/div/fieldset/accordion/div/div[1]/div[2]/div/form/div[1]/div/div[5]/div[1]/input";
public static String Preferedname=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[1]/div[2]/div/form/div[1]/div/div[6]/div/input";
public static String OrgName=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[1]/div[2]/div/form/div[1]/div/div[1]/div[1]/input";
public static String AbbOrgName=".//*[@id='ng-app']/body/section/div/div/div/form/fieldset/div[1]/div/div/div[1]/div/div[2]/div[1]/input";
public static String OrgSource=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[1]/div[2]/div/form/div[2]/div/div[1]/select";
public static String AdvanceSearchCityTown=".//*[@id='ng-app']/body/section/div/div/div/div/div/div/div[1]/div/div[1]/input";
public static String AdvanceSearchAddressLine1=".//*[@id='ng-app']/body/section/div/div/div/div/div/div/div[1]/div/div[2]/input";
public static String AdvanceSearchAddressLine2=".//*[@id='ng-app']/body/section/div/div/div/div/div/div/div[1]/div/div[3]/input";
public static String AdvanceSearchCountrydropDwon=".//*[@id='ng-app']/body/section/div/div/div/div/div/div/div[1]/div/div[4]/div/a/span[1]";
public static String AdvanceSearchEmailAddress=".//*[@id='ng-app']/body/section/div/div/div/div/div/div/div[1]/div/div[5]/input";
public static String AdvanceSearchSocialMedia=".//*[@id='ng-app']/body/section/div/div/div/div/div/div/div[1]/div/div[6]/input";
public static String AdvanceSearchTel=".//*[@id='ng-app']/body/section/div/div/div/div/div/div/div[1]/div/div[7]/input";
public static String AdvanceSearchDisplayName=".//*[@id='ng-app']/body/section/div/div/div/div/div/div/div[1]/div/div[8]/input";
public static String AdvanceSearchCountrySearchTextbox=".//*[@id='ng-app']/body/section/div/div/div/div/div/div/div[1]/div/div[4]/div/div/div/input";
public static String CommPostCode=".//*[@id='ng-app']/body/div[2]/div/div/div[1]/div/form/fieldset/div[2]/div[1]/div[1]/div/input";
public static String PersonSource=".//*[@id='ng-app']/body/section/div/div/fieldset/accordion/div/div[1]/div[2]/div/form/div[2]/div/div[1]/select";
public static String TitleTextFeild1=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[1]/div[2]/div/form/div[1]/div/div[1]/div[1]/div/div/div/input";
public static String PostCode=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[2]/div[2]/div/div/form/div/div[1]/div/ng-form/fieldset/div[2]/div[1]/div[1]/div/input";
public static String PersonRegEmail=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[3]/div[2]/div/ng-form/div/div/div[1]/input";
public static String Tel=".//*[@id='tel']/div/div/div[2]/input";
public static String TelExt=".//*[@id='tel']/div/div/div[3]/input";
public static String OrgPostCode=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[2]/div[2]/div/div/form/div/div[1]/div/ng-form/fieldset/div[2]/div[1]/div[1]/div/input"; 
public static String OrgEmail=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[3]/div[2]/div/ng-form/div/div/div[1]/input";
public static String OrgTelTextFeild=".//*[@id='tel']/div/div/div[2]/input";
public static String OrgTelExt=".//*[@id='tel']/div/div/div[3]/input";
public static String OrgTelType=".//*[@id='tel']/div/div/div[4]/select";
public static String AdSearchTel=".//*[@id='mainSection']/div/div/div/div/div/div/div[1]/div/div[7]/input";
public static String AdSearchDisplayName=".//*[@id='mainSection']/div/div/div/div/div/div/div[1]/div/div[8]/input";
public static String AdSearchCustomeID=".//*[@id='mainSection']/div/div/div/div/div/div/div[1]/div/div[9]/input";
public static String CommEmailFeild=".//*[@id='mainSection']/div/div[3]/div[1]/div[3]/rhs-form/ng-form/div/div/div/div[1]/input";
public static String CommEmailType=".//*[@id='mainSection']/div/div[3]/div[1]/div[3]/rhs-form/ng-form/div/div/div/div[2]/select";
public static String CommWebSiteLink=".//*[@id='mainSection']/div/div[3]/div[1]/div[2]/ul/li[4]/a";
public static String CommWebsiteTextFeild=".//*[@id='mainSection']/div/div[3]/div[1]/div[3]/rhs-form/ng-form/div/div/div/div[1]/input";
public static String CommWebsiteType=".//*[@id='mainSection']/div/div[3]/div[1]/div[3]/rhs-form/ng-form/div/div/div/div[2]/select";
public static String CommTelFeild=".//*[@id='mainSection']/div/div[3]/div[1]/div[3]/rhs-form/ng-form/div/div/div/div[2]/input";
public static String commTelExt=".//*[@id='mainSection']/div/div[3]/div[1]/div[3]/rhs-form/ng-form/div/div/div/div[3]/input";
public static String CommTelType=".//*[@id='mainSection']/div/div[3]/div[1]/div[3]/rhs-form/ng-form/div/div/div/div[4]/select";
public static String CommSocialMediatextFeild=".//*[@id='mainSection']/div/div[3]/div[1]/div[3]/rhs-form/ng-form/div/div/div/div[1]/input";
public static String SearchExistingUser=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[3]/section/div/div/div/div/div[1]/input";
public static String OnlineAccFname=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[1]/div/div/div[1]/div[2]/div[1]/div[3]/div[1]/input";
public static String OnlineAccLname=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[1]/div/div/div[1]/div[2]/div[1]/div[4]/div[1]/input";
public static String OnlineAccTextFeild2=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[3]/section/div/div/div/div/div[1]/input";
public static String TopRightSearchBar=".//*[@id='ng-app']/body/header/nav/div/div[2]/ul[2]/li[1]/input";
public static String RelationshipWith=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[5]/ng-form/div/div/div[3]/input[1]";
public static String RelationshipNote=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[5]/ng-form/div/div/div[4]/input";
public static String NoteTextField=".//*[@id='ng-app']/body/div[2]/div/div/form/fieldset/div[1]/div/textarea";



//Buttons
public static String PersonSearch=".//*[@id='mainSection']/div/div/div/div/div[2]/div/div[2]/div[2]/div/label[1]";										
public static String AddNewPersonButton=".//*[@id='mainSection']/div/div[2]/div/a[2]";
public static String SearchAgain=".//*[@id='mainSection']/div/div[2]/div/a[1]";
public static String PersonAddressButton=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[1]/div[2]/div/form/div[3]/div/button[1]";
public static String SaveNewPersonButton=".//*[@id='mainSection']/div/div/fieldset/div/div[2]/button";
public static String AddNewOrgButton=".//*[@id='ng-app']/body/section/div/div/div/form/fieldset/div[5]/div/button[2]";
public static String commFindAddress=".//*[@id='ng-app']/body/div[2]/div/div/div[1]/div/form/fieldset/div[2]/div[4]/button";
public static String commUseThis=".//*[@id='ng-app']/body/div[2]/div/div/div[1]/div/form/fieldset/div[3]/div/div/table/tbody/tr[1]/td[2]/button";
public static String commAddressSavenutton=".//*[@id='ng-app']/body/div[2]/div/div/div[3]/button[1]";
public static String EmailLink=".//*[@id='mainSection']/div/div[3]/div[1]/div[2]/ul/li[3]/a";
public static String CommEmail=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[2]/div/div/ul/li[2]/a/tab-heading";
public static String AddNewAddressbutton=".//*[@id='ng-app']/body/section/div/div/div/form/fieldset/div/div/div[2]/div/div/div/div[1]/div/div[1]/button";
public static String edit=".//*[@id='ng-app']/body/section/div/div[4]/div/table/tbody/tr[2]/td[9]/a[1]";
public static String FindAddress=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[2]/div[2]/div/div/form/div/div[1]/div/ng-form/fieldset/div[2]/div[4]/button";
public static String UseThisAddress=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[2]/div[2]/div/div/form/div/div[1]/div/ng-form/fieldset/div[3]/div/div/table/tbody/tr[1]/td[2]/button";
public static String AddressType=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[2]/div[2]/div/div/form/div/div[2]/div/div/ng-form/fieldset/div[9]/div/div[2]/input";
public static String CreateNewPersonBtn=".//*[@id='mainSection']/div/div/fieldset/div/div[2]/button";
public static String OrgAddress=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[1]/div[2]/div/form/div[3]/div/button[1]";
public static String OrgFindAddress=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[2]/div[2]/div/div/form/div/div[1]/div/ng-form/fieldset/div[2]/div[4]/button";
public static String OrgUsethisAddress=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[2]/div[2]/div/div/form/div/div[1]/div/ng-form/fieldset/div[3]/div/div/table/tbody/tr[1]/td[2]/button";
public static String OrgEmaillink=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[3]/div[1]/h4/a/span";
public static String OrgCreateBtn=".//*[@id='mainSection']/div/div/fieldset/div/div[2]/button";
public static String AdSearchView=".//*[@id='mainSection']/div/div[5]/div/div/div/div/div/table/tbody/tr/td[11]/a[1]";
public static String CommAddbtn=".//*[@id='mainSection']/div/div[3]/div[1]/div[3]/rhs-form/ng-form/div/div/div/div[3]/button";
public static String CommWebsiteAddBtn=".//*[@id='mainSection']/div/div[3]/div[1]/div[3]/rhs-form/ng-form/div/div/div/div[3]/button";
public static String CommTelAddbtn=".//*[@id='mainSection']/div/div[3]/div[1]/div[3]/rhs-form/ng-form/div/div/div/div[5]/button";
public static String SociaMediaAddBtn=".//*[@id='mainSection']/div/div[3]/div[1]/div[3]/rhs-form/ng-form/div/div/div/div[3]/button";
public static String OrgSearchbtn=".//*[@id='mainSection']/div/div/div/div/div/div/div[3]/div/label[2]";
public static String OrgViewButton=".//*[@id='mainSection']/div/div[6]/div/div/div/div/div/table/tbody/tr[1]/td[11]/a[2]";
public static String SearchExitUserBtn=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[3]/section/div/div/div/div/div[1]/div/label";
public static String SelectOnlineAcc=".//*[@id='ng-app']/body/div[2]/div/div/form/table/tbody/tr[3]/td[3]/button";
public static String AddOnlineAccountBtn=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[3]/section/div/div/div/div/div[2]/button";
public static String UpdateOnlineAccBtn=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[1]/div/div/div[1]/div[2]/div[2]/div[3]/div/button[1]";
public static String DisassociateSchoolAccountbtn=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[3]/section/div/table/tbody/tr[2]/td[10]/button";
public static String OrgSearchView2=".//*[@id='mainSection']/div/div[6]/div/div/div/div/div/table/tbody/tr[4]/td[11]/a[2]";
public static String OnlineAcc2=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/ul/li[3]/a/tab-heading";
public static String SearchExistingOnlineAcc2=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[3]/section/div/div/div/div/div[1]/div/label";
public static String SelectOnlineAcc2=".//*[@id='ng-app']/body/div[2]/div/div/form/table/tbody/tr[13]/td[3]/button";                                   
public static String AddOnlineBtn2=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[3]/section/div/div/div/div/div[2]/button";                                
public static String DisassociateOnlineAcc2=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[3]/section/div/table/tbody/tr[1]/td[10]/button";
public static String IdSearch=".//*[@id='ng-app']/body/header/nav/div/div[2]/ul[2]/li[1]/div/label[1]";
public static String relationshipSearchbtn=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[5]/ng-form/div/div/div[3]/div/label";
public static String RelationshipSelect=".//*[@id='ng-app']/body/div[2]/div/div/form/table/tbody/tr[2]/td[4]/button";
public static String RelationshipAddBtn=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[5]/ng-form/div/div/div[6]/button";
public static String EditRelationshipBtn=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[5]/table/tbody/tr[2]/td[7]/button";
public static String RelationshipEditTextFeild=".//*[@id='ng-app']/body/div[2]/div/div/form/fieldset/div[4]/div/textarea";
public static String RelationshipOkBtn=".//*[@id='ng-app']/body/div[2]/div/div/form/div/button[1]";
public static String AddNote=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[6]/table/tbody/tr/th[6]/button";
public static String SaveNote=".//*[@id='ng-app']/body/div[2]/div/div/form/div/button[2]";
public static String EditNote=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[6]/table/tbody/tr[5]/td[6]/button";
public static String SchoolSearchBtn=".//*[@id='mainSection']/div/div/div/div/div/div/div[3]/div/label[3]"; 



//CHECKBOXES
public static String SetPrimaryAccount=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[3]/section/div/table/tbody/tr[1]/td[9]/input";
public static String SetPrimaryAccount2=".//*[@id='mainSection']/div[2]/div/div/form/fieldset/div[2]/div/div[3]/section/div/table/tbody/tr[2]/td[9]/input";



//RadioButton
public static String CommEmailRadioBtn=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[2]/div/div/div/div[2]/ng-form/div[2]/div/table/tbody/tr[2]/td[4]/input";
public static String CommEmailRadioBtn2=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[2]/div/div/div/div[2]/ng-form/div[2]/div/table/tbody/tr[4]/td[4]/input";
public static String CommWebsiteRadioBtn=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[2]/div/div/div/div[3]/div/div/table/tbody/tr[2]/td[4]/input";
public static String CommWebsiteRadioBtn2=".//*[@id='mainSection']/div[2]/div/div/form/fieldset/div[2]/div/div[2]/div/div/div/div[3]/div/div/table/tbody/tr[4]/td[4]/input";
public static String CommtelRadioBtn=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[2]/div/div/div/div[4]/div[2]/div/table/tbody/tr[2]/td[7]/input";
public static String CommtelRadioBrn2=".//*[@id='mainSection']/div[2]/div/div/form/fieldset/div[2]/div/div[2]/div/div/div/div[4]/div[2]/div/table/tbody/tr[4]/td[7]/input";
public static String CommSMradioBtn=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[2]/div/div/div/div[5]/div/div/table/tbody/tr[2]/td[4]/input";
public static String CommSMradioBtn2=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[2]/div/div/div/div[5]/div/div/table/tbody/tr[4]/td[4]/input";



//Links
public static String AdvanceSearch=".//*[@id='mainSection']/div/div/div/div/div[2]/div/div[3]/div/button";
public static String Afghanistan="//*[@id='ui-select-choices-row-3-0']/div/div/div/div";
public static String AddressLink=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[2]/div[1]/h4/a/span";
public static String Email=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[3]/div[1]/h4/a/span";
public static String PersonRegTel=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[4]/div[1]/h4/a/span";
public static String PersonDetail=".//*[@id='mainSection']/div/div/div/form/fieldset/legend/h3";
public static String OrgTelLink=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[4]/div[1]/h4/a/span";
public static String CommWebsitebtn=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[2]/div/div/ul/li[3]/a/tab-heading";
public static String CommTelLink=".//*[@id='mainSection']/div/div[3]/div[1]/div[2]/ul/li[5]/a";
public static String CommSocialMediaLink=".//*[@id='mainSection']/div/div[3]/div[1]/div[2]/ul/li[6]/a";
public static String OnlineAccount=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/ul/li[3]/a/tab-heading";
public static String EditOnlineAccount=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[3]/section/div/table/tbody/tr[1]/td[2]/a";
public static String CommunicationDetail2=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/ul/li[2]/a/tab-heading";
public static String CommEmailLink2=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[2]/div/div/ul/li[2]/a/tab-heading";
public static String CommWebsiteLink2=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[2]/div/div/ul/li[3]/a/tab-heading";
public static String CommTelLink2=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[2]/div/div/ul/li[4]/a/tab-heading";
public static String CommSocialMediaLink2=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[2]/div/div/ul/li[5]/a/tab-heading";
public static String Relationshiptab=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/ul/li[5]/a/tab-heading";
public static String NoteTabs=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/ul/li[6]/a/tab-heading";
public static String OrgView3=".//*[@id='mainSection']/div/div[6]/div/div/div/div/div/table/tbody/tr[1]/td[11]/a[2]";
public static String CommAddressLink=".//*[@id='mainSection']/div/div[3]/div[1]/div[2]/ul/li[2]/a";
public static String AddCommAddress=".//*[@id='mainSection']/div/div[3]/div[1]/div[3]/rhs-form/div/div/div[1]/table/tbody/tr[1]/th[7]/button";
public static String CommPOSTCODE2=".//*[@id='ng-app']/body/div[2]/div/div/div[1]/div/ng-form/fieldset/div[2]/div[1]/div[1]/div/input";
public static String CommFindAddress2=".//*[@id='ng-app']/body/div[2]/div/div/div[1]/div/ng-form/fieldset/div[2]/div[4]/button";
public static String CommUseThis2=".//*[@id='ng-app']/body/div[2]/div/div/div[1]/div/ng-form/fieldset/div[3]/div/div/table/tbody/tr[1]/td[2]/button";
public static String CommAddressSaveBtn2=".//*[@id='ng-app']/body/div[2]/div/div/div[3]/button[2]";


//DropDown
public static String Titledropdown=".//*[@id='ng-app']/body/section/div/div/fieldset/accordion/div/div[1]/div[2]/div/form/div[1]/div/div[1]/div[1]/div/a/span[1]";
public static String Titletextfeild=".//*[@id='ng-app']/body/section/div/div/fieldset/accordion/div/div[1]/div[2]/div/form/div[1]/div/div[1]/div[1]/div/div/div/input";
public static String PersonSource1=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[1]/div[2]/div/form/div[2]/div/div[1]/select";
public static String TitleDrop=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[1]/div[2]/div/form/div[1]/div/div[1]/div[1]/div/a/span[1]";
public static String DateDOB=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[1]/div[2]/div/form/div[1]/div/div[7]/div[1]/div/div[1]/select";
public static String MonthDOB=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[1]/div[2]/div/form/div[1]/div/div[7]/div[1]/div/div[2]/select";
public static String YearDOB=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[1]/div[2]/div/form/div[1]/div/div[7]/div[1]/div/div[3]/select";
public static String EmailType=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[3]/div[2]/div/ng-form/div/div/div[2]/select";
public static String TelType=".//*[@id='tel']/div/div/div[4]/select";
public static String OrgEmailDropDown=".//*[@id='mainSection']/div/div/fieldset/accordion/div/div[3]/div[2]/div/ng-form/div/div/div[2]/select";
public static String commDialCode=".//*[@id='mainSection']/div/div[3]/div[1]/div[3]/rhs-form/ng-form/div/div/div/div[1]/select";
public static String CommSocialMediaType=".//*[@id='mainSection']/div/div[3]/div[1]/div[3]/rhs-form/ng-form/div/div/div/div[2]/select";
public static String RelationshipGroup=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[5]/ng-form/div/div/div[1]/select";
public static String RelationshipType=".//*[@id='mainSection']/div/div/div/form/fieldset/div[2]/div/div[5]/ng-form/div/div/div[2]/select";



//Create Ad Hoc Documents
 public static String ContactManagement=".//*[@id='ng-app']/body/header/nav/div/div[2]/ul[1]/li[1]/a";
 public static String CreateNewtemplate=".//*[@id='mainSection']/div/div/div/div/div[1]/nav/div[2]/div/accordion/div/button";
 public static String DocName=".//*[@id='templateForm']/div/div[1]/div[1]/div[1]/input";
 public static String DocNote=".//*[@id='templateForm']/div/div[1]/div[2]/div[1]/textarea";
 public static String TempTopic=".//*[@id='templateForm']/div/div[2]/div[1]/div[1]/select";
 public static String DocType=".//*[@id='templateForm']/div/div[2]/div[3]/div[1]/select";
 public static String DocFormat=".//*[@id='templateForm']/div/div[2]/div[4]/div[1]/select";
 public static String DocDeprtment=".//*[@id='templateForm']/div/div[2]/div[5]/div[1]/select";
 public static String DocMergeHeaderType=".//*[@id='templateForm']/div/div[2]/div[6]/div[1]/select";
 public static String DocTempSubTop=".//*[@id='templateForm']/div/div[2]/div[2]/div[1]/select";
 public static String DocTextField=".//*[@id='taTextElement9656850221054342']/table/tbody/tr/td/p";
 public static String DocSnippets=".//*[@id='mainSection']/div/div/div/div/div[2]/div/div/div[4]/div/div[1]/div[8]/span/button";
 public static String DocCreateNewTemplate=".//*[@id='mainSection']/div/div/div/div/div[2]/div/div/div[5]/div[2]/button[5]";
 public static String DocumentCode="//*[@id='templateForm']/div/div[1]/div[3]/div[1]/input";
 public static String CreateDocWizardNextButton="//*[@id='wizard']/div/div[1]/div[1]/a[2]";
 public static String UseThisButton="//*[@id='wizard']/div/div[2]/div[2]/div[1]/div[2]/div[7]/ul/li[5]/span/button";
 public static String SaveChangesbutton="//*[@id='wizard']/div/div[3]/div[3]/button[5]";
 public static String CancelButton="//*[@id='ng-app']/body/div[3]/div/div/div[3]/button";
 
 
 public static String SearchCRM=".//*[@id='ng-app']/body/header/nav/div/div[2]/ul[2]/li[1]/input";
 public static String CRMID=".//*[@id='ng-app']/body/header/nav/div/div[2]/ul[2]/li[1]/div/label[1]";
 public static String CreateAdHocDocButton=".//*[@id='mainSection']/div/div/div/form/fieldset/legend/h3/small/button";
 public static String CreateDocDocFormat="//*[@id='wizard']/div/div[1]/div[2]/ng-form/div[1]/div[1]/select";
 public static String ClickToAssociate="//*[@id='wizard']/div/div[1]/div[2]/ng-form/div[2]/div[1]/div[2]/table/tbody/tr/td[5]/input";
 public static String SelectAddress="//*[@id='wizard']/div/div[1]/div[2]/ng-form/div[2]/div[1]/div[1]/div/select";
 

 
 
// Course Creation
 public static String CourseCode=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/ng-form/fieldset/div[1]/div[1]/div/input";
 public static String CourseTitle=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/ng-form/fieldset/div[1]/div[2]/div/input";
 public static String CourseSummary=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/ng-form/fieldset/div[2]/div/div/textarea";
 public static String WebImgUrl=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/ng-form/fieldset/div[3]/div/div/input";
 public static String CourseLearningOutcome=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/ng-form/fieldset/div[4]/div/div/rhs-delimited-list-builder/div[1]/textarea";
 public static String CourseAddictionalInfo=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/ng-form/fieldset/div[5]/div/div/textarea";
 public static String CourseType=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/ng-form/fieldset/div[6]/div/div/select";
 public static String CourseMultiSession=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/ng-form/fieldset/div[7]/div[1]/div/input";
 public static String CourseSkillLevel=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/ng-form/fieldset/div[7]/div[2]/div/select";
 public static String CourseKeyStage=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/ng-form/fieldset/div[7]/div[3]/div/select";
 public static String CoursePartnerOrg=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/ng-form/fieldset/div[8]/div[3]/div/input";
 public static String CourseMainDetailsNextButton=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/ng-form/div/a";
 
 
 
 
 //Course Date/Location
 public static String CourseDateLocationTab=".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/ul/li[2]/a";
 public static String CourseStartDate=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form[1]/ng-form/div[1]/div/span/button";
 public static String COurseDatePicket=".//*[@id='datepicker-1405-1277-23']/button";
 public static String CourseCalendar=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form[1]/ng-form/div[1]/div/span/button";
 public static String CourseStartdateToday=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form[1]/ng-form/div[1]/div/ul/li[2]/span/button[1]";
 public static String CourseEndDate=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form[1]/ng-form/div[2]/div/div/span/button";
 public static String CourseEndDateToday=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form[1]/ng-form/div[2]/div/div/ul/li[2]/span/button[1]";
 public static String CourseBookingCloseDate=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form[1]/ng-form/div[3]/div/span/button";
 public static String CourseBookingCloseDateToday=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form[1]/ng-form/div[3]/div/ul/li[2]/span/button[1]";
 public static String CourseVenue=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form[2]/ng-form/div[1]/venues/select";
 public static String CourseWebVenueDesc=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form[2]/ng-form/div[2]/div/textarea";
 public static String CourseRegion=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form[2]/ng-form/div[3]/div/select";
 public static String CourseDateLocatnNextbutton=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form[2]/a/span";
 public static String CourseCapacityTab=".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/ul/li[3]/a";
 public static String CourseMinBooking=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/form/div[1]/div/input";
 public static String CourseMaxBooking=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/form/div[2]/div/input";
 public static String CourseCurrentBooking=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/form/div[3]/div/input";
 public static String CourseBookingPayMethod=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/form/div[4]/div/select";
 public static String CourseBookingAllowed=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/form/div[5]/div/input";
 public static String CourseWebBookingAllowed=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/form/div[6]/div/input";
 public static String CourseFinancialAmount=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/form/div[8]/div/input";
 public static String CourseFinancialThreahold=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/form/div[9]/div/input";
 public static String CourseCapacityNextButton=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/form/div[8]/a";
 
 
 
 //Course Session tab
 public static String SessionTab=".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/ul/li[4]/a";
 public static String AddNewSession=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div/div[1]/h4/a/b";
 public static String CourseSessionTitle=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[1]/div/input";
 public static String CourseSessionStartDate=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[2]/div/span/button";
 public static String CourseSessionStartDateToday=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[2]/div/ul/li[2]/span/button[1]";
 public static String CourseSessionEndDate=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[3]/div/span/button";
 public static String CourseSessionEndDateToday=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[3]/div/ul/li[2]/span/button[1]";
 public static String CourseMaxPaidBooking=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[6]/div/input";
 public static String CourseMaxComplimentaryBooking=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[7]/div/input";
 public static String CourseVenueLocation=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[11]/locations/select";
 public static String CoursePrimaryTrainer=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[12]/div/select";
 public static String CourseSecondaryTrainer=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div/div[2]/div/rhs-form/form/div[13]/div/select";
 public static String CourseAcademicYear=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div/div[2]/div/rhs-form/form/div[16]/div/div/select";
 public static String CourseIsMandatory=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div/div[2]/div/rhs-form/form/div[17]/div/input";
 public static String CourseSessionNextButton=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[21]/a/span";
 public static String CourseSessionTab=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div/div[1]/h4/a/b";
 public static String CourseNextButton=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/rhs-form/form/div[8]/a/span";


 
// COurse Ticket and Price
public static String TicketPriceTab=".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/ul/li[5]/a";
public static String AddNewTicketPrice=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div/div[1]/h4/a/b";
public static String CosDesc=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[1]/div[1]/div/input";
public static String CosPrice=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[1]/div[2]/div/input";
public static String CosEarlyDisc=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[2]/div[2]/div/input";
public static String CosMultiBkDisc=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[3]/div[2]/div/input";
public static String CosMultiBKThread=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[3]/div[4]/div/input";
public static String EarlyBirdValidToDate=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[2]/div[4]/div/span/button";
public static String EarlyBirdToday=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[2]/div[4]/div/ul/li[2]/span/button[1]";
public static String CostCentreAccount=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[4]/div[2]/div/select";
public static String RestrictedFund=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[4]/div[4]/div/select";
public static String SubCostCenterAccount=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div[2]/div[2]/div/rhs-form/form/div[4]/div[3]/div/select";
public static String CosTicketPriceNextButton=".//*[@id='mainSection']/div/div[4]/div[1]/div[4]/div/accordion/div/div/div[2]/div/rhs-form/div/a";
public static String AddCourseButton=".//*[@id='mainSection']/div/div[4]/div[1]/div[5]/rhs-form/div[5]/button";



//Add New Trainer
public static String AddTrainerButton=".//*[@id='mainSection']/div/div[4]/div[1]/div/div[2]/div/table/thead/tr/th[5]/a/span[1]";
public static String SearchTrainer="//*[@id='ng-app']/body/div[2]/div/div/div/div/div/div[1]/ng-form/fieldset/div[1]/div[1]/input";
public static String TrainerName="//*[@id='ng-app']/body/div[2]/div/div/div/div/div/div[1]/ng-form/fieldset/div[2]/div/input";
public static String QCFLevel="//*[@id='ng-app']/body/div[2]/div/div/div/div/div/div[1]/ng-form/fieldset/div[3]/div/select";
public static String Qualification="//*[@id='ng-app']/body/div[2]/div/div/div/div/div/div[1]/ng-form/fieldset/div[4]/div/select";
public static String AdditionalWorkDetails="//*[@id='ng-app']/body/div[2]/div/div/div/div/div/div[1]/ng-form/fieldset/div[5]/div/textarea";
public static String TrainersNote="//*[@id='ng-app']/body/div[2]/div/div/div/div/div/div[1]/ng-form/fieldset/div[6]/div/textarea";
public static String IsAvailable="//*[@id='ng-app']/body/div[2]/div/div/div/div/div/div[1]/ng-form/fieldset/div[7]/div/input";
public static String Ok="//*[@id='ng-app']/body/div[2]/div/div/div/div/div/div[1]/ng-form/div/button[1]";
public static String SearchButton="//*[@id='ng-app']/body/div[2]/div/div/div/div/div/div[1]/ng-form/fieldset/div[1]/div[2]/label";
public static String SelecttrainerButton="//*[@id='ng-app']/body/div[3]/div/div/div/table/tbody/tr[2]/td[4]/button";



//Add New Venue
public static String AddVenuButton="//*[@id='mainSection']/div/div[4]/div[1]/div[2]/div/table/thead/tr/th[6]/a/span[1]";
public static String VenueDesc="//*[@id='mainSection']/div/div[4]/div[1]/div[2]/rhs-form/ng-form/fieldset/div[1]/div/div[1]/input";
public static String VenueNote="//*[@id='mainSection']/div/div[4]/div[1]/div[2]/rhs-form/ng-form/fieldset/div[2]/div/div/textarea";
public static String VenueParkingDetails="//*[@id='mainSection']/div/div[4]/div[1]/div[2]/rhs-form/ng-form/fieldset/div[3]/div/div/textarea";
public static String VenuePublicTran="//*[@id='mainSection']/div/div[4]/div[1]/div[2]/rhs-form/ng-form/fieldset/div[4]/div/div/textarea";
public static String VenueAccess="//*[@id='mainSection']/div/div[4]/div[1]/div[2]/rhs-form/ng-form/fieldset/div[5]/div/div/textarea";
public static String VenueCapacity="//*[@id='mainSection']/div/div[4]/div[1]/div[2]/rhs-form/ng-form/fieldset/div[6]/div/div/div[1]/input";
public static String VenueOrgSearch=".//*[@id='mainSection']/div/div[4]/div[1]/div[2]/rhs-form/ng-form/fieldset/div[1]/div/div[1]/div/a/span[1]";
public static String VenueSearchField=".//*[@id='mainSection']/div/div[4]/div[1]/div[2]/rhs-form/ng-form/fieldset/div[1]/div/div[1]/div/div/div/input";
public static String SaveVenueButton=".//*[@id='mainSection']/div/div[4]/div[1]/div[2]/rhs-form/ng-form/div";



//Upload Image
public static String TrainerMainDetails="//*[@id='mainSection']/div/div[4]/div[1]/div/div[2]/div/table/tbody/tr[1]/td[5]/div/a";
public static String UploadDoc="//*[@id='mainSection']/div/div[4]/div[1]/div[1]/ul/li[5]/a";
public static String SelectFileToUpload="//*[@id='mainSection']/div/div[4]/div[1]/div[3]/div/div/div/div[2]/form/div[2]/div/span[1]";


//Right Move
public static String SearchBar=".//*[@id='searchLocation']";
public static String forSale=".//*[@id='buy']";
public static String ChooseLocation=".//*[@id='locationIdentifier']/option[2]";
public static String SearchRadius=".//*[@id='radius']";
public static String PriceRangeMinPrice=".//*[@id='minPrice']";
public static String PriceRangeMaxPrice=".//*[@id='maxPrice']";
public static String NoOfBedMin=".//*[@id='minBedrooms']";
public static String NoOfBedMax=".//*[@id='maxBedrooms']";
public static String PropertyType=".//*[@id='displayPropertyType']";
public static String AddedSite=".//*[@id='maxDaysSinceAdded']";
public static String IncludeUnderRadio=".//*[@id='includeSSTC1']";
public static String FindPropertyBtn=".//*[@id='submit']";



//Business Sector
 public static String BizSectorLink=".//*[@id='mainSection']/div/div[3]/div[1]/div[2]/ul/li[10]/a";
 public static String BizSectorTextFeild=".//*[@id='mainSection']/div/div[3]/div[1]/div[3]/rhs-form/ng-form/div/div/div/div[1]/select";
 public static String BizSectorNote=".//*[@id='mainSection']/div/div[3]/div[1]/div[3]/rhs-form/ng-form/div/div/div/div[2]/textarea";
 public static String BizSectorAddBtn=".//*[@id='mainSection']/div/div[3]/div[1]/div[3]/rhs-form/ng-form/div/div/div/div[3]/button";
 
 
//Multi Session
public static String primaryTrainer=".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/div/accordion/div/div[1]/div[2]/div/rhs-form/form/div[12]/div/select";
public static String CosSessionSaveButton=".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/div/accordion/div/div[1]/div[2]/div/rhs-form/form/div[19]/a";


//Cos Booking
public static String AddNewBooking=".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/div/button";
public static String Bookertextfield=".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/div/div[2]/rhs-form/ng-form/div/div[1]/div[1]/div/a/span[1]";
public static String searchperson=".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/div/div[2]/rhs-form/ng-form/div/div[1]/div[1]/div/div/div/input";
public static String Bookingtab=".//*[@id='mainSection']/div/div[4]/div[1]/div[1]/ul/li[12]/a";
public static String CosBKSource=".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/div/div[2]/rhs-form/ng-form/div/div[2]/div/select";
public static String CosBKPayMethod=".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/div/div[2]/rhs-form/ng-form/div/div[3]/div/select";
public static String CosStatus=".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/div/div[2]/rhs-form/ng-form/div/div[4]/div/select";
public static String CosBKQuantity=".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/div/div[2]/rhs-form/ng-form/div/div[5]/div[1]/input";
public static String CosBKAddButton=".//*[@id='mainSection']/div/div[4]/div[1]/div[3]/div/div[2]/rhs-form/ng-form/div/div[6]/button[1]";



//public static String
//public static String
//public static String
//public static String
//public static String
//public static String
//public static String
//public static String
//public static String
//public static String
//public static String
//public static String
//public static String



 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
//public static String
//public static String
//public static String
}
