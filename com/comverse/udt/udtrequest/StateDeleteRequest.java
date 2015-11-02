/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * StateDeleteRequest.java
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
 * Class used to create a StateDeleteRequest Udt Request
 *
 */

public class StateDeleteRequest extends StateSubRequestParent {
/**
 *
 * Constructor to create a  StateDeleteRequest
 * @param id Unique request name
 * @param STDeleteIn StateObjectKeyData for StateDeleteRequest
 *
 */
@JsonCreator
  public StateDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("State")StateObjectKeyData STDeleteIn) {
    super(id, "StateDelete");
    if (STDeleteIn != null) {
      addInput("State", StateObjectKeyHelper.toMap(STDeleteIn, new HashMap(), "StateObjectKeyData").get("StateObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the StateObjectData that results from the StateDeleteRequest call
 * @return StateObjectData resulting from udt call
 *
 */

  public StateObjectData getOutput() {
    return StateObjectHelper.fromMap(outputMap, "State");
  }
}
