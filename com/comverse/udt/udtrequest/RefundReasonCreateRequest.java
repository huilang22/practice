/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RefundReasonCreateRequest.java
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
 * Class used to create a RefundReasonCreateRequest Udt Request
 *
 */

public class RefundReasonCreateRequest extends RefundReasonSubRequestParent {
/**
 *
 * Constructor to create a  RefundReasonCreateRequest
 * @param id Unique request name
 * @param RRCreateIn RefundReasonObjectData for RefundReasonCreateRequest
 *
 */
@JsonCreator
  public RefundReasonCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RefundReason")RefundReasonObjectData RRCreateIn) {
    super(id, "RefundReasonCreate");
    if (RRCreateIn != null) {
      addInput("RefundReason", RefundReasonObjectHelper.toMap(RRCreateIn, new HashMap(), "RefundReason").get("RefundReason"));
    }
  }

/**
 *
 * Retrieves the RefundReasonObjectData that results from the RefundReasonCreateRequest call
 * @return RefundReasonObjectData resulting from udt call
 *
 */

  public RefundReasonObjectData getOutput() {
    return RefundReasonObjectHelper.fromMap(outputMap, "RefundReason");
  }
}
