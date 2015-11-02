/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionGetRequest.java
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
 * Class used to create a ConditionExpressionGetRequest Udt Request
 *
 */

public class ConditionExpressionGetRequest extends ConditionExpressionSubRequestParent {
/**
 *
 * Constructor to create a  ConditionExpressionGetRequest
 * @param id Unique request name
 * @param getIn CondExprObjKeyData for ConditionExpressionGetRequest
 *
 */
@JsonCreator
  public ConditionExpressionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ConditionExpression")CondExprObjKeyData getIn) {
    super(id, "ConditionExpressionGet");
    if (getIn != null) {
      addInput("ConditionExpression", CondExprObjKeyHelper.toMap(getIn, new HashMap(), "CondExprObjKeyData").get("CondExprObjKeyData"));
    }
  }

/**
 *
 * Retrieves the CondExprObjData that results from the ConditionExpressionGetRequest call
 * @return CondExprObjData resulting from udt call
 *
 */

  public CondExprObjData getOutput() {
    return CondExprObjHelper.fromMap(outputMap, "ConditionExpression");
  }
}
