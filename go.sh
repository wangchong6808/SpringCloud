docker run --rm --user 1000 -v $(pwd):/opt/app -w /opt/app java:8 ./gradlew build