/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StateUpdateRequest.java
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
 * Class used to create a StateUpdateRequest Udt Request
 *
 */

public class StateUpdateRequest extends StateSubRequestParent {
/**
 *
 * Constructor to create a  StateUpdateRequest
 * @param id Unique request name
 * @param STUpdateIn StateObjectData for StateUpdateRequest
 * @param STUpdateFilter StateObjectFilter for StateUpdateRequest
 * @param STUpdateGet StateObjectData for StateUpdateRequest
 *
 */
@JsonCreator
  public StateUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("State")StateObjectData STUpdateIn, @JsonProperty("STUpdateFilter")StateObjectFilter STUpdateFilter, @JsonProperty("STUpdateGet")StateObjectData STUpdateGet) {
    super(id, "StateUpdate");
    if (STUpdateIn != null) {
      addInput("State", StateObjectHelper.toMap(STUpdateIn, new HashMap(), "State").get("State"));
    }
    if (STUpdateFilter != null) {
      Integer index =  STUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("STUpdateFilter", StateObjectHelper.toMap(STUpdateFilter, new HashMap(), "State").get("State"));
    }
    if (STUpdateGet != null) {
      addInput("STUpdateGet", StateObjectHelper.toMap(STUpdateGet, new HashMap(), "State").get("State"));
    }
  }

/**
 *
 * Retrieves the StateObjectData that results from the StateUpdateRequest call
 * @return StateObjectData resulting from udt call
 *
 */

  public StateObjectData getOutput() {
    return StateObjectHelper.fromMap(outputMap, "State");
  }
}
