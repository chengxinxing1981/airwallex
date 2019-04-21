#!/bin/bash

set -x
mvn package

targe_path=$(pwd)"/src/main/java/bank/api/cases/generated/"
source_path=$(pwd)"/src/main/resources/"

java  -cp target/httpApi-0.0.1-SNAPSHOT.jar generator.Generate $targe_path $source_path
