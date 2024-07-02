#!/bin/bash

# Define the file path
POM_FILE="pom.xml"

# Backup the original pom.xml
cp $POM_FILE "${POM_FILE}.bak"

# Define the dependency XML with proper formatting
DEP="    <dependency>\\
        <groupId>org.springdoc</groupId>\\
        <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>\\
        <version>2.3.0</version>\\
    </dependency>"

# Insert the dependency before the </dependencies> tag
sed -i '' "/<\/dependencies>/i \\
$DEP" $POM_FILE

echo "Dependency added to pom.xml."

# Run Maven clean and package
mvn clean package -DskipTests

echo "Maven build complete."

# Restore the original pom.xml
mv "${POM_FILE}.bak" $POM_FILE

echo "Original pom.xml restored."
