package app.attendance.oc.controller;

import app.attendance.oc.model.Request.ImageUploadRequest;
import app.attendance.oc.model.Response.ImageUploadResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyApis {

    @PostMapping("/image/upload")
    ImageUploadResponse uploadImages(@RequestBody ImageUploadRequest imageUploadRequest){
        return ImageUploadResponse.builder()
                .id(imageUploadRequest.getId())
                .name(imageUploadRequest.getName())
                .url(imageUploadRequest.getUrl())
                .build();
    }

}
