package app.attendance.oc.model.Request;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ImageUploadRequest {
    private String id;
    private String name;
    private String url;
}
