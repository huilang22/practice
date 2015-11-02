/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionGrpFindRequest.java
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
 * Class used to create a ConditionExpressionGrpFindRequest Udt Request
 *
 */

public class ConditionExpressionGrpFindRequest extends ConditionExpressionGrpRequest {
/**
 *
 * Constructor to create a  ConditionExpressionGrpFindRequest
 * @param id Unique request name
 * @param findIn CondExprGrpObjFilter for ConditionExpressionGrpFindRequest
 *
 */
@JsonCreator
  public ConditionExpressionGrpFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("ConditionExpressionGrp")CondExprGrpObjFilter findIn) {
    super(id, "ConditionExpressionGrpFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("ConditionExpressionGrp", CondExprGrpObjHelper.toMap(findIn, new HashMap(), "ConditionExpressionGrp").get("ConditionExpressionGrp"));
    }
  }

/**
 *
 * Retrieves the CondExprGrpObjDataList that results from the ConditionExpressionGrpFindRequest call
 * @return CondExprGrpObjDataList resulting from udt call
 *
 */

  public CondExprGrpObjDataList getOutput() {
    return CondExprGrpObjHelper.fromMapList(outputMap, "ConditionExpressionGrpList");
  }
}
