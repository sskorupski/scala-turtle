package edu.sskorupski.turtle

import edu.sskorupski.turtle.Movement.{Backward, Forward, ToLeft, ToRight}
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.contain
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class MainSpec extends AnyFlatSpec {

  "simulate" should "return expected (x,y)" in {
    // GIVEN
    val actions: Seq[Movement] = Seq("F", "R", "R", "F", "L")
      .map(Movement(_))
      .collect { case Right(movement) => movement }

    val cursor: Cursor = Cursor(0, 0)
    // WHEN
    val cursorResult = Main.simulate(actions, cursor)
    // THEN
    cursorResult shouldBe Cursor(1, -2)
  }

  "letterToMovement" should "return unknown letter as Left and known letters as Right" in {
    // Given
    val letters = Seq("F", "B", "R", "L", "G")
    // When
    val (invalids, valids) = Main.letterToMovement(letters)
    // Then
    valids should contain theSameElementsAs Seq(Forward, Backward, ToRight, ToLeft)
    invalids should contain theSameElementsAs Seq("G")
  }
}
