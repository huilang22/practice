/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentGetRequest.java
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
 * Class used to create a AccountSegmentGetRequest Udt Request
 *
 */

public class AccountSegmentGetRequest extends AccountSegmentSubRequestParent {
/**
 *
 * Constructor to create a  AccountSegmentGetRequest
 * @param id Unique request name
 * @param ASGetIn AccountSegmentObjectKeyData for AccountSegmentGetRequest
 *
 */
@JsonCreator
  public AccountSegmentGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountSegment")AccountSegmentObjectKeyData ASGetIn) {
    super(id, "AccountSegmentGet");
    if (ASGetIn != null) {
      addInput("AccountSegment", AccountSegmentObjectKeyHelper.toMap(ASGetIn, new HashMap(), "AccountSegmentObjectKeyData").get("AccountSegmentObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountSegmentObjectData that results from the AccountSegmentGetRequest call
 * @return AccountSegmentObjectData resulting from udt call
 *
 */

  public AccountSegmentObjectData getOutput() {
    return AccountSegmentObjectHelper.fromMap(outputMap, "AccountSegment");
  }
}
