/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PaymentTypeFindRequest.java
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
 * Class used to create a PaymentTypeFindRequest Udt Request
 *
 */

public class PaymentTypeFindRequest extends PaymentTypeRequest {
/**
 *
 * Constructor to create a  PaymentTypeFindRequest
 * @param id Unique request name
 * @param bmfFindIn PaymentTypeObjectFilter for PaymentTypeFindRequest
 *
 */
@JsonCreator
  public PaymentTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("PaymentType")PaymentTypeObjectFilter bmfFindIn) {
    super(id, "PaymentTypeFind");
    if (bmfFindIn != null) {
      Integer index =  bmfFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("PaymentType", PaymentTypeObjectHelper.toMap(bmfFindIn, new HashMap(), "PaymentType").get("PaymentType"));
    }
  }

/**
 *
 * Retrieves the PaymentTypeObjectDataList that results from the PaymentTypeFindRequest call
 * @return PaymentTypeObjectDataList resulting from udt call
 *
 */

  public PaymentTypeObjectDataList getOutput() {
    return PaymentTypeObjectHelper.fromMapList(outputMap, "PaymentTypeList");
  }
}
