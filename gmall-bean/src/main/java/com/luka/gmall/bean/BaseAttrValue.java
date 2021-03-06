package com.luka.gmall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @author horo
 */
@Data
public class BaseAttrValue implements Serializable {
    @Id
    @Column
    private String id;

    @Column
    private String valueName;

    @Column
    private String attrId;
}
