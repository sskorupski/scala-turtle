package edu.sskorupski.turtle

sealed trait Movement {
  def move(cursor: Cursor): Cursor
}

case object Forward extends Movement {
  override def move(cursor: Cursor): Cursor = cursor.copy(y = cursor.y - 1)
}

case object Backward extends Movement {
  override def move(cursor: Cursor): Cursor = cursor.copy(y = cursor.y + 1)
}

case object Left extends Movement {
  override def move(cursor: Cursor): Cursor = cursor.copy(x = cursor.x - 1)
}

case object Right extends Movement {
  override def move(cursor: Cursor): Cursor = cursor.copy(x = cursor.x + 1)
}

case object Idle extends Movement {
  override def move(cursor: Cursor): Cursor = cursor
}

object Movement {
  def apply(action: String): Movement = action match {
    case "F" => Forward
    case "B" => Backward
    case "L" => Left
    case "R" => Right
  }
}