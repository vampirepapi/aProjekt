package app.attendance.oc.controller;

import app.attendance.oc.model.Request.ImageUploadRequest;
import app.attendance.oc.model.Response.ImageUploadResponse;
import app.attendance.oc.model.Response.StudentDetailResponse;
import app.attendance.oc.model.Response.StudentMarksResponse;
import app.attendance.oc.model.Response.StudentParentDetailResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyApis {

    @PostMapping("/image/upload")
    ImageUploadResponse uploadImages(@RequestBody ImageUploadRequest imageUploadRequest){
//        return type  functionName( parameter type)
        return ImageUploadResponse.builder()
                .id(imageUploadRequest.getId())
                .name(imageUploadRequest.getName())
                .newurls(imageUploadRequest.getUrl())
                .build();
    }

    @GetMapping("/student/detail")
    StudentDetailResponse getStudentDetail(){
        StudentDetailResponse studentDetailResponse = new StudentDetailResponse();
        studentDetailResponse.setName("Shubham");
        studentDetailResponse.setRollno("Btech/15044/18");
        studentDetailResponse.setBranch("CSE");
        studentDetailResponse.setBatch("2018");
        studentDetailResponse.setDateOfBirth("20/05/2000");
        return studentDetailResponse ;

    }
    //Api to get Student Parents Detail
    @GetMapping("/student/parentdetail")
    StudentParentDetailResponse getStudentParentDetail(){
        StudentParentDetailResponse studentParentDetailResponse = new StudentParentDetailResponse();
        studentParentDetailResponse.setMotherName("Guddi Gupta");
        studentParentDetailResponse.setFatherName("Shriniwas Prasad Gupta");
        studentParentDetailResponse.setMotherOccupation("Homemaker");
        studentParentDetailResponse.setFatherOccupation("Serviceman");
        studentParentDetailResponse.setMotherAge("42");
        studentParentDetailResponse.setFatherAge("48");
        return studentParentDetailResponse;

    }
    @PostMapping("student/marks")
    StudentMarksResponse getStudentMarks(){
        StudentMarksResponse studentMarksResponse = new StudentMarksResponse();
        studentMarksResponse.getStudentId();
        studentMarksResponse.getRollNum();
        studentMarksResponse.setPhysics("20");
        studentMarksResponse.setChemistry("20");
        studentMarksResponse.setMaths("20");
        return studentMarksResponse;
    }


}


