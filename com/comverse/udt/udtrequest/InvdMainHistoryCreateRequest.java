/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainHistoryCreateRequest.java
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
 * Class used to create a InvdMainHistoryCreateRequest Udt Request
 *
 */

public class InvdMainHistoryCreateRequest extends InvdMainHistorySubRequestParent {
/**
 *
 * Constructor to create a  InvdMainHistoryCreateRequest
 * @param id Unique request name
 * @param InvdMainHistoryCreateIn InvdMainHistoryObjectData for InvdMainHistoryCreateRequest
 *
 */
@JsonCreator
  public InvdMainHistoryCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdMainHistory")InvdMainHistoryObjectData InvdMainHistoryCreateIn) {
    super(id, "InvdMainHistoryCreate");
    if (InvdMainHistoryCreateIn != null) {
      addInput("InvdMainHistory", InvdMainHistoryObjectHelper.toMap(InvdMainHistoryCreateIn, new HashMap(), "InvdMainHistory").get("InvdMainHistory"));
    }
  }

/**
 *
 * Retrieves the InvdMainHistoryObjectData that results from the InvdMainHistoryCreateRequest call
 * @return InvdMainHistoryObjectData resulting from udt call
 *
 */

  public InvdMainHistoryObjectData getOutput() {
    return InvdMainHistoryObjectHelper.fromMap(outputMap, "InvdMainHistory");
  }
}
