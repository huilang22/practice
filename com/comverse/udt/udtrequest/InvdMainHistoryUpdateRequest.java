/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainHistoryUpdateRequest.java
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
 * Class used to create a InvdMainHistoryUpdateRequest Udt Request
 *
 */

public class InvdMainHistoryUpdateRequest extends InvdMainHistorySubRequestParent {
/**
 *
 * Constructor to create a  InvdMainHistoryUpdateRequest
 * @param id Unique request name
 * @param InvdMainHistoryUpdateIn InvdMainHistoryObjectData for InvdMainHistoryUpdateRequest
 *
 */
@JsonCreator
  public InvdMainHistoryUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdMainHistory")InvdMainHistoryObjectData InvdMainHistoryUpdateIn) {
    super(id, "InvdMainHistoryUpdate");
    if (InvdMainHistoryUpdateIn != null) {
      addInput("InvdMainHistory", InvdMainHistoryObjectHelper.toMap(InvdMainHistoryUpdateIn, new HashMap(), "InvdMainHistory").get("InvdMainHistory"));
    }
  }

/**
 *
 * Retrieves the InvdMainHistoryObjectData that results from the InvdMainHistoryUpdateRequest call
 * @return InvdMainHistoryObjectData resulting from udt call
 *
 */

  public InvdMainHistoryObjectData getOutput() {
    return InvdMainHistoryObjectHelper.fromMap(outputMap, "InvdMainHistory");
  }
}
