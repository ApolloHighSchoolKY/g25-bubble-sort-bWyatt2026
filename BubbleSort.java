import java.util.Arrays;
public class BubbleSort
{
	
	public static void main(String[] args)
  {
    int[] myNums = {12, 15, 0, 44, 13, 1, 2};
	{
		int passes = myNums.length;
		int comparisons;
		int tempNum;

		//Loop once for each pass, where passes is one less than the number of items.
		for(int i = 0; i<passes - 1; i++)
		{
			//Loop once for each comparison, where comparisons are one less than the number of unsorted.
			for(comparisons =0; comparisons<passes;i++)
			{
				//If they are out of order, swap the values
				if(myNums[comparisons] > myNums[comparisons + 1])
				{
					tempNum = myNums[comparisons];
					myNums[comparisons] = myNums[comparisons+1];
					myNums[comparisons +1] = tempNum;
				}
			}
			//End Loop for comparisons
     
			//The next pass will use one less comparison
			passes = myNums.length-1;
		} 
		//End Loop for passes
		Arrays.toString(myNums);
	}

  }
}
