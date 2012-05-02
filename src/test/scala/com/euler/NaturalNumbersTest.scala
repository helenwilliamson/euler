package com.euler

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers
import com.euler.NaturalNumbers._
import collection.immutable.List

/**
 * Created by IntelliJ IDEA.
 * User: helen
 * Date: 01/05/12
 * Time: 12:22
 * To change this template use File | Settings | File Templates.
 */

@RunWith(classOf[JUnitRunner])
class NaturalNumbersTest extends FunSuite with ShouldMatchers {

  test("natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9") {
    val numbers = findNaturalNumbers(10);
    val expected:List[Int] = List(3, 5, 6, 9);
    numbers should equal (expected);
    
    numbers.sum should equal (23);
  }

  test("natural numbers below 1000 that are multiples of 3 or 5, we get the sum 233168") {
    val numbers = findNaturalNumbers(1000);

    numbers.sum should equal (233168);
  }

}
