package main

func SolveA3(A []int) int {
	N := len(A)
	ans := 0

	preEven := make([]int, N)
	preOdd := make([]int, N)

	preEven[0] = A[0]
	for i := 1; i < N; i++ {
		if (i & 1) == 0 {
			preEven[i] = preEven[i-1] + A[i]
			preOdd[i] = preOdd[i-1]
		} else {
			preOdd[i] = preOdd[i-1] + A[i]
			preEven[i] = preEven[i-1]
		}
	}

	if preEven[N-1]-preEven[0] == preOdd[N-1]-preOdd[0] {
		ans++
	}

	for i := 1; i < N; i++ {
		sumEven := preEven[i-1] + preOdd[N-1] - preOdd[i]
		sumOdd := preOdd[i-1] + preEven[N-1] - preEven[i]

		if sumEven == sumOdd {
			ans++
		}
	}

	return ans
}
