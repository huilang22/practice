/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDistributionFindRequest.java
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
 * Class used to create a PaymentDistributionFindRequest Udt Request
 *
 */

public class PaymentDistributionFindRequest extends PaymentDistributionRequest {
/**
 *
 * Constructor to create a  PaymentDistributionFindRequest
 * @param id Unique request name
 * @param payDistribFindIn PaymentDistributionObjectFilter for PaymentDistributionFindRequest
 *
 */
@JsonCreator
  public PaymentDistributionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentDistribution")PaymentDistributionObjectFilter payDistribFindIn) {
    super(id, "PaymentDistributionFind");
    if (payDistribFindIn != null) {
      Integer index =  payDistribFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentDistribution", PaymentDistributionObjectHelper.toMap(payDistribFindIn, new HashMap(), "PaymentDistribution").get("PaymentDistribution"));
    }
  }

/**
 *
 * Retrieves the PaymentDistributionObjectDataList that results from the PaymentDistributionFindRequest call
 * @return PaymentDistributionObjectDataList resulting from udt call
 *
 */

  public PaymentDistributionObjectDataList getOutput() {
    return PaymentDistributionObjectHelper.fromMapList(outputMap, "PaymentDistributionList");
  }
}
