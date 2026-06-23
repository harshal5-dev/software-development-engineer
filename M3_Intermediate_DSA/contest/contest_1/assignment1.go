package main

func SolveA1(A []int) int {
	ans := 0
	maxDistance := 0

	for i := range A {
		if (A[i] & 1) == 1 {
			maxDistance++

			if maxDistance > ans {
				ans = maxDistance
			}
		} else {
			maxDistance = 0
		}
	}

	return ans
}
