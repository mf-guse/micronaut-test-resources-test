# Introduction

This project is a demo project how to use Micronaut Test Resources in a micronaut kotlin project using PostgreSQL.

The sourcecode is heavily inspired by the blogpost [Introducing Micronaut Test Resources](https://melix.github.io/blog/2022/08/micronaut-test-resources.html) written by Cédric Champeau.

# Findings

My development environment is

- Windows 10
- Java 17
- latest gradle
- Docker / Kubernetes provided by [Rancher Desktop](https://rancherdesktop.io/)
- IntelliJ with kotest Plugin
- Ubuntu WSL2 with Java 17 and latest gradle 

## IntelliJ and kotest Plugin

Starting the tests using the kotest plugin does not work. The PostgreSQL testcontainer is not started.

## WSL2

Running `gradle build` works. The PostgreSQL testcontainer is started, the test is executed as expected.

## Micronaut 3.7.3 Documentation

- [User Guide](https://docs.micronaut.io/3.7.3/guide/index.html)
- [API Reference](https://docs.micronaut.io/3.7.3/api/index.html)
- [Configuration Reference](https://docs.micronaut.io/3.7.3/guide/configurationreference.html)
- [Micronaut Guides](https://guides.micronaut.io/index.html)
---

- [Shadow Gradle Plugin](https://plugins.gradle.org/plugin/com.github.johnrengelman.shadow)
## Feature test-resources documentation

- [Micronaut Test Resources documentation](https://micronaut-projects.github.io/micronaut-test-resources/latest/guide/)