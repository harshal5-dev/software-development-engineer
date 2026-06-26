package main

import (
	"sort"
	"strconv"
	"strings"
)

func LargestNumber(A []int) string {
	var ans strings.Builder

	sort.Slice(A, func(i, j int) bool {
		a := strconv.Itoa(A[i])
		b := strconv.Itoa(A[j])

		return a+b > b+a
	})

	if A[0] == 0 {
		return "0"
	}

	for i := range A {
		ans.WriteString(strconv.Itoa(A[i]))
	}

	return ans.String()
}
