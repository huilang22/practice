/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvHistoryFindRequest.java
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
 * Class used to create a InvHistoryFindRequest Udt Request
 *
 */

public class InvHistoryFindRequest extends InvHistoryRequest {
/**
 *
 * Constructor to create a  InvHistoryFindRequest
 * @param id Unique request name
 * @param InvHistoryFindIn InvHistoryObjectFilter for InvHistoryFindRequest
 *
 */
@JsonCreator
  public InvHistoryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvHistory")InvHistoryObjectFilter InvHistoryFindIn) {
    super(id, "InvHistoryFind");
    if (InvHistoryFindIn != null) {
      Integer index =  InvHistoryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvHistory", InvHistoryObjectHelper.toMap(InvHistoryFindIn, new HashMap(), "InvHistory").get("InvHistory"));
    }
  }

/**
 *
 * Retrieves the InvHistoryObjectDataList that results from the InvHistoryFindRequest call
 * @return InvHistoryObjectDataList resulting from udt call
 *
 */

  public InvHistoryObjectDataList getOutput() {
    return InvHistoryObjectHelper.fromMapList(outputMap, "InvHistoryList");
  }
}
