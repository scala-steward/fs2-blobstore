name := "azure"

val fs2Version = "3.2.4"

libraryDependencies ++= Seq(
  "com.azure"     % "azure-storage-blob"        % "12.14.4",
  "com.azure"     % "azure-storage-blob-batch"  % "12.11.3",
  "co.fs2"       %% "fs2-reactive-streams"      % fs2Version,
  "com.dimafeng" %% "testcontainers-scala-core" % "0.40.0" % Test
)
