.PHONY: build

build: clean
	./gradlew build -x test

clean:
	./gradlew clean