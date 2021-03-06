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
public class QuoteItemOptionPk implements Serializable {

    @Transient
    private int _cached_hc = 0;

    @Column(name="QUOTE_ID")
    private String quoteId;
    @Column(name="QUOTE_ITEM_SEQ_ID")
    private String quoteItemSeqId;
    @Column(name="QUOTE_ITEM_OPTION_SEQ_ID")
    private String quoteItemOptionSeqId;

    /**
     * Auto generated value setter.
     * @param quoteId the quoteId to set
     */
    public void setQuoteId(String quoteId) {
        this.quoteId = quoteId;
    }
    /**
     * Auto generated value setter.
     * @param quoteItemSeqId the quoteItemSeqId to set
     */
    public void setQuoteItemSeqId(String quoteItemSeqId) {
        this.quoteItemSeqId = quoteItemSeqId;
    }
    /**
     * Auto generated value setter.
     * @param quoteItemOptionSeqId the quoteItemOptionSeqId to set
     */
    public void setQuoteItemOptionSeqId(String quoteItemOptionSeqId) {
        this.quoteItemOptionSeqId = quoteItemOptionSeqId;
    }

    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getQuoteId() {
        return this.quoteId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getQuoteItemSeqId() {
        return this.quoteItemSeqId;
    }
    /**
     * Auto generated value accessor.
     * @return <code>String</code>
     */
    public String getQuoteItemOptionSeqId() {
        return this.quoteItemOptionSeqId;
    }

    @Override
    public int hashCode() {
        if (_cached_hc == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(quoteId).append("*");
            sb.append(quoteItemSeqId).append("*");
            sb.append(quoteItemOptionSeqId).append("*");
            _cached_hc = sb.toString().hashCode();
        }
        return _cached_hc;
    }

    @Override
    public boolean equals(Object o) {
        if (o != null && o instanceof QuoteItemOptionPk) {
            return o.hashCode() == this.hashCode();
        } else {
            return false;
        }
    }
}
