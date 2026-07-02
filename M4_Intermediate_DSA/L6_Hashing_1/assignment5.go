package main

func SolveA5(A []int) int {
	hs := make(map[int]struct{})

	for i := range A {
		hs[A[i]] = struct{}{}
	}

	return len(hs)
}
