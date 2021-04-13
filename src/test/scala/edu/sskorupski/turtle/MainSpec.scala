package edu.sskorupski.turtle

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class MainSpec extends AnyFlatSpec {

  "simulate" should "return expected (x,y)" in {
    // GIVEN
    val actions: Seq[Movement] = Seq("F", "R", "R", "F", "L").map(Movement(_))
    val cursor: Cursor = Cursor(0, 0)
    // WHEN
    val cursorResult = Main.simulate(actions, cursor)
    // THEN
    cursorResult shouldBe Cursor(1, -2)
  }
}
