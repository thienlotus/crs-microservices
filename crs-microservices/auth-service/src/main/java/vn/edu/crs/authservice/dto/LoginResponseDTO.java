// path: auth-service/src/main/java/vn/edu/crs/authservice/dto/LoginResponseDTO.java
// purpose: DTO tra ve token va thong tin co ban sau khi dang nhap thanh cong
package vn.edu.crs.authservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponseDTO {
    private String token;
    private String username;
    private String role;
}
