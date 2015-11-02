/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrVariableCreateRequest.java
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
 * Class used to create a RbrVariableCreateRequest Udt Request
 *
 */

public class RbrVariableCreateRequest extends RbrVariableSubRequestParent {
/**
 *
 * Constructor to create a  RbrVariableCreateRequest
 * @param id Unique request name
 * @param RbrVarCreateIn RbrVarObjectData for RbrVariableCreateRequest
 *
 */
@JsonCreator
  public RbrVariableCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrVariable")RbrVarObjectData RbrVarCreateIn) {
    super(id, "RbrVariableCreate");
    if (RbrVarCreateIn != null) {
      addInput("RbrVariable", RbrVarObjectHelper.toMap(RbrVarCreateIn, new HashMap(), "RbrVariable").get("RbrVariable"));
    }
  }

/**
 *
 * Retrieves the RbrVarObjectData that results from the RbrVariableCreateRequest call
 * @return RbrVarObjectData resulting from udt call
 *
 */

  public RbrVarObjectData getOutput() {
    return RbrVarObjectHelper.fromMap(outputMap, "RbrVariable");
  }
}
