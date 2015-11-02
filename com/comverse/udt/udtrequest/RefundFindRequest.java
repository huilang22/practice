/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundFindRequest.java
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
 * Class used to create a RefundFindRequest Udt Request
 *
 */

public class RefundFindRequest extends RefundRequest {
/**
 *
 * Constructor to create a  RefundFindRequest
 * @param id Unique request name
 * @param refundFindIn RefundObjectFilter for RefundFindRequest
 *
 */
@JsonCreator
  public RefundFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("Refund")RefundObjectFilter refundFindIn) {
    super(id, "RefundFind");
    if (refundFindIn != null) {
      Integer index =  refundFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("Refund", RefundObjectHelper.toMap(refundFindIn, new HashMap(), "Refund").get("Refund"));
    }
  }

/**
 *
 * Retrieves the RefundObjectDataList that results from the RefundFindRequest call
 * @return RefundObjectDataList resulting from udt call
 *
 */

  public RefundObjectDataList getOutput() {
    return RefundObjectHelper.fromMapList(outputMap, "RefundList");
  }
}
