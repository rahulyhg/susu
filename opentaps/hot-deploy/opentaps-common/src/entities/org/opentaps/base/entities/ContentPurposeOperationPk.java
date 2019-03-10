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
public class ContentPurposeOperationPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="CONTENT_PURPOSE_TYPE_ID")
    private String contentPurposeTypeId;
    @Column(name="CONTENT_OPERATION_ID")
    private String contentOperationId;
    @Column(name="ROLE_TYPE_ID")
    private String roleTypeId;
    @Column(name="STATUS_ID")
    private String statusId;
    @Column(name="PRIVILEGE_ENUM_ID")
    private String privilegeEnumId;

    /**
     * Auto generated value setter.
     * @param contentPurposeTypeId the contentPurposeTypeId to set
     */
    public void setContentPurposeTypeId(String contentPurposeTypeId) {
        this.contentPurposeTypeId = contentPurposeTypeId;
    }
    /**
     * Auto generated value setter.
     * @param contentOperationId the contentOperationId to set
     */
    public void setContentOperationId(String contentOperationId) {
        this.contentOperationId = contentOperationId;
    }
    /**
     * Auto generated value setter.
     * @param roleTypeId the roleTypeId to set
     */
    public void setRoleTypeId(String roleTypeId) {
        this.roleTypeId = roleTypeId;
    }
    /**
     * Auto generated value setter.
     * @param statusId the statusId to set
     */
    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
    /**
     * Auto generated value setter.
     * @param privilegeEnumId the privilegeEnumId to set
     */
    public void setPrivilegeEnumId(String privilegeEnumId) {
        this.privilegeEnumId = privilegeEnumId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContentPurposeTypeId() {
        return this.contentPurposeTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getContentOperationId() {
        return this.contentOperationId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getRoleTypeId() {
        return this.roleTypeId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getStatusId() {
        return this.statusId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getPrivilegeEnumId() {
        return this.privilegeEnumId;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(contentPurposeTypeId).append("*");
            sb.append(contentOperationId).append("*");
            sb.append(roleTypeId).append("*");
            sb.append(statusId).append("*");
            sb.append(privilegeEnumId).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof ContentPurposeOperationPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
