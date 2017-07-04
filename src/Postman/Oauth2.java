
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
    "addTokenTo",
    "callBackUrl",
    "authUrl",
    "accessTokenUrl",
    "clientId",
    "clientSecret",
    "scope",
    "requestAccessTokenLocally"
})
public class Oauth2 {

    @JsonProperty("addTokenTo")
    private String addTokenTo;
    @JsonProperty("callBackUrl")
    private String callBackUrl;
    @JsonProperty("authUrl")
    private String authUrl;
    @JsonProperty("accessTokenUrl")
    private String accessTokenUrl;
    @JsonProperty("clientId")
    private String clientId;
    @JsonProperty("clientSecret")
    private String clientSecret;
    @JsonProperty("scope")
    private String scope;
    @JsonProperty("requestAccessTokenLocally")
    private String requestAccessTokenLocally;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("addTokenTo")
    public String getAddTokenTo() {
        return addTokenTo;
    }

    @JsonProperty("addTokenTo")
    public void setAddTokenTo(String addTokenTo) {
        this.addTokenTo = addTokenTo;
    }

    @JsonProperty("callBackUrl")
    public String getCallBackUrl() {
        return callBackUrl;
    }

    @JsonProperty("callBackUrl")
    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }

    @JsonProperty("authUrl")
    public String getAuthUrl() {
        return authUrl;
    }

    @JsonProperty("authUrl")
    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }

    @JsonProperty("accessTokenUrl")
    public String getAccessTokenUrl() {
        return accessTokenUrl;
    }

    @JsonProperty("accessTokenUrl")
    public void setAccessTokenUrl(String accessTokenUrl) {
        this.accessTokenUrl = accessTokenUrl;
    }

    @JsonProperty("clientId")
    public String getClientId() {
        return clientId;
    }

    @JsonProperty("clientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @JsonProperty("clientSecret")
    public String getClientSecret() {
        return clientSecret;
    }

    @JsonProperty("clientSecret")
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    @JsonProperty("scope")
    public String getScope() {
        return scope;
    }

    @JsonProperty("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }

    @JsonProperty("requestAccessTokenLocally")
    public String getRequestAccessTokenLocally() {
        return requestAccessTokenLocally;
    }

    @JsonProperty("requestAccessTokenLocally")
    public void setRequestAccessTokenLocally(String requestAccessTokenLocally) {
        this.requestAccessTokenLocally = requestAccessTokenLocally;
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
