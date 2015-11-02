/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdMainFindRequest.java
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
 * Class used to create a InvdMainFindRequest Udt Request
 *
 */

public class InvdMainFindRequest extends InvdMainRequest {
/**
 *
 * Constructor to create a  InvdMainFindRequest
 * @param id Unique request name
 * @param InvdMainFindIn InvdMainObjectFilter for InvdMainFindRequest
 *
 */
@JsonCreator
  public InvdMainFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdMain")InvdMainObjectFilter InvdMainFindIn) {
    super(id, "InvdMainFind");
    if (InvdMainFindIn != null) {
      Integer index =  InvdMainFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvdMain", InvdMainObjectHelper.toMap(InvdMainFindIn, new HashMap(), "InvdMain").get("InvdMain"));
    }
  }

/**
 *
 * Retrieves the InvdMainObjectDataList that results from the InvdMainFindRequest call
 * @return InvdMainObjectDataList resulting from udt call
 *
 */

  public InvdMainObjectDataList getOutput() {
    return InvdMainObjectHelper.fromMapList(outputMap, "InvdMainList");
  }
}
