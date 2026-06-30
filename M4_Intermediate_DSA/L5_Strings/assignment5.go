package main

func SolveA5(A string) string {
	B := []byte(A)
	i := 0
	j := len(B) - 1

	for i < j {
		B[i], B[j] = B[j], B[i]
		i++
		j--
	}

	return string(B)
}
