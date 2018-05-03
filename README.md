# bootcamp-2018-05-04

Sample app for bootcamp 2018-05-04

## Usage

Start PostgreSQL in docker:

```bash
cd devops
docker-compose up
```

Start REPL:

```bash
lein repl
```

In repl:

```clj
(reset)
```

Application is at http://localhost:8080 and swagger at http://localhost:8080/swagger 

## Überjar

You can build and run überjar:

```bash
lein uberjar
java -jar ./target/app.jar
```

## License

Copyright © 2018 Metosin Ltd

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
