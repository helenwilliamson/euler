package com.euler

/**
 * Created by IntelliJ IDEA.
 * User: helen
 * Date: 01/05/12
 * Time: 12:27
 * To change this template use File | Settings | File Templates.
 */

object NaturalNumbers {

  def findNaturalNumbers(i: Int):List[Int] = {
    val list = List.range(1, i)
    return list.filter((element:Int) => ((element % 3 == 0) || element % 5 == 0));
  }

}
