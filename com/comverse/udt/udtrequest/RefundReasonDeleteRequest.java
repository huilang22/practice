/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundReasonDeleteRequest.java
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
 * Class used to create a RefundReasonDeleteRequest Udt Request
 *
 */

public class RefundReasonDeleteRequest extends RefundReasonSubRequestParent {
/**
 *
 * Constructor to create a  RefundReasonDeleteRequest
 * @param id Unique request name
 * @param RRDeleteIn RefundReasonObjectKeyData for RefundReasonDeleteRequest
 *
 */
@JsonCreator
  public RefundReasonDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RefundReason")RefundReasonObjectKeyData RRDeleteIn) {
    super(id, "RefundReasonDelete");
    if (RRDeleteIn != null) {
      addInput("RefundReason", RefundReasonObjectKeyHelper.toMap(RRDeleteIn, new HashMap(), "RefundReasonObjectKeyData").get("RefundReasonObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RefundReasonObjectData that results from the RefundReasonDeleteRequest call
 * @return RefundReasonObjectData resulting from udt call
 *
 */

  public RefundReasonObjectData getOutput() {
    return RefundReasonObjectHelper.fromMap(outputMap, "RefundReason");
  }
}
