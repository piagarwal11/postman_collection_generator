package Postman;



import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;


/**
 * Auth
 * <p>
 * Represents authentication helpers provided by Postman
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "type",
    "awsv4",
    "basic",
    "digest",
    "hawk",
    "noauth",
    "oauth1",
    "oauth2"
})
public class Auth {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    private Auth.Type type;
    @JsonProperty("awsv4")
    private Awsv4 awsv4;
    @JsonProperty("basic")
    private Basic basic;
    @JsonProperty("digest")
    private Digest digest;
    @JsonProperty("hawk")
    private Hawk hawk;
    @JsonProperty("noauth")
    private Object noauth;
    @JsonProperty("oauth1")
    private Oauth1 oauth1;
    @JsonProperty("oauth2")
    private Oauth2 oauth2;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public Auth.Type getType() {
        return type;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("type")
    public void setType(Auth.Type type) {
        this.type = type;
    }

    @JsonProperty("awsv4")
    public Awsv4 getAwsv4() {
        return awsv4;
    }

    @JsonProperty("awsv4")
    public void setAwsv4(Awsv4 awsv4) {
        this.awsv4 = awsv4;
    }

    @JsonProperty("basic")
    public Basic getBasic() {
        return basic;
    }

    @JsonProperty("basic")
    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    @JsonProperty("digest")
    public Digest getDigest() {
        return digest;
    }

    @JsonProperty("digest")
    public void setDigest(Digest digest) {
        this.digest = digest;
    }

    @JsonProperty("hawk")
    public Hawk getHawk() {
        return hawk;
    }

    @JsonProperty("hawk")
    public void setHawk(Hawk hawk) {
        this.hawk = hawk;
    }

    @JsonProperty("noauth")
    public Object getNoauth() {
        return noauth;
    }

    @JsonProperty("noauth")
    public void setNoauth(Object noauth) {
        this.noauth = noauth;
    }

    @JsonProperty("oauth1")
    public Oauth1 getOauth1() {
        return oauth1;
    }

    @JsonProperty("oauth1")
    public void setOauth1(Oauth1 oauth1) {
        this.oauth1 = oauth1;
    }

    @JsonProperty("oauth2")
    public Oauth2 getOauth2() {
        return oauth2;
    }

    @JsonProperty("oauth2")
    public void setOauth2(Oauth2 oauth2) {
        this.oauth2 = oauth2;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public enum Type {

        AWSV_4("awsv4"),
        BASIC("basic"),
        DIGEST("digest"),
        HAWK("hawk"),
        NOAUTH("noauth"),
        OAUTH_1("oauth1"),
        OAUTH_2("oauth2");
        private final String value;
        private final static Map<String, Auth.Type> CONSTANTS = new HashMap<String, Auth.Type>();

        static {
            for (Auth.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(String value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return this.value;
        }

        @JsonValue
        public String value() {
            return this.value;
        }

        @JsonCreator
        public static Auth.Type fromValue(String value) {
            Auth.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException(value);
            } else {
                return constant;
            }
        }

    }

}
