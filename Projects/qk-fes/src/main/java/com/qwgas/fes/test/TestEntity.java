package com.qwgas.fes.test;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author ljh
 * @date 2019-12-05 15:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestEntity implements Serializable {

    private String id;
    private String name;
}
