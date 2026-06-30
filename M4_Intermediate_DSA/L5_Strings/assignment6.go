package main

import "strings"

func SolveA6(A string) string {
	arr := strings.Split(A, " ")
	N := len(arr)
	var ans strings.Builder

	for i := N - 1; i >= 0; i-- {
		ans.WriteString(arr[i])
		ans.WriteString(" ")
	}

	return strings.TrimSpace(ans.String())
}
