package main

func SolveA2(A int) int {
	var factorCount int

	if A == 1 {
		return 0
	}

	for num := 1; num*num <= A; num++ {
		if A%num == 0 {
			if num*num == A {
				factorCount++
			} else {
				factorCount += 2
			}

			if factorCount > 2 {
				return 0
			}
		}
	}

	return 1
}
