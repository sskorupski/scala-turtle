package edu.sskorupski.turtle

object Main extends App {
  val grille: Grille = Grille(15)

  val actions: Seq[Movement] = Seq("F", "R", "R", "F", "L").map(Movement(_))
  var cursor: Cursor = Cursor(0, 0)

  def simulate(movements: Seq[Movement], cursor: Cursor): Cursor = {
    movements.foldLeft(cursor)((c, m) => m.move(c))
  }

}
