#!/bin/bash

# Define the file path
POM_FILE="pom.xml"

# Backup the original pom.xml
cp $POM_FILE "${POM_FILE}.bak"

# Dependency XML block to add
DEP="<dependency>\n\t<groupId>org.springdoc</groupId>\n\t<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>\n\t<version>2.3.0</version>\n</dependency>"

# Use awk to add the dependency before the closing </dependencies> tag
awk -v dep="$DEP" '/<\/dependencies>/ {print dep; print; next}1' $POM_FILE > temp && mv temp $POM_FILE

echo "Dependency added to pom.xml."

# Run Maven clean and package
mvn clean package -DskipTests

echo "Maven build complete."

# Restore the original pom.xml
mv "${POM_FILE}.bak" $POM_FILE

echo "Original pom.xml restored."
