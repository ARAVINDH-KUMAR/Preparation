// Java program to implement
// the above approach

class GFG{

// Function to get
// the closest value
static int clostVal(int arr[], int N,
					int K)
{
	
	// Stores the closest
	// value to K
	int res = arr[0];

	// Traverse the array
	for(int i = 1; i < N; i++)
	{
		
		// If absolute difference
		// of K and res exceeds
		// absolute difference of K
		// and current element
		if (Math.abs(K - res) > Math.abs(K - arr[i]))
		{
			res = arr[i];
		}
	}

	// Return the closest
	// array element
	return res;
}

// Driver Code
public static void main (String[] args)
{
	int arr[] = { 100, 200, 400 };
	int K = 300;
	int N = arr.length;
	
	System.out.print(clostVal(arr, N, K));
}
}

// This code is contributed by code_hunt
