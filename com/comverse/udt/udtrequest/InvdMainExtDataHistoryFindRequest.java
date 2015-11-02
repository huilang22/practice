/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainExtDataHistoryFindRequest.java
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
 * Class used to create a InvdMainExtDataHistoryFindRequest Udt Request
 *
 */

public class InvdMainExtDataHistoryFindRequest extends InvdMainExtDataHistoryRequest {
/**
 *
 * Constructor to create a  InvdMainExtDataHistoryFindRequest
 * @param id Unique request name
 * @param InvdMainExtDataHistoryFindIn InvdMainExtDataHistoryObjectFilter for InvdMainExtDataHistoryFindRequest
 *
 */
@JsonCreator
  public InvdMainExtDataHistoryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdMainExtDataHistory")InvdMainExtDataHistoryObjectFilter InvdMainExtDataHistoryFindIn) {
    super(id, "InvdMainExtDataHistoryFind");
    if (InvdMainExtDataHistoryFindIn != null) {
      Integer index =  InvdMainExtDataHistoryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvdMainExtDataHistory", InvdMainExtDataHistoryObjectHelper.toMap(InvdMainExtDataHistoryFindIn, new HashMap(), "InvdMainExtDataHistory").get("InvdMainExtDataHistory"));
    }
  }

/**
 *
 * Retrieves the InvdMainExtDataHistoryObjectDataList that results from the InvdMainExtDataHistoryFindRequest call
 * @return InvdMainExtDataHistoryObjectDataList resulting from udt call
 *
 */

  public InvdMainExtDataHistoryObjectDataList getOutput() {
    return InvdMainExtDataHistoryObjectHelper.fromMapList(outputMap, "InvdMainExtDataHistoryList");
  }
}
