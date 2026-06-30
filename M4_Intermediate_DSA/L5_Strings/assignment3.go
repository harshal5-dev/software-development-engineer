package main

func SolveA3(A string) string {
	B := []byte(A)

	for i := range B {
		if B[i] >= 'a' && B[i] <= 'z' {
			B[i] -= 32
		} else if B[i] >= 'A' && B[i] <= 'Z' {
			B[i] += 32
		}
	}

	return string(B)
}
