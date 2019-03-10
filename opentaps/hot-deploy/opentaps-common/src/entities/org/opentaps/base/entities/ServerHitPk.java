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
public class ServerHitPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="VISIT_ID")
    private String visitId;
    @Column(name="CONTENT_ID")
    private String contentId;
    @Column(name="HIT_START_DATE_TIME")
    private Timestamp hitStartDateTime;
    @Column(name="HIT_TYPE_ID")
    private String hitTypeId;

    /**
     * Auto generated value setter.
     * @param visitId the visitId to set
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }
    /**
     * Auto generated value setter.
     * @param contentId the contentId to set
     */
    public void setContentId(String contentId) {
        this.contentId = contentId;
    }
    /**
     * Auto generated value setter.
     * @param hitStartDateTime the hitStartDateTime to set
     */
    public void setHitStartDateTime(Timestamp hitStartDateTime) {
        this.hitStartDateTime = hitStartDateTime;
    }
    /**
     * Auto generated value setter.
     * @param hitTypeId the hitTypeId to set
     */
    public void setHitTypeId(String hitTypeId) {
        this.hitTypeId = hitTypeId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getVisitId() {
        return this.visitId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContentId() {
        return this.contentId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>Timestamp</code>
     */
    public Timestamp getHitStartDateTime() {
        return this.hitStartDateTime;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getHitTypeId() {
        return this.hitTypeId;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(visitId).append("*");
            sb.append(contentId).append("*");
            sb.append(hitStartDateTime).append("*");
            sb.append(hitTypeId).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof ServerHitPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
