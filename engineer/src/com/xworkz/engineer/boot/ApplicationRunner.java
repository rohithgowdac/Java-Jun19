package com.xworkz.engineer.boot;
import com.xworkz.engineer.app.dto.ApplicationDTO;
import com.xworkz.engineer.app.repository.ApplicationRepository;
import com.xworkz.engineer.app.repository.ApplicationRepositoryImpl;
import com.xworkz.engineer.app.service.ApplicationService;
import com.xworkz.engineer.app.service.ApplicationServiceImpl;



public class ApplicationRunner {
	public static void main(String[] args) {
		System.out.println("Running main ....");
		ApplicationRepository applRepo = new ApplicationRepositoryImpl();
		ApplicationService service = (ApplicationService) new ApplicationServiceImpl(applRepo);
		ApplicationDTO appDto = new ApplicationDTO(0, null, null, null, null);
		boolean persisted = service.validateAndSave(appDto);
		System.out.println("Persisted " + persisted);

		ApplicationDTO appDto2 = new ApplicationDTO();
		service.validateAndSave(appDto2);

	}
}

