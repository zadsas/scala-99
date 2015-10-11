package scala99

import org.scalatest.{FlatSpec, Matchers}

import scala99.P05.reverse

class P05Spec extends FlatSpec with Matchers {

  behavior of "P05"

  it should "return an empty list for a empty list" in {
    reverse(List()) shouldBe List()
  }

  it should "return the same list for a one-element list" in {
    reverse(List("x")) shouldBe List("x")
  }

  it should "reverse a two-element list" in {
    reverse(List("x", 10)) shouldBe List(10, "x")
  }

  it should "pass the given example" in {
    reverse(List(1, 1, 2, 3, 5, 8)) shouldBe List(8, 5, 3, 2, 1, 1)
  }

}
