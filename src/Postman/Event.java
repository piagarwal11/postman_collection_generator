package Postman;



import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Event
 * <p>
 * An Event
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "listen",
    "script",
    "disabled"
})
public class Event {

    /**
     * Can be set to `test` or `prerequest` for test scripts or pre-request scripts respectively.
     * (Required)
     * 
     */
    @JsonProperty("listen")
    @JsonPropertyDescription("Can be set to `test` or `prerequest` for test scripts or pre-request scripts respectively.")
    private String listen;
    /**
     * Script
     * <p>
     * A script is a snippet of Javascript code that can be used to to perform setup or teardown operations on a particular response.
     * 
     */
    @JsonProperty("script")
    @JsonPropertyDescription("A script is a snippet of Javascript code that can be used to to perform setup or teardown operations on a particular response.")
    private Object script;
    /**
     * Indicates whether the event is disabled. If absent, the event is assumed to be enabled.
     * 
     */
    @JsonProperty("disabled")
    @JsonPropertyDescription("Indicates whether the event is disabled. If absent, the event is assumed to be enabled.")
    private Boolean disabled;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Can be set to `test` or `prerequest` for test scripts or pre-request scripts respectively.
     * (Required)
     * 
     */
    @JsonProperty("listen")
    public String getListen() {
        return listen;
    }

    /**
     * Can be set to `test` or `prerequest` for test scripts or pre-request scripts respectively.
     * (Required)
     * 
     */
    @JsonProperty("listen")
    public void setListen(String listen) {
        this.listen = listen;
    }

    /**
     * Script
     * <p>
     * A script is a snippet of Javascript code that can be used to to perform setup or teardown operations on a particular response.
     * 
     */
    @JsonProperty("script")
    public Object getScript() {
        return script;
    }

    /**
     * Script
     * <p>
     * A script is a snippet of Javascript code that can be used to to perform setup or teardown operations on a particular response.
     * 
     */
    @JsonProperty("script")
    public void setScript(Object script) {
        this.script = script;
    }

    /**
     * Indicates whether the event is disabled. If absent, the event is assumed to be enabled.
     * 
     */
    @JsonProperty("disabled")
    public Boolean getDisabled() {
        return disabled;
    }

    /**
     * Indicates whether the event is disabled. If absent, the event is assumed to be enabled.
     * 
     */
    @JsonProperty("disabled")
    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
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
