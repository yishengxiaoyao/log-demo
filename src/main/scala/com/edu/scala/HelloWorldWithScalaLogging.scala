package com.edu.scala

import com.typesafe.scalalogging.LazyLogging

object HelloWorldWithScalaLogging extends App with LazyLogging{

  logger.info("Hello World from scala Logging!")

  def foo(arg:String)(implicit line:sourcecode.Line,file:sourcecode.File)={
    println(arg)
    println(line.value)
    println(file.value)
  }

  foo("hello")
}
