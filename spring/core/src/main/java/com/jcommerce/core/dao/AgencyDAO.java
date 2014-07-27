/**
* Author: Bob Chen
*/

package com.jcommerce.core.dao;

import java.util.List;

import com.jcommerce.core.model.Agency;

public interface AgencyDAO extends DAO {
    public List<Agency> getAgencyList();

    public Agency getAgency(Long id);

    public void saveAgency(Agency obj);

    public void removeAgency(Long id);
}
