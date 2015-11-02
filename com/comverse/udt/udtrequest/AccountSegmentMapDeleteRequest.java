/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentMapDeleteRequest.java
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
 * Class used to create a AccountSegmentMapDeleteRequest Udt Request
 *
 */

public class AccountSegmentMapDeleteRequest extends AccountSegmentMapSubRequestParent {
/**
 *
 * Constructor to create a  AccountSegmentMapDeleteRequest
 * @param id Unique request name
 * @param ASMDeleteIn AccountSegmentMapObjectKeyData for AccountSegmentMapDeleteRequest
 *
 */
@JsonCreator
  public AccountSegmentMapDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountSegmentMap")AccountSegmentMapObjectKeyData ASMDeleteIn) {
    super(id, "AccountSegmentMapDelete");
    if (ASMDeleteIn != null) {
      addInput("AccountSegmentMap", AccountSegmentMapObjectKeyHelper.toMap(ASMDeleteIn, new HashMap(), "AccountSegmentMapObjectKeyData").get("AccountSegmentMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountSegmentMapObjectData that results from the AccountSegmentMapDeleteRequest call
 * @return AccountSegmentMapObjectData resulting from udt call
 *
 */

  public AccountSegmentMapObjectData getOutput() {
    return AccountSegmentMapObjectHelper.fromMap(outputMap, "AccountSegmentMap");
  }
}
