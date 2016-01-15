package Problems;
import java.math.*;
public class Problem1 {

	public int[][] timeMeeting = new int[][] {
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
			{0,1,1,1,2,1,1,1,1,1,1,2,1,2,1,1,1,1,2,1},
			{1,0,1,1,2,2,1,1,1,1,1,1,1,1,1,2,2,1,1,2},
			{1,1,0,1,1,2,2,1,1,2,2,2,2,2,2,1,2,2,1,1},
			{1,1,1,0,1,2,2,2,2,2,1,1,1,2,2,1,1,2,2,2},
			{2,2,1,1,0,2,2,2,1,1,1,2,1,2,1,2,2,1,2,2},
			{1,2,2,2,2,0,1,1,1,1,2,1,2,1,2,1,1,2,2,1},
			{1,1,2,2,2,1,0,1,2,1,1,1,1,1,2,2,2,1,1,2},
			{1,1,1,2,2,1,1,0,2,1,1,2,1,1,2,1,2,1,2,1},
			{1,1,1,2,1,1,2,2,0,2,2,1,1,1,2,2,2,2,1,2},
			{1,1,2,2,1,1,1,1,2,0,1,2,2,2,2,2,1,1,2,2},
			{1,1,2,1,1,2,1,1,2,1,0,1,2,1,1,2,1,2,1,1},
			{2,1,2,1,2,1,1,2,1,2,1,0,1,2,2,2,2,1,2,2},
			{1,1,2,1,1,2,1,1,1,2,2,1,0,1,1,2,2,2,1,1},
			{2,1,2,2,2,1,1,1,1,2,1,2,1,0,2,1,1,2,1,1},
			{1,1,2,2,1,2,2,2,2,2,1,2,1,2,0,2,1,2,2,1},
			{1,2,1,1,2,1,2,1,2,2,2,2,2,1,2,0,1,1,2,2},
			{1,2,2,1,2,1,2,2,2,1,1,2,2,1,1,1,0,2,2,2},
			{1,1,2,2,1,2,1,1,2,1,2,1,2,2,2,1,2,0,1,1},
			{2,1,1,2,2,2,1,2,1,2,1,2,1,1,2,2,2,1,0,2},
			{1,2,1,2,2,1,2,1,2,2,1,2,1,1,1,2,2,1,2,0}			
	};
		
	
	public int[][] employeesMeeting = new int[][] {
	    	{-1,-1,-1,-1,-1,-1},
			{2, 6, 7, 9,19,-1},
			{2, 5, 6,12,16,-1},
			{1, 3, 8, 9,16,-1},
			{1, 6,15,16,18,-1},
			{1, 3, 8,13,18,-1},
			{8,10,11,17,20,-1},
			{3, 8,10,13,20,-1},
			{1, 3,14,16,20,-1},
			{6, 7, 9,16,19,-1},
			{2, 6, 7,12,17,19},
			{2, 6, 7, 9,13,-1},
			{2, 4, 7,12,16,-1},
			{2, 6, 7, 9,16,18},
			{2, 5,11,17,18,-1},
			{1, 5,11,17,18,20},
			{6, 8,12,16,18,-1},
			{6, 7,15,17,19,-1},
			{1, 7,11,18,20,-1},
			{4, 5, 9,10,13,-1},
			{4, 7, 9,17,18,-1},
			{7,10,11,12,17,-1},
			{5, 6, 9,13,18,-1},
			{1, 9,11,17,18,-1},
			{2,11,14,15,17,-1},
			{1, 3,14,15,16,-1},
			{5, 6,10,13,15,-1},
			{8,11,15,17,18,-1},
			{1, 4, 7, 9,16,-1},
			{1,11,13,18,20,-1},
			{2, 5,12,13,18,-1},
			{2, 6, 8,12,16,-1},
			{2, 7,15,17,19,-1},
			{6, 7,15,17,18,-1}
		};
		
    public int[] finalSchedule = new int[]{
				-1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0
		};
		
    public int meetingNumber = 20;
	public int employeeNumber = 33;
	public int timeSlots = 12;

	
	public Problem1()
	{
		
	}
}
