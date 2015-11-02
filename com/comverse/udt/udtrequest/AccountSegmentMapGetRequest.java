/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentMapGetRequest.java
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
 * Class used to create a AccountSegmentMapGetRequest Udt Request
 *
 */

public class AccountSegmentMapGetRequest extends AccountSegmentMapSubRequestParent {
/**
 *
 * Constructor to create a  AccountSegmentMapGetRequest
 * @param id Unique request name
 * @param ASMGetIn AccountSegmentMapObjectKeyData for AccountSegmentMapGetRequest
 *
 */
@JsonCreator
  public AccountSegmentMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountSegmentMap")AccountSegmentMapObjectKeyData ASMGetIn) {
    super(id, "AccountSegmentMapGet");
    if (ASMGetIn != null) {
      addInput("AccountSegmentMap", AccountSegmentMapObjectKeyHelper.toMap(ASMGetIn, new HashMap(), "AccountSegmentMapObjectKeyData").get("AccountSegmentMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AccountSegmentMapObjectData that results from the AccountSegmentMapGetRequest call
 * @return AccountSegmentMapObjectData resulting from udt call
 *
 */

  public AccountSegmentMapObjectData getOutput() {
    return AccountSegmentMapObjectHelper.fromMap(outputMap, "AccountSegmentMap");
  }
}
