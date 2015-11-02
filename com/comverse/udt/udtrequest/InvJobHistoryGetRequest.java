/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobHistoryGetRequest.java
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
 * Class used to create a InvJobHistoryGetRequest Udt Request
 *
 */

public class InvJobHistoryGetRequest extends InvJobHistorySubRequestParent {
/**
 *
 * Constructor to create a  InvJobHistoryGetRequest
 * @param id Unique request name
 * @param InvJobHistoryGetIn InvJobHistoryObjectKeyData for InvJobHistoryGetRequest
 *
 */
@JsonCreator
  public InvJobHistoryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvJobHistory")InvJobHistoryObjectKeyData InvJobHistoryGetIn) {
    super(id, "InvJobHistoryGet");
    if (InvJobHistoryGetIn != null) {
      addInput("InvJobHistory", InvJobHistoryObjectKeyHelper.toMap(InvJobHistoryGetIn, new HashMap(), "InvJobHistoryObjectKeyData").get("InvJobHistoryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvJobHistoryObjectData that results from the InvJobHistoryGetRequest call
 * @return InvJobHistoryObjectData resulting from udt call
 *
 */

  public InvJobHistoryObjectData getOutput() {
    return InvJobHistoryObjectHelper.fromMap(outputMap, "InvJobHistory");
  }
}
