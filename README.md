Add Dependency and configure create instance

```xml
<dependency>
    <groupId>io.github.hcelebi</groupId>
    <artifactId>jira-v3-java-client</artifactId>
    <version>1</version>
</dependency>
```

```java
JiraV3RestClient client = new JiraV3RestClient("baseUri", "token", HttpClient.newHttpClient());
```
