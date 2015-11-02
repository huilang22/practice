/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvHistoryCreateRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvHistoryCreateRequest Udt Request
 *
 */

public class InvHistoryCreateRequest extends InvHistorySubRequestParent {
/**
 *
 * Constructor to create a  InvHistoryCreateRequest
 * @param id Unique request name
 * @param InvHistoryCreateIn InvMainObjectData for InvHistoryCreateRequest
 *
 */
@JsonCreator
  public InvHistoryCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvHistory")InvMainObjectData InvHistoryCreateIn) {
    super(id, "InvHistoryCreate");
    if (InvHistoryCreateIn != null) {
      addInput("InvHistory", InvMainObjectHelper.toMap(InvHistoryCreateIn, new HashMap(), "InvHistory").get("InvHistory"));
    }
  }

/**
 *
 * Retrieves the InvHistoryObjectData that results from the InvHistoryCreateRequest call
 * @return InvHistoryObjectData resulting from udt call
 *
 */

  public InvHistoryObjectData getOutput() {
    return InvHistoryObjectHelper.fromMap(outputMap, "InvHistory");
  }
}
