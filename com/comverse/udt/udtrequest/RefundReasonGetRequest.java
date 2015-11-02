/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundReasonGetRequest.java
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
 * Class used to create a RefundReasonGetRequest Udt Request
 *
 */

public class RefundReasonGetRequest extends RefundReasonSubRequestParent {
/**
 *
 * Constructor to create a  RefundReasonGetRequest
 * @param id Unique request name
 * @param RRGetIn RefundReasonObjectKeyData for RefundReasonGetRequest
 *
 */
@JsonCreator
  public RefundReasonGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RefundReason")RefundReasonObjectKeyData RRGetIn) {
    super(id, "RefundReasonGet");
    if (RRGetIn != null) {
      addInput("RefundReason", RefundReasonObjectKeyHelper.toMap(RRGetIn, new HashMap(), "RefundReasonObjectKeyData").get("RefundReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RefundReasonObjectData that results from the RefundReasonGetRequest call
 * @return RefundReasonObjectData resulting from udt call
 *
 */

  public RefundReasonObjectData getOutput() {
    return RefundReasonObjectHelper.fromMap(outputMap, "RefundReason");
  }
}
