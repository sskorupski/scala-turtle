package edu.sskorupski.turtle



case class Grille(width: Int, height: Int)

object Grille {
  def apply(side: Int): Grille = new Grille(side, side)
}