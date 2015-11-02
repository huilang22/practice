/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AccountSegmentMapUpdateRequest.java
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
 * Class used to create a AccountSegmentMapUpdateRequest Udt Request
 *
 */

public class AccountSegmentMapUpdateRequest extends AccountSegmentMapSubRequestParent {
/**
 *
 * Constructor to create a  AccountSegmentMapUpdateRequest
 * @param id Unique request name
 * @param ASMUpdateIn AccountSegmentMapObjectData for AccountSegmentMapUpdateRequest
 *
 */
@JsonCreator
  public AccountSegmentMapUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("AccountSegmentMap")AccountSegmentMapObjectData ASMUpdateIn) {
    super(id, "AccountSegmentMapUpdate");
    if (ASMUpdateIn != null) {
      addInput("AccountSegmentMap", AccountSegmentMapObjectHelper.toMap(ASMUpdateIn, new HashMap(), "AccountSegmentMap").get("AccountSegmentMap"));
    }
  }

/**
 *
 * Retrieves the AccountSegmentMapObjectData that results from the AccountSegmentMapUpdateRequest call
 * @return AccountSegmentMapObjectData resulting from udt call
 *
 */

  public AccountSegmentMapObjectData getOutput() {
    return AccountSegmentMapObjectHelper.fromMap(outputMap, "AccountSegmentMap");
  }
}
