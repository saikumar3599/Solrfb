package com.example.demofacebooksearch.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.SolrDocument;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@SolrDocument(collection = "searchProfile")
public class Profile {

    @Id
    @Field
    private String userId;
    @Field
    private String userName;
    @Field
    private String profilePicture;
    @Field
    private String typeOfProfile;
    @Field
    private String domainOfProfile;
    @Field
    private String personalDescription;
    @Field
    private String userEmailId;
    @Field
    private String userCity;
    @Field
    private String userGender;
    @Field
    private String userDateOfBirth;

}
