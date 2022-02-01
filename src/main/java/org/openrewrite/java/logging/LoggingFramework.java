/*
 * Copyright 2021 the original author or authors.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.openrewrite.java.logging;

public enum LoggingFramework {
    SLF4J("org.slf4j.Logger", "org.slf4j.LoggerFactory"),
    Log4J1("org.apache.log4j.Logger", "org.apache.log4j.LogManager"),
    Log4J2("org.apache.logging.log4j.Logger", "org.apache.logging.log4j.LogManager"),
    JUL("java.util.logging.Logger", "java.util.logging.LogManager");

    private final String loggerType;
    private final String factoryType;

    LoggingFramework(String loggerType, String factoryType) {
        this.loggerType = loggerType;
        this.factoryType = factoryType;
    }

    public String getLoggerType() {
        return loggerType;
    }

    public String getFactoryType() {
        return factoryType;
    }
}