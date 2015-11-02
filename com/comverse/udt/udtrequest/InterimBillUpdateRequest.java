/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InterimBillUpdateRequest.java
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
 * Class used to create a InterimBillUpdateRequest Udt Request
 *
 */

public class InterimBillUpdateRequest extends InterimBillSubRequestParent {
/**
 *
 * Constructor to create a  InterimBillUpdateRequest
 * @param id Unique request name
 * @param intBillUpdateIn InterimBillObjectData for InterimBillUpdateRequest
 *
 */
@JsonCreator
  public InterimBillUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InterimBill")InterimBillObjectData intBillUpdateIn) {
    super(id, "InterimBillUpdate");
    if (intBillUpdateIn != null) {
      addInput("InterimBill", InterimBillObjectHelper.toMap(intBillUpdateIn, new HashMap(), "InterimBill").get("InterimBill"));
    }
  }

/**
 *
 * Retrieves the InterimBillObjectData that results from the InterimBillUpdateRequest call
 * @return InterimBillObjectData resulting from udt call
 *
 */

  public InterimBillObjectData getOutput() {
    return InterimBillObjectHelper.fromMap(outputMap, "InterimBill");
  }
}
