name := "core"

val fs2Version = "3.10.2"

libraryDependencies ++= Seq(
  "co.fs2" %% "fs2-core" % fs2Version,
  "co.fs2" %% "fs2-io"   % fs2Version
)
