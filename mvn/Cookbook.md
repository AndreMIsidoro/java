**Show Dependencies**

    mvn dependency:tree -Dverbose

**Compile test without running them**

	>mvn test-compile

**Code Coverage**

	Using jacoco:
	>mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install -Dmaven.test.failure.ignore=true org.jacoco:jacoco-maven-plugin:report

	Using cobertura:
	>mvn cobertura:cobertura

**Test specific class**

	> mvn -Dtest=NameOfTheTestClass test

	> mvn surefire:test -Dtest=NameOfTheTestClass

**Exclude specific class**

    mvn -DsomeModule.test.excludes=”**/NameOfClassTest.java


**Skip Tests in release**

-Dresume=false  -DskipTests -Darguments="-DskipTests" release:prepare release:perform


**Change remote repository in command line**

    mvn package -Dmaven.repo.remote=http://www.ibiblio.org/maven/,http://myrepo -Dmaven.repo.local="c:\test\repo"

**mvnDebug**

	Use ‘mvnDebug’ to run maven in debug mode. This allows you to debug the maven goals execution.

	Example

	mvnDebug help:effective-pom 

	will debug the help plugin

**Resolve dependencies for the plugins**

	mvn dependency:resolve-plugins


**Show Calculated Settings**

	mvn help:effective-settings

**Show Calculated pom**

	mvn help:effective-pom


**Tasks Example**

     <execution>
        <phase>install</phase>
        <configuration>
            <tasks>
                <unzip src="${project.basedir}/target/${artifactId}-${version}.zip" dest="${project.basedir}/target/${artifactId}-${version}" />
                <delete file="${project.basedir}/target/${artifactId}-${version}.zip" />
                <copydir src="${project.basedir}/target/${artifactId}-${version}/ikernel/conf/connected" dest="${project.basedir}/target/${artifactId}-${version}/ikernel/dist/conf" />
                <delete dir="${project.basedir}/target/${artifactId}-${version}/ikernel/conf" />
                <zip destfile="${project.basedir}/target/${artifactId}-${version}.zip" basedir="${project.basedir}/target/${artifactId}-${version}" update="true" />
                <delete includeEmptyDirs="true">
                    <fileset dir="${project.basedir}/target/${artifactId}-${version}" />
                </delete>
            </tasks>
        </configuration>
        <goals>
            <goal>run</goal>
        </goals>
    </execution>

**Skip Javadoc generation**

mvn -Dmaven.javadoc.skip=true


**Copy Resources into Target Directory**

    <!-- Copy Resources into target/ -->
    <plugin>
    <artifactId>maven-resources-plugin</artifactId>
    <version>3.0.1</version>
    <executions>
        <execution>
            <id>copy-resources-from-src-to-target</id>
            <phase>package</phase>
            <goals>
                <goal>copy-resources</goal>
            </goals>
            <configuration>
                <outputDirectory>${project.build.directory}</outputDirectory>
                <resources>
                    <resource>
                        <directory>src/main/resources/</directory>
                        <filtering>true</filtering>
                    </resource>
                </resources>
            </configuration>
        </execution>
    </executions>
    </plugin>


