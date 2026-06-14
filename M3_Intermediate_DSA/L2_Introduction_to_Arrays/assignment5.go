package main

func reverseArray(A []int, S, E int) {
	for S < E {
		A[S], A[E] = A[E], A[S]
		S++
		E--
	}
}

func SolveA5(A []int, B int) []int {
	N := len(A)
	if B > N {
		B %= N
	}

	reverseArray(A, 0, N-1)
	reverseArray(A, 0, B-1)
	reverseArray(A, B, N-1)

	return A
}
