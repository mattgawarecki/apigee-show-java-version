#!/bin/bash

mkdir bin
javac -d bin -classpath "lib/*" -source 1.7 -target 1.7 src/CheckJavaVersion.java
jar -cvf bin/CheckJavaVersion.jar bin/CheckJavaVersion.class
