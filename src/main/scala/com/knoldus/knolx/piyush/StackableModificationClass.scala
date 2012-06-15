package com.knoldus.knolx.piyush

import scala.collection.mutable.ArrayBuffer

abstract class IntQueue {
  def get(): Int
  def put(x: Int)
}

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]
  def get() = buf.remove(0)
  def put(x: Int) { buf += x }
}

class Queue extends BasicIntQueue with Doubling

class MyQueue extends BasicIntQueue with Doubling with Incrementing with Filtering

object test extends App {

  val queue = new Queue
  queue.put(10)
  queue.put(20)
  queue.put(30)

  println(queue.get)
  println(queue.get)
  println(queue.get)

  val Myqueue = new MyQueue
  Myqueue.put(-1); Myqueue.put(0); Myqueue.put(1)
  println(queue.get)

}