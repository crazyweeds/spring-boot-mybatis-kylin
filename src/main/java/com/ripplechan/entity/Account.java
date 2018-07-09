package com.ripplechan.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author RippleChan
 * @date 2018-07-06
 * @time 11:27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder
public class Account implements Serializable {

    private static final long serialVersionUID = -3188112264011735127L;

    private Long accountId;
    private Long accountBuyerLevel;
    private Long accountSellerLevel;
    private String accountCountry;

}
