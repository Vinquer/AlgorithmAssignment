package Problems;

public class Example {

	public int[][] timeMeeting = new int[][] {
			{0,0,0,0,0},
			{0,1,2,1,2},
			{1,0,1,1,1},
			{2,1,0,1,1},
			{1,1,1,0,1},
			{2,1,1,1,0}
	};

	public int[][] employeesMeeting = new int[][] {
    		{-1, -1, -1},
			{2, 5,-1},
			{2,3,-1},
			{1,5,-1},
			{1, 4, 5},
			{2,4,-1},
			{1,3,-1}
	};
	
	public int[] finalSchedule = new int[]{
			-1,0,0,0,0,0
	};
	
	public int meetingNumber = 5;
	public int employeeNumber = 6;
	public int timeSlots = 5;

	
	public Example()
	{
		
	}
	
}
