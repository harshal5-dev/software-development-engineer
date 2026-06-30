package main

func To_upper(A []byte) []byte {
	for i := range A {
		if A[i] >= 'a' && A[i] <= 'z' {
			A[i] -= 32
		}
	}

	return A
}
