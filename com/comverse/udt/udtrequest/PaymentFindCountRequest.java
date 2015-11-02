/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentFindCountRequest.java
 *
 * DO NOT EDIT. THIS IS AN AUTOMATICALLY GENERATED FILE.
 *-----------------------------------------------------------------------------*/

package com.comverse.udt.udtrequest;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigInteger;

import com.csgsystems.api.bulk.*;
import com.csgsystems.udt.*;

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a PaymentFindCountRequest Udt Request
 *
 */

public class PaymentFindCountRequest extends PaymentRequest {
/**
 *
 * Constructor to create a  PaymentFindCountRequest
 * @param id Unique request name
 * @param findCountIn PaymentObjectFilter for PaymentFindCountRequest
 *
 */
@JsonCreator
  public PaymentFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("Payment")PaymentObjectFilter findCountIn) {
    super(id, "PaymentFindCount");
    if (findCountIn != null) {
      Integer index =  findCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Payment", PaymentObjectHelper.toMap(findCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the PaymentFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
