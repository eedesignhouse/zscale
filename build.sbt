organization := "edu.berkeley.cs"

version := "1.0"

name := "zscale"

scalaVersion := "2.10.2"

// Provide a managed dependency on X if -DXVersion="" is supplied on the command line.
libraryDependencies ++= (Seq("chisel", "uncore", "rocket").map {
  dep: String => sys.props.get(dep + "Version") map { "edu.berkeley.cs" %% dep % _ }}).flatten
