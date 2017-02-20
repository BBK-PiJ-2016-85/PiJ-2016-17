// Project name (artifact name in Maven)
name := "Day17"

// orgnization name (e.g., the package name of the project)
//organization := "..."

version := "1.0-SNAPSHOT"

// project description
description := "Day 17 PiJ Exercises"

// Enables publishing to maven repo
publishMavenStyle := false

// Do not append Scala versions to the generated artifacts
crossPaths := false

javacOptions in (Compile, compile) ++= Seq("-source", "1.8", "-target", "1.8", "-g:lines")

// This forbids including Scala related libraries into the dependency
autoScalaLibrary := false

// library dependencies. (orginization name) % (project name) % (version)
libraryDependencies ++= Seq(
    "junit" % "junit" % "4.12" % "test",
    "com.novocode" % "junit-interface" % "0.10" % "test"
)