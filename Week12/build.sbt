import com.typesafe.sbt.packager.docker.ExecCmd
enablePlugins(JavaAppPackaging, AshScriptPlugin)

dockerBaseImage := "openjdk:8-jre-alpine"
packageName in Docker := "week12"

name := "week12"

version := "0.1"

scalaVersion := "2.13.5"
scalaVersion := "2.12.6"

val akkaVersion = "2.6.8"
val akkaHttpVersion = "10.2.4"
val circeVersion = "0.9.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion,
  "de.heikoseeberger" %% "akka-http-circe" % "1.21.0",
  "org.scalatest" %% "scalatest" % "3.0.5" % Test,
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "org.mongodb.scala" %% "mongo-scala-driver" % "4.2.3",

)

dockerCommands := dockerCommands.value.map {
  case ExecCmd("CMD", _ @ _*) =>
    ExecCmd("CMD", "/opt/docker/bin/week12")
  case other =>
    other
}

// ./deploy.sh week9-10x 9fd2a5454ac6 9b8bbcef-3474-4849-86a1-b44fbb76a960