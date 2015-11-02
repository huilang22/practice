/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrVariableGetRequest.java
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
 * Class used to create a RbrVariableGetRequest Udt Request
 *
 */

public class RbrVariableGetRequest extends RbrVariableSubRequestParent {
/**
 *
 * Constructor to create a  RbrVariableGetRequest
 * @param id Unique request name
 * @param RbrVarGetIn RbrVarObjectKeyData for RbrVariableGetRequest
 *
 */
@JsonCreator
  public RbrVariableGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrVariable")RbrVarObjectKeyData RbrVarGetIn) {
    super(id, "RbrVariableGet");
    if (RbrVarGetIn != null) {
      addInput("RbrVariable", RbrVarObjectKeyHelper.toMap(RbrVarGetIn, new HashMap(), "RbrVarObjectKeyData").get("RbrVarObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrVarObjectData that results from the RbrVariableGetRequest call
 * @return RbrVarObjectData resulting from udt call
 *
 */

  public RbrVarObjectData getOutput() {
    return RbrVarObjectHelper.fromMap(outputMap, "RbrVariable");
  }
}
