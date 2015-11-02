/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionUpdateRequest.java
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
 * Class used to create a ConditionExpressionUpdateRequest Udt Request
 *
 */

public class ConditionExpressionUpdateRequest extends ConditionExpressionSubRequestParent {
/**
 *
 * Constructor to create a  ConditionExpressionUpdateRequest
 * @param id Unique request name
 * @param updateIn CondExprObjData for ConditionExpressionUpdateRequest
 *
 */
@JsonCreator
  public ConditionExpressionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ConditionExpression")CondExprObjData updateIn) {
    super(id, "ConditionExpressionUpdate");
    if (updateIn != null) {
      addInput("ConditionExpression", CondExprObjHelper.toMap(updateIn, new HashMap(), "ConditionExpression").get("ConditionExpression"));
    }
  }

/**
 *
 * Retrieves the CondExprObjData that results from the ConditionExpressionUpdateRequest call
 * @return CondExprObjData resulting from udt call
 *
 */

  public CondExprObjData getOutput() {
    return CondExprObjHelper.fromMap(outputMap, "ConditionExpression");
  }
}
