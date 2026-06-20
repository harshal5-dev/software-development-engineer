package main

func SolveA1(A []int, B int, C int) int {
	N := len(A)
	sum := 0

	for index := 0; index < B; index++ {
		sum += A[index]
	}

	if sum == C {
		return 1
	}

	s := 1
	e := B

	for e < N {
		sum -= A[s-1]
		sum += A[e]

		if sum == C {
			return 1
		}

		s++
		e++
	}

	return 0
}
