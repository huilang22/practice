/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvJobHistoryFindRequest.java
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
 * Class used to create a InvJobHistoryFindRequest Udt Request
 *
 */

public class InvJobHistoryFindRequest extends InvJobHistoryRequest {
/**
 *
 * Constructor to create a  InvJobHistoryFindRequest
 * @param id Unique request name
 * @param InvJobHistoryFindIn InvJobHistoryObjectFilter for InvJobHistoryFindRequest
 *
 */
@JsonCreator
  public InvJobHistoryFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvJobHistory")InvJobHistoryObjectFilter InvJobHistoryFindIn) {
    super(id, "InvJobHistoryFind");
    if (InvJobHistoryFindIn != null) {
      Integer index =  InvJobHistoryFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvJobHistory", InvJobHistoryObjectHelper.toMap(InvJobHistoryFindIn, new HashMap(), "InvJobHistory").get("InvJobHistory"));
    }
  }

/**
 *
 * Retrieves the InvJobHistoryObjectDataList that results from the InvJobHistoryFindRequest call
 * @return InvJobHistoryObjectDataList resulting from udt call
 *
 */

  public InvJobHistoryObjectDataList getOutput() {
    return InvJobHistoryObjectHelper.fromMapList(outputMap, "InvJobHistoryList");
  }
}
