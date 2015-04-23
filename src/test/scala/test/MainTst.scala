package test

import org.scalatest._

class MainTst extends FeatureSpec with Matchers {

  feature("add") {
    scenario("positive numbers") {
      Main.add(3, 4) shouldEqual 7
    }
  }

}