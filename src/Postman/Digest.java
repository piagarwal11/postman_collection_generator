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
    "username",
    "realm",
    "password",
    "nonce",
    "nonceCount",
    "algorithm",
    "qop",
    "clientNonce"
})
public class Digest {

    @JsonProperty("username")
    private String username;
    @JsonProperty("realm")
    private String realm;
    @JsonProperty("password")
    private String password;
    @JsonProperty("nonce")
    private String nonce;
    @JsonProperty("nonceCount")
    private String nonceCount;
    @JsonProperty("algorithm")
    private String algorithm;
    @JsonProperty("qop")
    private String qop;
    @JsonProperty("clientNonce")
    private String clientNonce;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("realm")
    public String getRealm() {
        return realm;
    }

    @JsonProperty("realm")
    public void setRealm(String realm) {
        this.realm = realm;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public void setPassword(String password) {
        this.password = password;
    }

    @JsonProperty("nonce")
    public String getNonce() {
        return nonce;
    }

    @JsonProperty("nonce")
    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    @JsonProperty("nonceCount")
    public String getNonceCount() {
        return nonceCount;
    }

    @JsonProperty("nonceCount")
    public void setNonceCount(String nonceCount) {
        this.nonceCount = nonceCount;
    }

    @JsonProperty("algorithm")
    public String getAlgorithm() {
        return algorithm;
    }

    @JsonProperty("algorithm")
    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    @JsonProperty("qop")
    public String getQop() {
        return qop;
    }

    @JsonProperty("qop")
    public void setQop(String qop) {
        this.qop = qop;
    }

    @JsonProperty("clientNonce")
    public String getClientNonce() {
        return clientNonce;
    }

    @JsonProperty("clientNonce")
    public void setClientNonce(String clientNonce) {
        this.clientNonce = clientNonce;
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
