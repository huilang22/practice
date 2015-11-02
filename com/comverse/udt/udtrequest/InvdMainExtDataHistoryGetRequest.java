/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainExtDataHistoryGetRequest.java
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
 * Class used to create a InvdMainExtDataHistoryGetRequest Udt Request
 *
 */

public class InvdMainExtDataHistoryGetRequest extends InvdMainExtDataHistorySubRequestParent {
/**
 *
 * Constructor to create a  InvdMainExtDataHistoryGetRequest
 * @param id Unique request name
 * @param InvdMainExtDataHistoryGetIn InvdMainExtDataHistoryObjectKeyData for InvdMainExtDataHistoryGetRequest
 *
 */
@JsonCreator
  public InvdMainExtDataHistoryGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdMainExtDataHistory")InvdMainExtDataHistoryObjectKeyData InvdMainExtDataHistoryGetIn) {
    super(id, "InvdMainExtDataHistoryGet");
    if (InvdMainExtDataHistoryGetIn != null) {
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectKeyHelper.toMap(InvdMainExtDataHistoryGetIn, new HashMap(), "InvdMainExtDataHistoryObjectKeyData").get("InvdMainExtDataHistoryObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvdMainExtDataHistoryObjectData that results from the InvdMainExtDataHistoryGetRequest call
 * @return InvdMainExtDataHistoryObjectData resulting from udt call
 *
 */

  public InvdMainExtDataHistoryObjectData getOutput() {
    return InvdMainExtDataHistoryObjectHelper.fromMap(outputMap, "InvdMainExtDataHistory");
  }
}
