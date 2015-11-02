/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundReasonUpdateRequest.java
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
 * Class used to create a RefundReasonUpdateRequest Udt Request
 *
 */

public class RefundReasonUpdateRequest extends RefundReasonSubRequestParent {
/**
 *
 * Constructor to create a  RefundReasonUpdateRequest
 * @param id Unique request name
 * @param RRUpdateIn RefundReasonObjectData for RefundReasonUpdateRequest
 *
 */
@JsonCreator
  public RefundReasonUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RefundReason")RefundReasonObjectData RRUpdateIn) {
    super(id, "RefundReasonUpdate");
    if (RRUpdateIn != null) {
      addInput("RefundReason", RefundReasonObjectHelper.toMap(RRUpdateIn, new HashMap(), "RefundReason").get("RefundReason"));
    }
  }

/**
 *
 * Retrieves the RefundReasonObjectData that results from the RefundReasonUpdateRequest call
 * @return RefundReasonObjectData resulting from udt call
 *
 */

  public RefundReasonObjectData getOutput() {
    return RefundReasonObjectHelper.fromMap(outputMap, "RefundReason");
  }
}
