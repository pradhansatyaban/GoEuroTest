package com.goeuroJavaTest.goeuroPosition;

import com.goeuroJavaTest.goeuroGeoLogLat.GeoLogLat;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

/*
 * Created by Satyaban Pradhan
 *              on 28/08/2015
 */
public class Position {
    @SerializedName("_type")
    @Expose
    private String typeName;

    @SerializedName("_id")
    @Expose
    private Integer id;
    @Expose
    private Object key;
    @Expose
    private String name;
    @Expose
    private String fullName;
    @SerializedName("iata_airport_code")
    @Expose
    private Object iataAirportCode;
    @Expose
    private String type;
    @Expose
    private String country;
    @SerializedName("geo_position")
    @Expose
    private GeoLogLat geoLogLat;
    @Expose
    private Integer locationId;
    @Expose
    private Boolean inEurope;
    @Expose
    private String countryCode;
    @Expose
    private Boolean coreCountry;
    @Expose
    private Object distance;

    /**
     * @return the typeName
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the key
     */
    public Object getKey() {
        return key;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the iataAirportCode
     */
    public Object getIataAirportCode() {
        return iataAirportCode;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the geoLogLat
     */
    public GeoLogLat getGeoLogLat() {
        return geoLogLat;
    }

    public void setGeoLogLat(GeoLogLat geoLogLat) {
        this.geoLogLat = geoLogLat;
    }

    /**
     * @return the locationId
     */
    public Integer getLocationId() {
        return locationId;
    }

    /**
     * @return the inEurope
     */
    public Boolean getInEurope() {
        return inEurope;
    }

    /**
     * @return the countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * @return the coreCountry
     */
    public Boolean getCoreCountry() {
        return coreCountry;
    }

    /**
     * @return the distance
     */
    public Object getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return "Position{" +
                "typeName='" + typeName + '\'' +
                ", id=" + id +
                ", key=" + key +
                ", name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", iataAirportCode=" + iataAirportCode +
                ", type='" + type + '\'' +
                ", country='" + country + '\'' +
                ", geoLogLat=" + geoLogLat +
                ", locationId=" + locationId +
                ", inEurope=" + inEurope +
                ", countryCode='" + countryCode + '\'' +
                ", coreCountry=" + coreCountry +
                ", distance=" + distance +
                '}';
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (fullName != null ? fullName.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (geoLogLat != null ? geoLogLat.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Position)) return false;

        Position position = (Position) o;

        if (country != null ? !country.equals(position.country) : position.country != null) return false;
        if (countryCode != null ? !countryCode.equals(position.countryCode) : position.countryCode != null)
            return false;
        if (fullName != null ? !fullName.equals(position.fullName) : position.fullName != null) return false;
        if (geoLogLat != null ? !geoLogLat.equals(position.geoLogLat) : position.geoLogLat != null)
            return false;
        if (id != null ? !id.equals(position.id) : position.id != null) return false;
        if (name != null ? !name.equals(position.name) : position.name != null) return false;
        return !(type != null ? !type.equals(position.type) : position.type != null);

    }

}
