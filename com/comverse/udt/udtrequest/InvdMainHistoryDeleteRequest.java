/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainHistoryDeleteRequest.java
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
 * Class used to create a InvdMainHistoryDeleteRequest Udt Request
 *
 */

public class InvdMainHistoryDeleteRequest extends InvdMainHistoryRequest {
/**
 *
 * Constructor to create a  InvdMainHistoryDeleteRequest
 * @param id Unique request name
 * @param InvdMainHistoryDeleteIn InvdMainHistoryObjectKeyData for InvdMainHistoryDeleteRequest
 *
 */
@JsonCreator
  public InvdMainHistoryDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdMainHistory")InvdMainHistoryObjectKeyData InvdMainHistoryDeleteIn) {
    super(id, "InvdMainHistoryDelete");
    if (InvdMainHistoryDeleteIn != null) {
      addInput("InvdMainHistory", InvdMainHistoryObjectKeyHelper.toMap(InvdMainHistoryDeleteIn, new HashMap(), "InvdMainHistoryObjectKeyData").get("InvdMainHistoryObjectKeyData"));
    }
  }

}
