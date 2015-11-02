/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrVariableDeleteRequest.java
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
 * Class used to create a RbrVariableDeleteRequest Udt Request
 *
 */

public class RbrVariableDeleteRequest extends RbrVariableSubRequestParent {
/**
 *
 * Constructor to create a  RbrVariableDeleteRequest
 * @param id Unique request name
 * @param RbrVarDeleteIn RbrVarObjectKeyData for RbrVariableDeleteRequest
 *
 */
@JsonCreator
  public RbrVariableDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrVariable")RbrVarObjectKeyData RbrVarDeleteIn) {
    super(id, "RbrVariableDelete");
    if (RbrVarDeleteIn != null) {
      addInput("RbrVariable", RbrVarObjectKeyHelper.toMap(RbrVarDeleteIn, new HashMap(), "RbrVarObjectKeyData").get("RbrVarObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RbrVarObjectData that results from the RbrVariableDeleteRequest call
 * @return RbrVarObjectData resulting from udt call
 *
 */

  public RbrVarObjectData getOutput() {
    return RbrVarObjectHelper.fromMap(outputMap, "RbrVariable");
  }
}
