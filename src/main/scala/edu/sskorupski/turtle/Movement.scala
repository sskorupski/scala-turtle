package edu.sskorupski.turtle

sealed trait Movement {
  def move(cursor: Cursor): Cursor
}

object Movement {

  case object Forward extends Movement {
    override def move(cursor: Cursor): Cursor = cursor.copy(y = cursor.y - 1)
  }

  case object Backward extends Movement {
    override def move(cursor: Cursor): Cursor = cursor.copy(y = cursor.y + 1)
  }

  case object ToLeft extends Movement {
    override def move(cursor: Cursor): Cursor = cursor.copy(x = cursor.x - 1)
  }

  case object ToRight extends Movement {
    override def move(cursor: Cursor): Cursor = cursor.copy(x = cursor.x + 1)
  }

  case object Idle extends Movement {
    override def move(cursor: Cursor): Cursor = cursor
  }

  def apply(action: String): Either[String, Movement] = action match {
    case "F" => Right(Forward)
    case "B" => Right(Backward)
    case "L" => Right(ToLeft)
    case "R" => Right(ToRight)
    case s => Left(s)
  }
}