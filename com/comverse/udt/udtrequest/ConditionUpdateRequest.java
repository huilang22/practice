/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionUpdateRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a ConditionUpdateRequest Udt Request
 *
 */

public class ConditionUpdateRequest extends ConditionSubRequestParent {
/**
 *
 * Constructor to create a  ConditionUpdateRequest
 * @param id Unique request name
 * @param updateIn CondObjData for ConditionUpdateRequest
 *
 */
@JsonCreator
  public ConditionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("Condition")CondObjData updateIn) {
    super(id, "ConditionUpdate");
    if (updateIn != null) {
      addInput("Condition", CondObjHelper.toMap(updateIn, new HashMap(), "Condition").get("Condition"));
    }
  }

/**
 *
 * Retrieves the CondObjData that results from the ConditionUpdateRequest call
 * @return CondObjData resulting from udt call
 *
 */

  public CondObjData getOutput() {
    return CondObjHelper.fromMap(outputMap, "Condition");
  }
}
