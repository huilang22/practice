/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentDistributionSuspenseFindRequest.java
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
 * Class used to create a PaymentDistributionSuspenseFindRequest Udt Request
 *
 */

public class PaymentDistributionSuspenseFindRequest extends PaymentDistributionRequest {
/**
 *
 * Constructor to create a  PaymentDistributionSuspenseFindRequest
 * @param id Unique request name
 * @param payDistribFind2In PaymentDistributionObjectFilter for PaymentDistributionSuspenseFindRequest
 *
 */
@JsonCreator
  public PaymentDistributionSuspenseFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentDistribution")PaymentDistributionObjectFilter payDistribFind2In) {
    super(id, "PaymentDistributionSuspenseFind");
    if (payDistribFind2In != null) {
      Integer index =  payDistribFind2In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentDistribution", PaymentDistributionObjectHelper.toMap(payDistribFind2In, new HashMap(), "PaymentDistribution").get("PaymentDistribution"));
    }
  }

/**
 *
 * Retrieves the PaymentDistributionObjectDataList that results from the PaymentDistributionSuspenseFindRequest call
 * @return PaymentDistributionObjectDataList resulting from udt call
 *
 */

  public PaymentDistributionObjectDataList getOutput() {
    return PaymentDistributionObjectHelper.fromMapList(outputMap, "PaymentDistributionList");
  }
}
