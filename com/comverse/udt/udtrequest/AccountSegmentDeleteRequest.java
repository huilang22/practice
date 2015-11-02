/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentDeleteRequest.java
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
 * Class used to create a AccountSegmentDeleteRequest Udt Request
 *
 */

public class AccountSegmentDeleteRequest extends AccountSegmentSubRequestParent {
/**
 *
 * Constructor to create a  AccountSegmentDeleteRequest
 * @param id Unique request name
 * @param ASDeleteIn AccountSegmentObjectKeyData for AccountSegmentDeleteRequest
 *
 */
@JsonCreator
  public AccountSegmentDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountSegment")AccountSegmentObjectKeyData ASDeleteIn) {
    super(id, "AccountSegmentDelete");
    if (ASDeleteIn != null) {
      addInput("AccountSegment", AccountSegmentObjectKeyHelper.toMap(ASDeleteIn, new HashMap(), "AccountSegmentObjectKeyData").get("AccountSegmentObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountSegmentObjectData that results from the AccountSegmentDeleteRequest call
 * @return AccountSegmentObjectData resulting from udt call
 *
 */

  public AccountSegmentObjectData getOutput() {
    return AccountSegmentObjectHelper.fromMap(outputMap, "AccountSegment");
  }
}
