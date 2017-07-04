
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
    "authId",
    "authKey",
    "algorithm",
    "user",
    "nonce",
    "extraData",
    "appId",
    "delegation"
})
public class Hawk {

    @JsonProperty("authId")
    private String authId;
    @JsonProperty("authKey")
    private String authKey;
    @JsonProperty("algorithm")
    private String algorithm;
    @JsonProperty("user")
    private String user;
    @JsonProperty("nonce")
    private String nonce;
    @JsonProperty("extraData")
    private String extraData;
    @JsonProperty("appId")
    private String appId;
    @JsonProperty("delegation")
    private String delegation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("authId")
    public String getAuthId() {
        return authId;
    }

    @JsonProperty("authId")
    public void setAuthId(String authId) {
        this.authId = authId;
    }

    @JsonProperty("authKey")
    public String getAuthKey() {
        return authKey;
    }

    @JsonProperty("authKey")
    public void setAuthKey(String authKey) {
        this.authKey = authKey;
    }

    @JsonProperty("algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    @JsonProperty("algorithm")
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    @JsonProperty("user")
    public void setUser(String user) {
        this.user = user;
    }

    @JsonProperty("nonce")
    public String getNonce() {
        return nonce;
    }

    @JsonProperty("nonce")
    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    @JsonProperty("extraData")
    public String getExtraData() {
        return extraData;
    }

    @JsonProperty("extraData")
    public void setExtraData(String extraData) {
        this.extraData = extraData;
    }

    @JsonProperty("appId")
    public String getAppId() {
        return appId;
    }

    @JsonProperty("appId")
    public void setAppId(String appId) {
        this.appId = appId;
    }

    @JsonProperty("delegation")
    public String getDelegation() {
        return delegation;
    }

    @JsonProperty("delegation")
    public void setDelegation(String delegation) {
        this.delegation = delegation;
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
