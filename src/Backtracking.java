
import java.math.*;

public class Backtracking {

	int[][] timeMeeting;
	int[][] employeesMeeting;
	int[] finalSchedule;
	
	int meetingNumber;
	int employeeNumber;
	int timeSlots;
	
	
	int count = 0;
	
	public Backtracking() 
	{

	}
	
	public void initProblem(int meetingNumber, int employeeNumber, int timeSlots,
			int[][] timeMeeting, int [][]employeesMeeting, int[] finalSchedule)
	{
		this.meetingNumber = meetingNumber;
		this.employeeNumber = employeeNumber;
		this.timeSlots = timeSlots;
		this.timeMeeting = timeMeeting;
		this.employeesMeeting = employeesMeeting;
		this.finalSchedule = finalSchedule;	
	}
	
	public void displayResult() // Final result formatted display
	{
		for (int i = 1; i != finalSchedule.length; i++)
			System.out.println("Meeting " + i + " is scheduled at time " + finalSchedule[i]);
	}
	
	public boolean meetingHasNoConflicts(int meeting, int time) // Check any conflicts for the meeting at wanted "time"
	{
		for (int j = 1; j != employeesMeeting.length; j++) // Go through all the list of meetings that employees need to attend
				{
					for (int k = 0; k != employeesMeeting[j].length; k++)
					{
						if (employeesMeeting[j][k] == meeting) // Looking for an employee that needs to attend the meeting we want to assign at this iteration of backtracking
						{
							for (int l = 0; l != employeesMeeting[j].length; l++)								
							{								
								if (employeesMeeting[j][l] != meeting && employeesMeeting[j][l] != -1) 
								{
									if (finalSchedule[employeesMeeting[j][l]] != 0) // After going through the other meeting of this employee, we look for a meeting already schedule 
									{												// to check if the time difference is enough to avoid any conflict
										int diff = time - finalSchedule[employeesMeeting[j][l]] ;
										if (Math.abs(diff) < timeMeeting[meeting][employeesMeeting[j][l] - 1] + 1)								
										    return (false);
									}
								}
							}
						}
					}
				}				
		return (true); // return true if no conflict has been found
	}
	
	
	public boolean meetingTimeIsValid(int meeting)
	{

		if (meeting > meetingNumber) // This is the closing condition of our backtracking
		{
			System.out.println("Assignment of values: " + count);
			return true;
		}
				
		for (int t = 1; t <= timeSlots; t++) // We loop through each time slot for all meeting and try to assign them
		{
			if (this.meetingHasNoConflicts(meeting, t)) 
			{
				finalSchedule[meeting] = t; 
				count++; // Counter for assignment of values

				
				if (meetingTimeIsValid(meeting + 1))
					return (true);
			}
		}
		finalSchedule[meeting] = 0; // If we can't assign the meeting at any time we put it back to 0


		return (false); // And then we return false to backtrack to the previous working value
	}
	
}
