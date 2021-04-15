package edu.sskorupski.turtle

object Main extends App {
  val grille: Grille = Grille(15)

  var cursor: Cursor = Cursor(0, 0)
  val (invalidActions, validActions) = letterToMovement(Seq("F", "R", "R", "F", "L", "G"))

  println(s"actions non reconnue: $invalidActions")
  println(s"position finale: ${simulate(validActions, cursor)}")

  def letterToMovement(letters: Seq[String]): (Seq[String], Seq[Movement]) = {
    letters
      .map(Movement(_))
      .partitionMap {
        case Left(movement) => Left(movement)
        case Right(movement) => Right(movement)
      }
  }

  def simulate(movements: Seq[Movement], cursor: Cursor): Cursor = {
    movements.foldLeft(cursor)((c, m) => m.move(c))
  }

}
