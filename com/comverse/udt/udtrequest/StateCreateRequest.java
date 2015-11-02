/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StateCreateRequest.java
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
 * Class used to create a StateCreateRequest Udt Request
 *
 */

public class StateCreateRequest extends StateSubRequestParent {
/**
 *
 * Constructor to create a  StateCreateRequest
 * @param id Unique request name
 * @param STCreateIn StateObjectData for StateCreateRequest
 *
 */
@JsonCreator
  public StateCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("State")StateObjectData STCreateIn) {
    super(id, "StateCreate");
    if (STCreateIn != null) {
      addInput("State", StateObjectHelper.toMap(STCreateIn, new HashMap(), "State").get("State"));
    }
  }

/**
 *
 * Retrieves the StateObjectData that results from the StateCreateRequest call
 * @return StateObjectData resulting from udt call
 *
 */

  public StateObjectData getOutput() {
    return StateObjectHelper.fromMap(outputMap, "State");
  }
}
