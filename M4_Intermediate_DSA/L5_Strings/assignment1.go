package main

func To_lower(A []byte) []byte {
	for i := range A {
		if A[i] >= 'A' && A[i] <= 'Z' {
			A[i] += 32
		}
	}

	return A
}
