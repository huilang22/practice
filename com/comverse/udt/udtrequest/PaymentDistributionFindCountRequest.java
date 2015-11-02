/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDistributionFindCountRequest.java
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
 * Class used to create a PaymentDistributionFindCountRequest Udt Request
 *
 */

public class PaymentDistributionFindCountRequest extends PaymentDistributionRequest {
/**
 *
 * Constructor to create a  PaymentDistributionFindCountRequest
 * @param id Unique request name
 * @param payDistribFindCountIn PaymentDistributionObjectFilter for PaymentDistributionFindCountRequest
 *
 */
@JsonCreator
  public PaymentDistributionFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentDistribution")PaymentDistributionObjectFilter payDistribFindCountIn) {
    super(id, "PaymentDistributionFindCount");
    if (payDistribFindCountIn != null) {
      Integer index =  payDistribFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentDistribution", PaymentDistributionObjectHelper.toMap(payDistribFindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the PaymentDistributionFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
