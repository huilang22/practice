/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDistributionSummaryFindRequest.java
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
 * Class used to create a PaymentDistributionSummaryFindRequest Udt Request
 *
 */

public class PaymentDistributionSummaryFindRequest extends PaymentDistributionRequest {
/**
 *
 * Constructor to create a  PaymentDistributionSummaryFindRequest
 * @param id Unique request name
 * @param payDistribSumFindIn PaymentDistributionObjectFilter for PaymentDistributionSummaryFindRequest
 *
 */
@JsonCreator
  public PaymentDistributionSummaryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentDistribution")PaymentDistributionObjectFilter payDistribSumFindIn) {
    super(id, "PaymentDistributionSummaryFind");
    if (payDistribSumFindIn != null) {
      Integer index =  payDistribSumFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentDistribution", PaymentDistributionObjectHelper.toMap(payDistribSumFindIn, new HashMap(), "PaymentDistribution").get("PaymentDistribution"));
    }
  }

/**
 *
 * Retrieves the PaymentDistributionObjectDataList that results from the PaymentDistributionSummaryFindRequest call
 * @return PaymentDistributionObjectDataList resulting from udt call
 *
 */

  public PaymentDistributionObjectDataList getOutput() {
    return PaymentDistributionObjectHelper.fromMapList(outputMap, "PaymentDistributionList");
  }
}
