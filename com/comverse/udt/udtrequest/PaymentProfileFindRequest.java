/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentProfileFindRequest.java
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
 * Class used to create a PaymentProfileFindRequest Udt Request
 *
 */

public class PaymentProfileFindRequest extends PaymentProfileRequest {
/**
 *
 * Constructor to create a  PaymentProfileFindRequest
 * @param id Unique request name
 * @param ppfIn PaymentProfileObjectFilter for PaymentProfileFindRequest
 *
 */
@JsonCreator
  public PaymentProfileFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentProfile")PaymentProfileObjectFilter ppfIn) {
    super(id, "PaymentProfileFind");
    if (ppfIn != null) {
      Integer index =  ppfIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentProfile", PaymentProfileObjectHelper.toMap(ppfIn, new HashMap(), "PaymentProfile").get("PaymentProfile"));
    }
  }

/**
 *
 * Retrieves the PaymentProfileObjectDataList that results from the PaymentProfileFindRequest call
 * @return PaymentProfileObjectDataList resulting from udt call
 *
 */

  public PaymentProfileObjectDataList getOutput() {
    return PaymentProfileObjectHelper.fromMapList(outputMap, "PaymentProfileList");
  }
}
