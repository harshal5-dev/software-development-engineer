package main

func SolveA2(A []int) int {
	hm := make(map[int]int)

	for i := range A {
		if v, exists := hm[A[i]]; exists {
			hm[A[i]] = v + 1
		} else {
			hm[A[i]] = 1
		}
	}

	for i := range A {
		if hm[A[i]] > 1 {
			return A[i]
		}
	}

	return -1
}
