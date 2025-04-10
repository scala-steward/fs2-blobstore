name := "s3"

val fs2Version = "3.12.0"
val awsVersion = "2.31.17"

libraryDependencies ++= Seq(
  "software.amazon.awssdk"     % "s3"                        % awsVersion,
  "co.fs2"                    %% "fs2-reactive-streams"      % fs2Version,
  "software.amazon.awssdk.crt" % "aws-crt"                   % "0.37.0" % Test,
  "com.dimafeng"              %% "testcontainers-scala-core" % "0.43.0" % Test
)
