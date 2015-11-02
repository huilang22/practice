/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentTransFindRequest.java
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
 * Class used to create a PaymentTransFindRequest Udt Request
 *
 */

public class PaymentTransFindRequest extends PaymentTransRequest {
/**
 *
 * Constructor to create a  PaymentTransFindRequest
 * @param id Unique request name
 * @param PayTransFindIn PaymentTransObjectFilter for PaymentTransFindRequest
 *
 */
@JsonCreator
  public PaymentTransFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentTrans")PaymentTransObjectFilter PayTransFindIn) {
    super(id, "PaymentTransFind");
    if (PayTransFindIn != null) {
      Integer index =  PayTransFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentTrans", PaymentTransObjectHelper.toMap(PayTransFindIn, new HashMap(), "PaymentTrans").get("PaymentTrans"));
    }
  }

/**
 *
 * Retrieves the PaymentTransObjectDataList that results from the PaymentTransFindRequest call
 * @return PaymentTransObjectDataList resulting from udt call
 *
 */

  public PaymentTransObjectDataList getOutput() {
    return PaymentTransObjectHelper.fromMapList(outputMap, "PaymentTransList");
  }
}
