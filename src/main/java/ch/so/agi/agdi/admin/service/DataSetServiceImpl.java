package ch.so.agi.agdi.admin.service;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import ch.so.agi.agdi.admin.model.DataSet;
import ch.so.agi.agdi.admin.repository.DataSetRepository;

@Service
public class DataSetServiceImpl implements DataSetService {
	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private DataSetRepository repository;
	
	@Override
	public Iterable<DataSet> findAll() {
		return repository.findAll();	
	}
	
	@Override
	public Optional<DataSet> findOne(Long id) {
		return repository.findById(id);
	}	

	@Override
	public DataSet save(DataSet dataSet) {
		return repository.save(dataSet);
	}
	
	@Override
	public void delete(Long id) {
		repository.deleteById(id);
	}
}
