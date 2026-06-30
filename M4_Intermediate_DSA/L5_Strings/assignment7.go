package main

import "strings"

func expand(p1, p2 int, A string) string {
	i, j := p1, p2
	var ans strings.Builder

	for i >= 0 && j < len(A) && A[i] == A[j] {
		i--
		j++
	}

	for k := i + 1; k < j; k++ {
		ans.WriteByte(A[k])
	}

	return ans.String()
}

func LongestPalindrome(A string) string {
	ans := ""

	for i := range A {
		subStr := expand(i, i, A)
		if len(subStr) > len(ans) {
			ans = subStr
		}
	}

	for i := range A {
		subStr := expand(i, i+1, A)
		if len(subStr) > len(ans) {
			ans = subStr
		}
	}

	return ans
}
