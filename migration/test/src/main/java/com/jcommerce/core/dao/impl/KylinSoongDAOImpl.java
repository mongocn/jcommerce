package com.jcommerce.core.dao.impl;

import com.jcommerce.core.dao.KylinSoongDAO;
import com.jcommerce.core.model.KylinSoong;

public class KylinSoongDAOImpl extends DAOImpl implements KylinSoongDAO {
	
	public KylinSoongDAOImpl() {
		modelClass = KylinSoong.class;
	}

	public void saveKylinSoong(KylinSoong obj) {
		save(obj);
	}

	public void removeKylinSoong(String id) {
		deleteById(id);
	}

}
