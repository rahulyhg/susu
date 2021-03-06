package org.opentaps.base.entities;

/*
* Copyright (c) Open Source Strategies, Inc.
*
 * Opentaps is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Opentaps is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Opentaps.  If not, see <http://www.gnu.org/licenses/>.
*/

// DO NOT EDIT THIS FILE!  THIS IS AUTO GENERATED AND WILL GET WRITTEN OVER PERIODICALLY WHEN THE DATA MODEL CHANGES
// EXTEND THIS CLASS INSTEAD.

import java.io.Serializable;
import javax.persistence.*;

import java.lang.String;
import java.sql.Timestamp;

@Embeddable
public class ExampleFeatureApplPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="EXAMPLE_ID")
    private String exampleId;
    @Column(name="EXAMPLE_FEATURE_ID")
    private String exampleFeatureId;
    @Column(name="FROM_DATE")
    private Timestamp fromDate;

    /**
     * Auto generated value setter.
     * @param exampleId the exampleId to set
     */
    public void setExampleId(String exampleId) {
        this.exampleId = exampleId;
    }
    /**
     * Auto generated value setter.
     * @param exampleFeatureId the exampleFeatureId to set
     */
    public void setExampleFeatureId(String exampleFeatureId) {
        this.exampleFeatureId = exampleFeatureId;
    }
    /**
     * Auto generated value setter.
     * @param fromDate the fromDate to set
     */
    public void setFromDate(Timestamp fromDate) {
        this.fromDate = fromDate;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExampleId() {
        return this.exampleId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getExampleFeatureId() {
        return this.exampleFeatureId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getFromDate() {
        return this.fromDate;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(exampleId).append("*");
            sb.append(exampleFeatureId).append("*");
            sb.append(fromDate).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof ExampleFeatureApplPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
