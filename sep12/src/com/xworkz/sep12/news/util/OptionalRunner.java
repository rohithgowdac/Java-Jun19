package com.xworkz.sep12.news.util;

import java.util.Optional;

public class OptionalRunner {
	public static void main(String args[]) {
		NewsPaperDTO dto=new NewsPaperDTO("TOI","ENG",15,5);
		Optional<NewspaperDTO>optional=optional.of(dto);
		System.out.println("created optional ...");
		
		if(optional.isPresent())
		{
			System.out.println("optional may have data");
			
			NewsPaperDTO  data=optional.get();
			System.out.println(data);
		}
		else {
			
		}
		
		
	}

}
