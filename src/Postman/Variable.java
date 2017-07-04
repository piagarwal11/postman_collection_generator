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
 * Variable
 * <p>
 * Using variables in your Postman requests eliminates the need to duplicate requests, which can save a lot of time. Variables can be defined, and referenced to from any part of a request.
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "value",
    "type",
    "name",
    "description"
})
public class Variable {

    /**
     * A variable ID is a unique user-defined value that identifies the variable within a collection. In traditional terms, this would be a variable name.
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("A variable ID is a unique user-defined value that identifies the variable within a collection. In traditional terms, this would be a variable name.")
    private String id;
    /**
     * The value that a variable holds in this collection. Ultimately, the variables will be replaced by this value, when say running a set of requests from a collection
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The value that a variable holds in this collection. Ultimately, the variables will be replaced by this value, when say running a set of requests from a collection")
    private Object value;
    /**
     * A variable may have multiple types. This field specifies the type of the variable.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("A variable may have multiple types. This field specifies the type of the variable.")
    private String type;
    /**
     * Variable name
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Variable name")
    private String name;
    /**
     * A Description can be a raw text, or be an object, which holds the description along with its format.
     * 
     */
    @JsonProperty("description")
    @JsonPropertyDescription("A Description can be a raw text, or be an object, which holds the description along with its format.")
    private Object description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * A variable ID is a unique user-defined value that identifies the variable within a collection. In traditional terms, this would be a variable name.
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * A variable ID is a unique user-defined value that identifies the variable within a collection. In traditional terms, this would be a variable name.
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The value that a variable holds in this collection. Ultimately, the variables will be replaced by this value, when say running a set of requests from a collection
     * 
     */
    @JsonProperty("value")
    public Object getValue() {
        return value;
    }

    /**
     * The value that a variable holds in this collection. Ultimately, the variables will be replaced by this value, when say running a set of requests from a collection
     * 
     */
    @JsonProperty("value")
    public void setValue(Object value) {
        this.value = value;
    }

    /**
     * A variable may have multiple types. This field specifies the type of the variable.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * A variable may have multiple types. This field specifies the type of the variable.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Variable name
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Variable name
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * A Description can be a raw text, or be an object, which holds the description along with its format.
     * 
     */
    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    /**
     * A Description can be a raw text, or be an object, which holds the description along with its format.
     * 
     */
    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
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
