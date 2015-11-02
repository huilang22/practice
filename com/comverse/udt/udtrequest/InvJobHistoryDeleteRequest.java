/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobHistoryDeleteRequest.java
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
 * Class used to create a InvJobHistoryDeleteRequest Udt Request
 *
 */

public class InvJobHistoryDeleteRequest extends InvJobHistoryRequest {
/**
 *
 * Constructor to create a  InvJobHistoryDeleteRequest
 * @param id Unique request name
 * @param InvJobHistoryIn InvJobHistoryObjectFilter for InvJobHistoryDeleteRequest
 *
 */
@JsonCreator
  public InvJobHistoryDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvJobHistory")InvJobHistoryObjectFilter InvJobHistoryIn) {
    super(id, "InvJobHistoryDelete");
    if (InvJobHistoryIn != null) {
      Integer index =  InvJobHistoryIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvJobHistory", InvJobHistoryObjectHelper.toMap(InvJobHistoryIn, new HashMap(), "Void").get("Void"));
    }
  }

}
