package com.class123_inheritance_Overloading;

public class InhScrumTeam extends InhEmployee {

	public String artifacts;

	public String ceremonies;

	public void workOnArtifacts() {
		System.out.println("Scrum Team works on " + artifacts);
	}

	public void attendMeetings() {
		System.out.println("Scrum Team attends to " + ceremonies);
	}

	protected void method() {
		System.out.println("I am a protected method");
	}

	void method1() {
		System.out.println("I am a default method");
	}
}
