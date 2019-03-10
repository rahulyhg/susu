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
public class UomConversionDatedPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="UOM_ID")
    private String uomId;
    @Column(name="UOM_ID_TO")
    private String uomIdTo;
    @Column(name="FROM_DATE")
    private Timestamp fromDate;

    /**
     * Auto generated value setter.
     * @param uomId the uomId to set
     */
    public void setUomId(String uomId) {
        this.uomId = uomId;
    }
    /**
     * Auto generated value setter.
     * @param uomIdTo the uomIdTo to set
     */
    public void setUomIdTo(String uomIdTo) {
        this.uomIdTo = uomIdTo;
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
    public String getUomId() {
        return this.uomId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getUomIdTo() {
        return this.uomIdTo;
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
            sb.append(uomId).append("*");
            sb.append(uomIdTo).append("*");
            sb.append(fromDate).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof UomConversionDatedPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
