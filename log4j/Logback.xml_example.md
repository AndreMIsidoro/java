    <?xml version="1.0" encoding="UTF-8"?>
    <included>

        <appender name="highStakesAuthorisationAppender"
                class="ch.qos.logback.core.rolling.RollingFileAppender">
            <file>${logpath}/HighStakesAuthorisation.log</file>
            <rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
                <!-- daily rollover -->
                <fileNamePattern>${logpath}/HighStakesAuthorisation-%d{yyyy-MM-dd}.%i.zip
                </fileNamePattern>
                <timeBasedFileNamingAndTriggeringPolicy
                        class="ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP">
                    <!-- or whenever the file size reaches 50MB -->
                    <maxFileSize>100MB</maxFileSize>
                </timeBasedFileNamingAndTriggeringPolicy>
                <!-- keep 30 days' worth of history -->
                <maxHistory>30</maxHistory>
            </rollingPolicy>
            <encoder>
                <charset>UTF-8</charset>
                <pattern>%d{HH:mm:ss} %10logger{0} %msg%n</pattern>
                <outputPatternAsHeader>false</outputPatternAsHeader>
            </encoder>
        </appender>

        <logger name="com.ingg.ikernel.highstakes.log.HighStakesAuthorisationLogger"
                additivity="false">
            <level value='INFO' />
            <appender-ref ref='highStakesAuthorisationAppender' />
        </logger>

    </included>
