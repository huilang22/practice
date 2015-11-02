/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsStatusFindRequest.java
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
 * Class used to create a InvsStatusFindRequest Udt Request
 *
 */

public class InvsStatusFindRequest extends InvsStatusRequest {
/**
 *
 * Constructor to create a  InvsStatusFindRequest
 * @param id Unique request name
 * @param InvsStatusFindIn InvsStatusObjectFilter for InvsStatusFindRequest
 *
 */
@JsonCreator
  public InvsStatusFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsStatus")InvsStatusObjectFilter InvsStatusFindIn) {
    super(id, "InvsStatusFind");
    if (InvsStatusFindIn != null) {
      Integer index =  InvsStatusFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsStatus", InvsStatusObjectHelper.toMap(InvsStatusFindIn, new HashMap(), "InvsStatus").get("InvsStatus"));
    }
  }

/**
 *
 * Retrieves the InvsStatusObjectDataList that results from the InvsStatusFindRequest call
 * @return InvsStatusObjectDataList resulting from udt call
 *
 */

  public InvsStatusObjectDataList getOutput() {
    return InvsStatusObjectHelper.fromMapList(outputMap, "InvsStatusList");
  }
}
