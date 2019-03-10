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
public class InventoryItemDetailPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="INVENTORY_ITEM_ID")
    private String inventoryItemId;
    @Column(name="INVENTORY_ITEM_DETAIL_SEQ_ID")
    private String inventoryItemDetailSeqId;

    /**
     * Auto generated value setter.
     * @param inventoryItemId the inventoryItemId to set
     */
    public void setInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
    }
    /**
     * Auto generated value setter.
     * @param inventoryItemDetailSeqId the inventoryItemDetailSeqId to set
     */
    public void setInventoryItemDetailSeqId(String inventoryItemDetailSeqId) {
        this.inventoryItemDetailSeqId = inventoryItemDetailSeqId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInventoryItemId() {
        return this.inventoryItemId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getInventoryItemDetailSeqId() {
        return this.inventoryItemDetailSeqId;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(inventoryItemId).append("*");
            sb.append(inventoryItemDetailSeqId).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof InventoryItemDetailPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
