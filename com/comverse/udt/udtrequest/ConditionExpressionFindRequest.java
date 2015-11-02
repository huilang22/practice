/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionFindRequest.java
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
 * Class used to create a ConditionExpressionFindRequest Udt Request
 *
 */

public class ConditionExpressionFindRequest extends ConditionExpressionRequest {
/**
 *
 * Constructor to create a  ConditionExpressionFindRequest
 * @param id Unique request name
 * @param findIn CondExprObjFilter for ConditionExpressionFindRequest
 *
 */
@JsonCreator
  public ConditionExpressionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ConditionExpression")CondExprObjFilter findIn) {
    super(id, "ConditionExpressionFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ConditionExpression", CondExprObjHelper.toMap(findIn, new HashMap(), "ConditionExpression").get("ConditionExpression"));
    }
  }

/**
 *
 * Retrieves the CondExprObjDataList that results from the ConditionExpressionFindRequest call
 * @return CondExprObjDataList resulting from udt call
 *
 */

  public CondExprObjDataList getOutput() {
    return CondExprObjHelper.fromMapList(outputMap, "ConditionExpressionList");
  }
}
