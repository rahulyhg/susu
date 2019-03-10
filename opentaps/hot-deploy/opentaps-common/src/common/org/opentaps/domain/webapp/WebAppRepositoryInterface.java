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
package org.opentaps.domain.webapp;

import java.util.List;

import org.opentaps.base.entities.OpentapsWebApps;
import org.opentaps.foundation.infrastructure.User;
import org.opentaps.foundation.repository.RepositoryException;
import org.opentaps.foundation.repository.RepositoryInterface;
/**
 * Repository for OpentapsWebApps to handle interaction of OpentapsWebApps-related domain with the entity engine (database) and the service engine.
 */
public interface WebAppRepositoryInterface extends RepositoryInterface {

    /**
     * Gets the get the list of available webapps for given user.
     * @param user a <code>User</code> instance
     * @return a List of <code>OpentapsWebApps</code> instance.
     * @throws RepositoryException 
     */
    public List<? extends OpentapsWebApps> getWebApps(User user) throws RepositoryException;

}
