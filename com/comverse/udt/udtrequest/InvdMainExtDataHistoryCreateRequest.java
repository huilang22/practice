/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainExtDataHistoryCreateRequest.java
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
 * Class used to create a InvdMainExtDataHistoryCreateRequest Udt Request
 *
 */

public class InvdMainExtDataHistoryCreateRequest extends InvdMainExtDataHistorySubRequestParent {
/**
 *
 * Constructor to create a  InvdMainExtDataHistoryCreateRequest
 * @param id Unique request name
 * @param InvdMainExtDataHistoryCreateIn InvdMainExtDataHistoryObjectData for InvdMainExtDataHistoryCreateRequest
 *
 */
@JsonCreator
  public InvdMainExtDataHistoryCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdMainExtDataHistory")InvdMainExtDataHistoryObjectData InvdMainExtDataHistoryCreateIn) {
    super(id, "InvdMainExtDataHistoryCreate");
    if (InvdMainExtDataHistoryCreateIn != null) {
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectHelper.toMap(InvdMainExtDataHistoryCreateIn, new HashMap(), "InvdMainExtDataHistory").get("InvdMainExtDataHistory"));
    }
  }

/**
 *
 * Retrieves the InvdMainExtDataHistoryObjectData that results from the InvdMainExtDataHistoryCreateRequest call
 * @return InvdMainExtDataHistoryObjectData resulting from udt call
 *
 */

  public InvdMainExtDataHistoryObjectData getOutput() {
    return InvdMainExtDataHistoryObjectHelper.fromMap(outputMap, "InvdMainExtDataHistory");
  }
}
