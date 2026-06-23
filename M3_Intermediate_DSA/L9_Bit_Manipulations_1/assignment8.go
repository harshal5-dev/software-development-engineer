package main

func DecimalToAnyBase(A int, B int) int {
	pow := 1
	ans := 0

	for A > 0 {
		digit := A % B
		ans += digit * pow
		pow *= 10
		A /= B
	}

	return ans
}
