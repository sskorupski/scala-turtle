package edu.sskorupski.turtle

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class ModelSpec extends AnyFlatSpec {

  "Grille" should "have expected size with single Int constructor" in {
    // Given
    val size = 15
    // When
    val grille = Grille(15)
    // Then
    grille.width shouldBe size
    grille.height shouldBe size
  }

}
