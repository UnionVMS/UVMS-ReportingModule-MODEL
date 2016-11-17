/*
 *
 * Developed by the European Commission - Directorate General for Maritime Affairs and Fisheries © European Union, 2015-2016.
 *
 * This file is part of the Integrated Fisheries Data Management (IFDM) Suite. The IFDM Suite is free software: you can redistribute it
 * and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of
 * the License, or any later version. The IFDM Suite is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
 * details. You should have received a copy of the GNU General Public License along with the IFDM Suite. If not, see <http://www.gnu.org/licenses/>.
 *
 *
 */

package eu.europa.ec.fisheries.uvms.reporting.model.ers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Created by padhyad on 11/16/2016.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FaFilter {

    @JsonProperty("reportType")
    private String reportType;

    @JsonProperty("activityType")
    private String activityType;

    @JsonProperty("master")
    private String master;

    @JsonProperty("port")
    private FaPort faPort;

    @JsonProperty("gear")
    private FaGear faGear;

    @JsonProperty("weight")
    private FaWeight faWeight;

    @JsonProperty("species")
    private List<String> species;

    @JsonProperty("reportType")
    public String getReportType() {
        return reportType;
    }

    @JsonProperty("reportType")
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    @JsonProperty("activityType")
    public String getActivityType() {
        return activityType;
    }

    @JsonProperty("activityType")
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    @JsonProperty("master")
    public String getMaster() {
        return master;
    }

    @JsonProperty("master")
    public void setMaster(String master) {
        this.master = master;
    }

    @JsonProperty("port")
    public FaPort getFaPort() {
        return faPort;
    }

    @JsonProperty("port")
    public void setFaPort(FaPort faPort) {
        this.faPort = faPort;
    }

    @JsonProperty("gear")
    public FaGear getFaGear() {
        return faGear;
    }

    @JsonProperty("gear")
    public void setFaGear(FaGear faGear) {
        this.faGear = faGear;
    }

    @JsonProperty("weight")
    public FaWeight getFaWeight() {
        return faWeight;
    }

    @JsonProperty("weight")
    public void setFaWeight(FaWeight faWeight) {
        this.faWeight = faWeight;
    }

    @JsonProperty("species")
    public List<String> getSpecies() {
        return species;
    }

    @JsonProperty("species")
    public void setSpecies(List<String> species) {
        this.species = species;
    }
}
