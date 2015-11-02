/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnappliedPaymentFindRequest.java
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
 * Class used to create a UnappliedPaymentFindRequest Udt Request
 *
 */

public class UnappliedPaymentFindRequest extends UnappliedPaymentRequest {
/**
 *
 * Constructor to create a  UnappliedPaymentFindRequest
 * @param id Unique request name
 * @param unappliedPaymentFindIn UnappliedPaymentObjectFilter for UnappliedPaymentFindRequest
 *
 */
@JsonCreator
  public UnappliedPaymentFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnappliedPayment")UnappliedPaymentObjectFilter unappliedPaymentFindIn) {
    super(id, "UnappliedPaymentFind");
    if (unappliedPaymentFindIn != null) {
      Integer index =  unappliedPaymentFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnappliedPayment", UnappliedPaymentObjectHelper.toMap(unappliedPaymentFindIn, new HashMap(), "UnappliedPayment").get("UnappliedPayment"));
    }
  }

/**
 *
 * Retrieves the UnappliedPaymentObjectDataList that results from the UnappliedPaymentFindRequest call
 * @return UnappliedPaymentObjectDataList resulting from udt call
 *
 */

  public UnappliedPaymentObjectDataList getOutput() {
    return UnappliedPaymentObjectHelper.fromMapList(outputMap, "UnappliedPaymentList");
  }
}
