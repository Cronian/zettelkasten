package module.be.api.common.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.sql.Timestamp;

public class BaseEntity {
    @CreatedDate
    private Timestamp crt_dt;
    @LastModifiedDate
    private Timestamp upd_dt;
    private char use_yn;
}
