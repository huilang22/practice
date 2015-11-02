/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrVariableFindRequest.java
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
 * Class used to create a RbrVariableFindRequest Udt Request
 *
 */

public class RbrVariableFindRequest extends RbrVariableRequest {
/**
 *
 * Constructor to create a  RbrVariableFindRequest
 * @param id Unique request name
 * @param RbrVarFindIn RbrVarObjectFilter for RbrVariableFindRequest
 *
 */
@JsonCreator
  public RbrVariableFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrVariable")RbrVarObjectFilter RbrVarFindIn) {
    super(id, "RbrVariableFind");
    if (RbrVarFindIn != null) {
      Integer index =  RbrVarFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrVariable", RbrVarObjectHelper.toMap(RbrVarFindIn, new HashMap(), "RbrVariable").get("RbrVariable"));
    }
  }

/**
 *
 * Retrieves the RbrVarObjectDataList that results from the RbrVariableFindRequest call
 * @return RbrVarObjectDataList resulting from udt call
 *
 */

  public RbrVarObjectDataList getOutput() {
    return RbrVarObjectHelper.fromMapList(outputMap, "RbrVariableList");
  }
}
