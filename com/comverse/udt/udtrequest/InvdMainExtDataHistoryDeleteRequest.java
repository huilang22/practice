/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainExtDataHistoryDeleteRequest.java
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
 * Class used to create a InvdMainExtDataHistoryDeleteRequest Udt Request
 *
 */

public class InvdMainExtDataHistoryDeleteRequest extends InvdMainExtDataHistoryRequest {
/**
 *
 * Constructor to create a  InvdMainExtDataHistoryDeleteRequest
 * @param id Unique request name
 * @param InvdMainExtDataHistoryDeleteIn InvdMainExtDataHistoryObjectKeyData for InvdMainExtDataHistoryDeleteRequest
 *
 */
@JsonCreator
  public InvdMainExtDataHistoryDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdMainExtDataHistory")InvdMainExtDataHistoryObjectKeyData InvdMainExtDataHistoryDeleteIn) {
    super(id, "InvdMainExtDataHistoryDelete");
    if (InvdMainExtDataHistoryDeleteIn != null) {
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectKeyHelper.toMap(InvdMainExtDataHistoryDeleteIn, new HashMap(), "InvdMainExtDataHistoryObjectKeyData").get("InvdMainExtDataHistoryObjectKeyData"));
    }
  }

}
