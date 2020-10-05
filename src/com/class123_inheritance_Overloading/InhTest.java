package com.class123_inheritance_Overloading;

public class InhTest {

	public static void main(String[] args) {

		System.out.println("--CREATING EMPLOYEE OBJECT--");
		InhEmployee emp =  new InhEmployee();
		InhEmployee.work();
		emp.salary = 90000;
		emp.getPaid();
		
		System.out.println("\n--CREATING SCRUM TEAM OBJECT--");
		InhScrumTeam scr = new InhScrumTeam();
		InhScrumTeam.work();
		scr.salary = 100000;
		scr.getPaid();
		scr.artifacts = "Product Backlog, Sprint Backlog and Burndown Chart";
		scr.ceremonies = "Sprint Grooming, Sprint Planning, Daily Stand Ups, Sprint Review and Sprint Retrospective";
		scr.attendMeetings();
		scr.workOnArtifacts();
		
		System.out.println("\n--CREATING DEVELOPER OBJECT--");
		InhDeveloper dev = new InhDeveloper();
		InhDeveloper.work();
		dev.salary = 120000;
		dev.getPaid();
		dev.artifacts = "Sprint Backlog";
		dev.ceremonies = "Sprint Grooming, Sprint Planning, Daily Stand Ups, Sprint Review and Sprint Retrospective";
		dev.attendMeetings();
		dev.workOnArtifacts();
		dev.code();
		InhFrontEnd devFE = new InhFrontEnd();
		devFE.doHtml();
		InhBackEnd devBE = new InhBackEnd();
		devBE.doSql();
		
		System.out.println("\n--CREATING TESTER OBJECT--");
		InhTester test = new InhTester();
		InhTester.department = "Test";
		InhTester.work();
		test.salary = 150000;
		test.getPaid();
		test.artifacts = "Sprint Backlog";
		test.ceremonies = "Sprint Grooming, Sprint Planning, Daily Stand Ups, Sprint Review and Sprint Retrospective";
		test.attendMeetings();
		test.workOnArtifacts();
		test.test();
		InhManualTester MT = new InhManualTester();
		MT.testManually();
		InhAutomationTester AT = new InhAutomationTester();
		AT.codeInJava();

		System.out.println("\n--CREATING BUSSINESS ANALYST OBJECT--");
		InhBussinessAnalyst ba = new InhBussinessAnalyst();
		InhBussinessAnalyst.work();
		ba.salary = 85000;
		ba.getPaid();
		ba.artifacts = "Sprin Backlog, Product Backlog";
		ba.ceremonies = "Sprint Grooming, Sprint Planning, Daily Stand Ups, Sprint Review and Sprint Retrospective";
		ba.attendMeetings();
		ba.workOnArtifacts();
		ba.writeUserStory();
		
		System.out.println("\n--CREATING SCRUM MASTER OBJECT--");
		InhScrumMaster sm = new InhScrumMaster();
		sm.salary = 85000;
		sm.getPaid();
		sm.artifacts="Burn Down Chart";
		sm.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Review, Sprint Retrospective";
		sm.attendMeetings();
		sm.workOnArtifacts();
		sm.scrumMeetings();
		
		System.out.println("\n--CREATING PRODUCT OWNER OBJECT--");
		InhProductOwner po = new InhProductOwner();
		po.salary = 145000;
		po.getPaid();
		po.artifacts="Sprit backlog, Product Backlog";
		po.ceremonies="Sprit grooming, Sprint Planning, Sprint Demo";
		po.attendMeetings();
		po.workOnArtifacts();
		po.talkToClient();
		
	}

}
