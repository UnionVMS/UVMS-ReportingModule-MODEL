
package eu.europa.ec.fisheries.uvms.reporting.model.vms;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
public class Area {

    @JsonProperty("id")
    private long id;
    @JsonProperty("type")
    private String type;
    @JsonProperty("areaType")
    private String areaType;
    @JsonProperty("gid")
    private long gid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Area() {
    }

    /**
     * 
     * @param id
     * @param areaType
     * @param gid
     * @param type
     */
    public Area(long id, String type, String areaType, long gid) {
        this.id = id;
        this.type = type;
        this.areaType = areaType;
        this.gid = gid;
    }

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(long id) {
        this.id = id;
    }

    public Area withId(long id) {
        this.id = id;
        return this;
    }

    /**
     * 
     * @return
     *     The type
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * 
     * @param type
     *     The type
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public Area withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 
     * @return
     *     The areaType
     */
    @JsonProperty("areaType")
    public String getAreaType() {
        return areaType;
    }

    /**
     * 
     * @param areaType
     *     The areaType
     */
    @JsonProperty("areaType")
    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    public Area withAreaType(String areaType) {
        this.areaType = areaType;
        return this;
    }

    /**
     * 
     * @return
     *     The gid
     */
    @JsonProperty("gid")
    public long getGid() {
        return gid;
    }

    /**
     * 
     * @param gid
     *     The gid
     */
    @JsonProperty("gid")
    public void setGid(long gid) {
        this.gid = gid;
    }

    public Area withGid(long gid) {
        this.gid = gid;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Area withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(type).append(areaType).append(gid).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Area) == false) {
            return false;
        }
        Area rhs = ((Area) other);
        return new EqualsBuilder().append(id, rhs.id).append(type, rhs.type).append(areaType, rhs.areaType).append(gid, rhs.gid).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}