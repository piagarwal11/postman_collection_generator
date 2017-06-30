package Postman;



import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "accessKey",
    "secretKey",
    "region",
    "service"
})
public class Awsv4 {

    @JsonProperty("accessKey")
    private String accessKey;
    @JsonProperty("secretKey")
    private String secretKey;
    @JsonProperty("region")
    private String region;
    @JsonProperty("service")
    private String service;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("accessKey")
    public String getAccessKey() {
        return accessKey;
    }

    @JsonProperty("accessKey")
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    @JsonProperty("secretKey")
    public String getSecretKey() {
        return secretKey;
    }

    @JsonProperty("secretKey")
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    @JsonProperty("region")
    public String getRegion() {
        return region;
    }

    @JsonProperty("region")
    public void setRegion(String region) {
        this.region = region;
    }

    @JsonProperty("service")
    public String getService() {
        return service;
    }

    @JsonProperty("service")
    public void setService(String service) {
        this.service = service;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
