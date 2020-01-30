package com.example.demofacebooksearch.controller;

import com.example.demofacebooksearch.entity.Profile;
import com.example.demofacebooksearch.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("facebooksearch")
public class SearchController {
    @Autowired
    SearchService searchService;



//    @KafkaListener(topics="profileDetails",groupId="group_id")
//    public void consume(String message){
//        ProfileDTO profileDTO=new ProfileDTO();
//        Profile profile=new Profile();
//        ObjectMapper objectMapper=new ObjectMapper();
//        try{
//            profileDTO=objectMapper.readValue(message,ProfileDTO.class);
//        }
//        catch(Exception e){
//            log.error("Error : ", e);
//        }
//        BeanUtils.copyProperties(profileDTO,profile);
//        Profile profile1 = searchService.save(profile);
//        System.out.println(profile1.getUserName());
//
//
//    }
//
//
//    @GetMapping(path ="/{data}",produces = {"application/json"})
//    public ResponseEntity<List<ProfileDTO>> getAllSearchproduct(@PathVariable("data") String data) {
//        List<Profile> searchProfileList = searchService.findByUserName(data);
//        List<ProfileDTO> searchProfileDTOList = new ArrayList<>();
//        for (Profile profile: searchProfileList) {
//            ProfileDTO searchProfileDTO = new ProfileDTO();
//            BeanUtils.copyProperties(profile, searchProfileDTO);
//            searchProfileDTOList.add(searchProfileDTO);
//        }
//
//        return new ResponseEntity<List<ProfileDTO>>( searchProfileDTOList, HttpStatus.OK);
//    }



    @PostMapping("/save")
    Profile save(@RequestBody Profile profile){
        return searchService.save(profile);
    }

    @GetMapping("/search/{name}")
    List<Profile> findByUserName (@PathVariable("name") String name){
        return searchService.findByUserName(name);
    }

}
