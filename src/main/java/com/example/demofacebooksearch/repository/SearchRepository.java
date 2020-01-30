package com.example.demofacebooksearch.repository;

import com.example.demofacebooksearch.entity.Profile;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SearchRepository extends SolrCrudRepository<Profile,String> {

    //todo : remove query and try out Like or other as part method name itself
    @Query("userName:*?0*")
    List<Profile> findByUserName (String name);

}
