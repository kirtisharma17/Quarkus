package org.tech.service;

import java.util.List;

import org.tech.entity.NewMobile;
import org.tech.repository.MobileRepo;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class MobileService {
	
	@Inject
	MobileRepo mobileRepo;
	
	@Transactional
    public NewMobile saveData(NewMobile mobile) {
		mobileRepo.persist(mobile);
        return mobile;
    }

	public List<NewMobile> getMobileList() {
        return mobileRepo.listAll();
    }
	
	 public NewMobile getMobileById(Long id) {
	        return mobileRepo.findById(id);
	    }
	 
	 @Transactional
	    public NewMobile updateMobile(Long id, NewMobile mobile) {
		
		 NewMobile mb = mobileRepo.findById(id);
		 mobileRepo.persist(mobile);
		 return mobile;
		 
		 
	        
	    }
	 @Transactional
	    public void deleteTask(Long id) {
		 mobileRepo.deleteById(id);
	    }
}
