/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainHistoryFindRequest.java
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
 * Class used to create a InvdMainHistoryFindRequest Udt Request
 *
 */

public class InvdMainHistoryFindRequest extends InvdMainHistoryRequest {
/**
 *
 * Constructor to create a  InvdMainHistoryFindRequest
 * @param id Unique request name
 * @param InvdMainHistoryFindIn InvdMainHistoryObjectFilter for InvdMainHistoryFindRequest
 *
 */
@JsonCreator
  public InvdMainHistoryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdMainHistory")InvdMainHistoryObjectFilter InvdMainHistoryFindIn) {
    super(id, "InvdMainHistoryFind");
    if (InvdMainHistoryFindIn != null) {
      Integer index =  InvdMainHistoryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvdMainHistory", InvdMainHistoryObjectHelper.toMap(InvdMainHistoryFindIn, new HashMap(), "InvdMainHistory").get("InvdMainHistory"));
    }
  }

/**
 *
 * Retrieves the InvdMainHistoryObjectDataList that results from the InvdMainHistoryFindRequest call
 * @return InvdMainHistoryObjectDataList resulting from udt call
 *
 */

  public InvdMainHistoryObjectDataList getOutput() {
    return InvdMainHistoryObjectHelper.fromMapList(outputMap, "InvdMainHistoryList");
  }
}
