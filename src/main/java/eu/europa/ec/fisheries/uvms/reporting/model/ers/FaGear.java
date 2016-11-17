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

/**
 * Created by padhyad on 11/16/2016.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class FaGear {

    @JsonProperty("onboard")
    private String onboard;

    @JsonProperty("deployed")
    private String deployed;

    public FaGear() {
    }

    public FaGear(String onboard, String deployed) {
        this.onboard = onboard;
        this.deployed = deployed;
    }

    @JsonProperty("onboard")
    public String getOnboard() {
        return onboard;
    }

    @JsonProperty("onboard")
    public void setOnboard(String onboard) {
        this.onboard = onboard;
    }

    @JsonProperty("deployed")
    public String getDeployed() {
        return deployed;
    }

    @JsonProperty("deployed")
    public void setDeployed(String deployed) {
        this.deployed = deployed;
    }
}
