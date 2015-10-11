package scala99

import org.scalatest.{FlatSpec, Matchers}

import scala99.P09.pack

class P09Spec extends FlatSpec with Matchers {

  behavior of "P09"

  it should "pack consecutive duplicates - 1" in {
    pack(List(1,1,1)) shouldBe List(List(1,1,1))
  }

  it should "pack consecutive duplicates - 2" in {
    pack(List(1,1,1,2,2,2)) shouldBe List(List(1,1,1), List(2,2,2))
  }

  it should "pack consecutive duplicates - 3" in {
    pack(List(1,1,1,2,3,3,3)) shouldBe List(List(1,1,1), List(2), List(3,3,3))
  }

  it should "pass the given example" in {
    pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldBe
      List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  }
}
