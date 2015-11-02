/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDistributionSuspenseFindCountRequest.java
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
 * Class used to create a PaymentDistributionSuspenseFindCountRequest Udt Request
 *
 */

public class PaymentDistributionSuspenseFindCountRequest extends PaymentDistributionRequest {
/**
 *
 * Constructor to create a  PaymentDistributionSuspenseFindCountRequest
 * @param id Unique request name
 * @param payDistribFindCount2In PaymentDistributionObjectFilter for PaymentDistributionSuspenseFindCountRequest
 *
 */
@JsonCreator
  public PaymentDistributionSuspenseFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentDistribution")PaymentDistributionObjectFilter payDistribFindCount2In) {
    super(id, "PaymentDistributionSuspenseFindCount");
    if (payDistribFindCount2In != null) {
      Integer index =  payDistribFindCount2In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentDistribution", PaymentDistributionObjectHelper.toMap(payDistribFindCount2In, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the PaymentDistributionSuspenseFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
