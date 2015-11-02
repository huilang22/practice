/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentCreateRequest.java
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
 * Class used to create a AccountSegmentCreateRequest Udt Request
 *
 */

public class AccountSegmentCreateRequest extends AccountSegmentSubRequestParent {
/**
 *
 * Constructor to create a  AccountSegmentCreateRequest
 * @param id Unique request name
 * @param ASCreateIn AccountSegmentObjectData for AccountSegmentCreateRequest
 *
 */
@JsonCreator
  public AccountSegmentCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountSegment")AccountSegmentObjectData ASCreateIn) {
    super(id, "AccountSegmentCreate");
    if (ASCreateIn != null) {
      addInput("AccountSegment", AccountSegmentObjectHelper.toMap(ASCreateIn, new HashMap(), "AccountSegment").get("AccountSegment"));
    }
  }

/**
 *
 * Retrieves the AccountSegmentObjectData that results from the AccountSegmentCreateRequest call
 * @return AccountSegmentObjectData resulting from udt call
 *
 */

  public AccountSegmentObjectData getOutput() {
    return AccountSegmentObjectHelper.fromMap(outputMap, "AccountSegment");
  }
}
