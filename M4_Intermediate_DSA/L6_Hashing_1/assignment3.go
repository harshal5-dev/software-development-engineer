package main

func SolveA3(A []int) int {
	N := len(A)
	pf := make([]int, N)

	pf[0] = A[0]
	for i := 1; i < N; i++ {
		pf[i] = pf[i-1] + A[i]
	}

	hs := make(map[int]struct{})
	for i := range pf {
		if pf[i] == 0 {
			return 1
		}
		hs[pf[i]] = struct{}{}
	}

	if len(hs) < len(pf) {
		return 1
	}

	return 0
}
