name := "gcs"

libraryDependencies ++= Seq(
  "com.google.cloud" % "google-cloud-storage" % "2.42.0",
  "com.google.cloud" % "google-cloud-nio"     % "0.127.22" % Test
)
