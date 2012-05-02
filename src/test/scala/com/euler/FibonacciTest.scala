package com.euler

import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import com.euler.Fibonacci._

@RunWith(classOf[JUnitRunner])
class FibonacciTest extends FunSuite with ShouldMatchers {

  test("Fibonacci of 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 (less than 90) has sum 44") {
    calculate(90) should equal (44)
  }

  test("Fibonacci of 1, 2, 3, 5, 8 (less than 10) has sum 10") {
    calculate(10) should equal (10)
  }

}
