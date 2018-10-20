# blu-lama.api

A Clojure api designed to serve as a back-end for a questionnaire.

## Prerequisites

You will need [Leiningen][] 2.0.0 or above installed.

[leiningen]: https://github.com/technomancy/leiningen

## Usage

### Run the application locally

`lein ring server`

### Run the tests

`lein midje`

### Packaging and running as standalone jar

```
lein do clean, ring uberjar
java -jar target/server.jar
```

### Packaging as war

`lein ring uberwar`

## License

Copyright © 2018 Bartek Łukasik
