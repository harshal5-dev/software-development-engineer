package main

func SolveA1(A string) int {
	onesCount := 0
	N := len(A)
	ans := 0

	for _, ch := range A {
		if ch == '1' {
			onesCount++
		}
	}

	if onesCount == N {
		return N
	}

	for i := range A {
		left := 0
		right := 0

		for j := i - 1; j >= 0; j-- {
			if A[j] == '1' {
				left++
			} else {
				break
			}
		}

		for j := i + 1; j < N; j++ {
			if A[j] == '1' {
				right++
			} else {
				break
			}
		}

		count := left + right
		if count != onesCount {
			count++
		}

		if count > ans {
			ans = count
		}
	}

	return ans
}
