package ch.so.agi.agdi.datasource.dao;

import java.util.List;

import ch.so.agi.agdi.datasource.entity.PostgresDataSourceEntity;

public interface PostgresDataSourceEntityDAO {
	public List<PostgresDataSourceEntity> select(String dbUrl, String dbUsr, String dbPwd);
}
