/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InterimBillCreateRequest.java
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
 * Class used to create a InterimBillCreateRequest Udt Request
 *
 */

public class InterimBillCreateRequest extends InterimBillSubRequestParent {
/**
 *
 * Constructor to create a  InterimBillCreateRequest
 * @param id Unique request name
 * @param intBillCreateIn InterimBillObjectData for InterimBillCreateRequest
 *
 */
@JsonCreator
  public InterimBillCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InterimBill")InterimBillObjectData intBillCreateIn) {
    super(id, "InterimBillCreate");
    if (intBillCreateIn != null) {
      addInput("InterimBill", InterimBillObjectHelper.toMap(intBillCreateIn, new HashMap(), "InterimBill").get("InterimBill"));
    }
  }

/**
 *
 * Retrieves the InterimBillObjectData that results from the InterimBillCreateRequest call
 * @return InterimBillObjectData resulting from udt call
 *
 */

  public InterimBillObjectData getOutput() {
    return InterimBillObjectHelper.fromMap(outputMap, "InterimBill");
  }
}
