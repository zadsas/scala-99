package scala99

import java.util.NoSuchElementException

import org.scalatest.{FlatSpec, Matchers}

import scala99.P02.penultimate

class P02Spec extends FlatSpec with Matchers {

  behavior of "P02"

  it should "throw exception for an empty list" in {
    intercept[NoSuchElementException] {
      penultimate(List())
    }
  }

  it should "throw exception for a one-element list" in {
    intercept[NoSuchElementException] {
      penultimate(List(1))
    }
  }

  it should "return the first element for a two-element list" in {
    penultimate(List(1, 2)) shouldBe 1
  }

  it should "return the second element for a three-element list" in {
    penultimate(List("a", "b", "c")) shouldBe "b"
  }

  it should "pass the given example" in {
    penultimate(List(1, "a", 2, 3, 5, 8)) shouldBe 5
  }

}
