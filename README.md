# log-demo

本工程主要使用的依赖为:
```
<properties>
        <java.version>1.8</java.version>
        <scala.version>2.11.8</scala.version>
    </properties>
    <dependencies>
        <dependency>
            <groupId>org.scala-lang</groupId>
            <artifactId>scala-library</artifactId>
            <version>${scala.version}</version>
        </dependency>
        <!--增加scala-logging-->
        <dependency>
            <groupId>com.typesafe.scala-logging</groupId>
            <artifactId>scala-logging_2.11</artifactId>
            <version>3.9.0</version>
        </dependency>
        <!--需要配置logback.xml-->
        <dependency>
            <groupId>ch.qos.logback</groupId>
            <artifactId>logback-classic</artifactId>
            <version>1.2.3</version>
        </dependency>
        <!--用于显示行号和文件位置-->
        <dependency>
            <groupId>com.lihaoyi</groupId>
            <artifactId>sourcecode_sjs0.6_2.11</artifactId>
            <version>0.1.6</version>
        </dependency>
    </dependencies>
```
也可以使用slf4j等插件，具体可参考:<br>https://github.com/lightbend/scala-logging<br>https://github.com/lihaoyi/sourcecode


具体实现为:
```scala
#App接口有默认实现的main函数，可以在本地不用写
object HelloWorldWithScalaLogging extends App with LazyLogging{

  logger.info("Hello World from scala Logging!")

  def foo(arg:String)(implicit line:sourcecode.Line,file:sourcecode.File)={
    println(arg)
    println(line.value)
    println(file.value)
  }

  foo("hello")
}
```
