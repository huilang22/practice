/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrVariableUpdateRequest.java
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
 * Class used to create a RbrVariableUpdateRequest Udt Request
 *
 */

public class RbrVariableUpdateRequest extends RbrVariableSubRequestParent {
/**
 *
 * Constructor to create a  RbrVariableUpdateRequest
 * @param id Unique request name
 * @param RbrVarUpdateIn RbrVarObjectData for RbrVariableUpdateRequest
 *
 */
@JsonCreator
  public RbrVariableUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrVariable")RbrVarObjectData RbrVarUpdateIn) {
    super(id, "RbrVariableUpdate");
    if (RbrVarUpdateIn != null) {
      addInput("RbrVariable", RbrVarObjectHelper.toMap(RbrVarUpdateIn, new HashMap(), "RbrVariable").get("RbrVariable"));
    }
  }

/**
 *
 * Retrieves the RbrVarObjectData that results from the RbrVariableUpdateRequest call
 * @return RbrVarObjectData resulting from udt call
 *
 */

  public RbrVarObjectData getOutput() {
    return RbrVarObjectHelper.fromMap(outputMap, "RbrVariable");
  }
}
