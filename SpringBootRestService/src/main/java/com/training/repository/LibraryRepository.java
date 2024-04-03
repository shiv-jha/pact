package com.training.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.controller.Library;
@Repository
public interface LibraryRepository extends JpaRepository<Library, String>,LibraryRepositoryCustom{

}
