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
public class WorkEffortTransBoxPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="PROCESS_WORK_EFFORT_ID")
    private String processWorkEffortId;
    @Column(name="TO_ACTIVITY_ID")
    private String toActivityId;
    @Column(name="TRANSITION_ID")
    private String transitionId;

    /**
     * Auto generated value setter.
     * @param processWorkEffortId the processWorkEffortId to set
     */
    public void setProcessWorkEffortId(String processWorkEffortId) {
        this.processWorkEffortId = processWorkEffortId;
    }
    /**
     * Auto generated value setter.
     * @param toActivityId the toActivityId to set
     */
    public void setToActivityId(String toActivityId) {
        this.toActivityId = toActivityId;
    }
    /**
     * Auto generated value setter.
     * @param transitionId the transitionId to set
     */
    public void setTransitionId(String transitionId) {
        this.transitionId = transitionId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getProcessWorkEffortId() {
        return this.processWorkEffortId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getToActivityId() {
        return this.toActivityId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getTransitionId() {
        return this.transitionId;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(processWorkEffortId).append("*");
            sb.append(toActivityId).append("*");
            sb.append(transitionId).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof WorkEffortTransBoxPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
