/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainExtDataHistoryUpdateRequest.java
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
 * Class used to create a InvdMainExtDataHistoryUpdateRequest Udt Request
 *
 */

public class InvdMainExtDataHistoryUpdateRequest extends InvdMainExtDataHistorySubRequestParent {
/**
 *
 * Constructor to create a  InvdMainExtDataHistoryUpdateRequest
 * @param id Unique request name
 * @param InvdMainExtDataHistoryUpdateIn InvdMainExtDataHistoryObjectData for InvdMainExtDataHistoryUpdateRequest
 *
 */
@JsonCreator
  public InvdMainExtDataHistoryUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdMainExtDataHistory")InvdMainExtDataHistoryObjectData InvdMainExtDataHistoryUpdateIn) {
    super(id, "InvdMainExtDataHistoryUpdate");
    if (InvdMainExtDataHistoryUpdateIn != null) {
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectHelper.toMap(InvdMainExtDataHistoryUpdateIn, new HashMap(), "InvdMainExtDataHistory").get("InvdMainExtDataHistory"));
    }
  }

/**
 *
 * Retrieves the InvdMainExtDataHistoryObjectData that results from the InvdMainExtDataHistoryUpdateRequest call
 * @return InvdMainExtDataHistoryObjectData resulting from udt call
 *
 */

  public InvdMainExtDataHistoryObjectData getOutput() {
    return InvdMainExtDataHistoryObjectHelper.fromMap(outputMap, "InvdMainExtDataHistory");
  }
}
