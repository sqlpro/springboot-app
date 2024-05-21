.PHONY: build clean run

build: clean
	./gradlew bootJar

clean:
	./gradlew clean

run:
	./gradlew bootRun
