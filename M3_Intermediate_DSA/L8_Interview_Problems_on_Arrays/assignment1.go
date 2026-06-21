package main

func SolveA1(A []int, B [][]int) []int {
	M := len(B)
	N := len(A)

	preEven := make([]int, N)
	ans := make([]int, M)

	preEven[0] = A[0]
	for i := 1; i < N; i++ {
		if (i & 1) == 0 {
			preEven[i] = preEven[i-1] + A[i]
		} else {
			preEven[i] = preEven[i-1]
		}
	}

	for i := range B {
		leftIndex := B[i][0]
		rightIndex := B[i][1]
		sum := preEven[rightIndex]

		if leftIndex > 0 {
			sum -= preEven[leftIndex-1]
		}

		ans[i] = sum
	}

	return ans
}
