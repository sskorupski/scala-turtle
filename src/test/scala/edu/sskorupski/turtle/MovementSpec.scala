package edu.sskorupski.turtle

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class MovementSpec extends AnyFlatSpec {

  "Movement constructor" should "return Forward WITH F" in {
    // Given
    val action = "F"
    // When
    val movement = Movement.apply(action)
    // Then
    movement shouldBe Forward
  }

  it should "return Backward WITH B" in {
    // Given
    val action = "B"
    // When
    val movement = Movement.apply(action)
    // Then
    movement shouldBe Backward
  }

  it should "return Backward WITH L" in {
    // Given
    val action = "L"
    // When
    val movement = Movement.apply(action)
    // Then
    movement shouldBe Left
  }

  it should "return Backward WITH R" in {
    // Given
    val action = "R"
    // When
    val movement = Movement.apply(action)
    // Then
    movement shouldBe Right
  }
}