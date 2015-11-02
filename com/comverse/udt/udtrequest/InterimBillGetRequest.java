/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InterimBillGetRequest.java
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
 * Class used to create a InterimBillGetRequest Udt Request
 *
 */

public class InterimBillGetRequest extends InterimBillSubRequestParent {
/**
 *
 * Constructor to create a  InterimBillGetRequest
 * @param id Unique request name
 * @param getIn InterimBillObjectKeyData for InterimBillGetRequest
 *
 */
@JsonCreator
  public InterimBillGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InterimBill")InterimBillObjectKeyData getIn) {
    super(id, "InterimBillGet");
    if (getIn != null) {
      addInput("InterimBill", InterimBillObjectKeyHelper.toMap(getIn, new HashMap(), "InterimBillObjectKeyData").get("InterimBillObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InterimBillObjectData that results from the InterimBillGetRequest call
 * @return InterimBillObjectData resulting from udt call
 *
 */

  public InterimBillObjectData getOutput() {
    return InterimBillObjectHelper.fromMap(outputMap, "InterimBill");
  }
}
