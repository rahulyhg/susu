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

@Embeddable
public class ShipmentItemFeaturePk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="SHIPMENT_ID")
    private String shipmentId;
    @Column(name="SHIPMENT_ITEM_SEQ_ID")
    private String shipmentItemSeqId;
    @Column(name="PRODUCT_FEATURE_ID")
    private String productFeatureId;

    /**
     * Auto generated value setter.
     * @param shipmentId the shipmentId to set
     */
    public void setShipmentId(String shipmentId) {
        this.shipmentId = shipmentId;
    }
    /**
     * Auto generated value setter.
     * @param shipmentItemSeqId the shipmentItemSeqId to set
     */
    public void setShipmentItemSeqId(String shipmentItemSeqId) {
        this.shipmentItemSeqId = shipmentItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param productFeatureId the productFeatureId to set
     */
    public void setProductFeatureId(String productFeatureId) {
        this.productFeatureId = productFeatureId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentId() {
        return this.shipmentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getShipmentItemSeqId() {
        return this.shipmentItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProductFeatureId() {
        return this.productFeatureId;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(shipmentId).append("*");
            sb.append(shipmentItemSeqId).append("*");
            sb.append(productFeatureId).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof ShipmentItemFeaturePk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
