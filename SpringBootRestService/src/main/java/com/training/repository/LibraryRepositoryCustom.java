package com.training.repository;

import java.util.List;

import com.training.controller.Library;

public interface LibraryRepositoryCustom {
	
	List<Library> findAllByAuthor(String authorName);

	Library findByName(String bookName);

}
