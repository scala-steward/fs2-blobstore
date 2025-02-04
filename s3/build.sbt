name := "s3"

val fs2Version = "3.11.0"
val awsVersion = "2.30.6"

libraryDependencies ++= Seq(
  "software.amazon.awssdk"     % "s3"                        % awsVersion,
  "co.fs2"                    %% "fs2-reactive-streams"      % fs2Version,
  "software.amazon.awssdk.crt" % "aws-crt"                   % "0.33.9" % Test,
  "com.dimafeng"              %% "testcontainers-scala-core" % "0.41.8" % Test
)
