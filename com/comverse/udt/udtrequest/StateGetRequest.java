/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StateGetRequest.java
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
 * Class used to create a StateGetRequest Udt Request
 *
 */

public class StateGetRequest extends StateSubRequestParent {
/**
 *
 * Constructor to create a  StateGetRequest
 * @param id Unique request name
 * @param STGetIn StateObjectKeyData for StateGetRequest
 *
 */
@JsonCreator
  public StateGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("State")StateObjectKeyData STGetIn) {
    super(id, "StateGet");
    if (STGetIn != null) {
      addInput("State", StateObjectKeyHelper.toMap(STGetIn, new HashMap(), "StateObjectKeyData").get("StateObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the StateObjectData that results from the StateGetRequest call
 * @return StateObjectData resulting from udt call
 *
 */

  public StateObjectData getOutput() {
    return StateObjectHelper.fromMap(outputMap, "State");
  }
}
