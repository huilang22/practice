/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainHistoryGetRequest.java
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
 * Class used to create a InvdMainHistoryGetRequest Udt Request
 *
 */

public class InvdMainHistoryGetRequest extends InvdMainHistorySubRequestParent {
/**
 *
 * Constructor to create a  InvdMainHistoryGetRequest
 * @param id Unique request name
 * @param InvdMainHistoryGetIn InvdMainHistoryObjectKeyData for InvdMainHistoryGetRequest
 *
 */
@JsonCreator
  public InvdMainHistoryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdMainHistory")InvdMainHistoryObjectKeyData InvdMainHistoryGetIn) {
    super(id, "InvdMainHistoryGet");
    if (InvdMainHistoryGetIn != null) {
      addInput("InvdMainHistory", InvdMainHistoryObjectKeyHelper.toMap(InvdMainHistoryGetIn, new HashMap(), "InvdMainHistoryObjectKeyData").get("InvdMainHistoryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvdMainHistoryObjectData that results from the InvdMainHistoryGetRequest call
 * @return InvdMainHistoryObjectData resulting from udt call
 *
 */

  public InvdMainHistoryObjectData getOutput() {
    return InvdMainHistoryObjectHelper.fromMap(outputMap, "InvdMainHistory");
  }
}
