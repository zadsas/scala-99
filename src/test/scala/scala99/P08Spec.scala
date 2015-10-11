package scala99

import org.scalatest.{FlatSpec, Matchers}

import scala99.P08.compress

class P08Spec extends FlatSpec with Matchers {

  behavior of "P08"

  it should "remove consecutive duplicates - 1" in {
    compress(List(1,1,1)) shouldBe List(1)
  }

  it should "do nothing for an empty list" in {
    compress(List()) shouldBe List()
  }

  it should "remove consecutive duplicates - 2" in {
    compress(List(1,1,1,2,2,2)) shouldBe List(1,2)
  }

  it should "remove consecutive duplicates - 3" in {
    compress(List(1,1,1,2,3,3,3)) shouldBe List(1,2,3)
  }

  it should "pass the given example" in {
    compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe List('a, 'b, 'c, 'a, 'd, 'e)
  }
}
