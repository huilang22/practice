/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StateFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a StateFindRequest Udt Request
 *
 */

public class StateFindRequest extends StateRequest {
/**
 *
 * Constructor to create a  StateFindRequest
 * @param id Unique request name
 * @param STFindIn StateObjectFilter for StateFindRequest
 *
 */
@JsonCreator
  public StateFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("State")StateObjectFilter STFindIn) {
    super(id, "StateFind");
    if (STFindIn != null) {
      Integer index =  STFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("State", StateObjectHelper.toMap(STFindIn, new HashMap(), "State").get("State"));
    }
  }

/**
 *
 * Retrieves the StateObjectDataList that results from the StateFindRequest call
 * @return StateObjectDataList resulting from udt call
 *
 */

  public StateObjectDataList getOutput() {
    return StateObjectHelper.fromMapList(outputMap, "StateList");
  }
}
