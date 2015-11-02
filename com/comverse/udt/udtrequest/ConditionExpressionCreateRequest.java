/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionCreateRequest.java
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
 * Class used to create a ConditionExpressionCreateRequest Udt Request
 *
 */

public class ConditionExpressionCreateRequest extends ConditionExpressionSubRequestParent {
/**
 *
 * Constructor to create a  ConditionExpressionCreateRequest
 * @param id Unique request name
 * @param createIn CondExprObjData for ConditionExpressionCreateRequest
 *
 */
@JsonCreator
  public ConditionExpressionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ConditionExpression")CondExprObjData createIn) {
    super(id, "ConditionExpressionCreate");
    if (createIn != null) {
      addInput("ConditionExpression", CondExprObjHelper.toMap(createIn, new HashMap(), "ConditionExpression").get("ConditionExpression"));
    }
  }

/**
 *
 * Retrieves the CondExprObjData that results from the ConditionExpressionCreateRequest call
 * @return CondExprObjData resulting from udt call
 *
 */

  public CondExprObjData getOutput() {
    return CondExprObjHelper.fromMap(outputMap, "ConditionExpression");
  }
}
