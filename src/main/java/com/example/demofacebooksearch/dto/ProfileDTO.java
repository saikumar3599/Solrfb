package com.example.demofacebooksearch.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDTO {

    private String userId;
    private String userName;
    private String profilePicture;
    private String typeOfProfile;
    private String domainOfProfile;
    private String personalDescription;
    private String userEmailId;
    private String userCity;
    private String userGender;
    private String userDateOfBirth;

}
