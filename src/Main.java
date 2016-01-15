import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Problems.Example;
import Problems.Problem1;
import Problems.Problem2;
import Problems.Problem3;


public class Main {
	
	public static void main(String[] args)
	{
		Backtracking backtracking = new Backtracking();
		
		Example example = new Example();
		Problem1 problem1 = new Problem1();
		Problem2 problem2 = new Problem2();
		Problem3 problem3 = new Problem3();
		
		backtracking.initProblem(problem1.meetingNumber, problem1.employeeNumber, problem1.timeSlots, problem1.timeMeeting, problem1.employeesMeeting, problem1.finalSchedule);
		//backtracking.initProblem(problem2.meetingNumber, problem2.employeeNumber, problem2.timeSlots, problem2.timeMeeting, problem2.employeesMeeting, problem2.finalSchedule);
		//backtracking.initProblem(problem3.meetingNumber, problem3.employeeNumber, problem3.timeSlots, problem3.timeMeeting, problem3.employeesMeeting, problem3.finalSchedule);
		
		long lStartTime = new Date().getTime();
		
		backtracking.meetingTimeIsValid(1);
		backtracking.displayResult();
	
		long lEndTime = new Date().getTime();
		long difference = lEndTime - lStartTime;
		 
		System.out.println("Elapsed milliseconds: " + difference);
	}
	
	
}
