/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InterimBillCancelRequest.java
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
 * Class used to create a InterimBillCancelRequest Udt Request
 *
 */

public class InterimBillCancelRequest extends InterimBillSubRequestParent {
/**
 *
 * Constructor to create a  InterimBillCancelRequest
 * @param id Unique request name
 * @param intBillDelIn InterimBillObjectKeyData for InterimBillCancelRequest
 *
 */
@JsonCreator
  public InterimBillCancelRequest(@JsonProperty("RequestId") String id, @JsonProperty("InterimBill")InterimBillObjectKeyData intBillDelIn) {
    super(id, "InterimBillCancel");
    if (intBillDelIn != null) {
      addInput("InterimBill", InterimBillObjectKeyHelper.toMap(intBillDelIn, new HashMap(), "InterimBillObjectKeyData").get("InterimBillObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InterimBillObjectData that results from the InterimBillCancelRequest call
 * @return InterimBillObjectData resulting from udt call
 *
 */

  public InterimBillObjectData getOutput() {
    return InterimBillObjectHelper.fromMap(outputMap, "InterimBill");
  }
}
