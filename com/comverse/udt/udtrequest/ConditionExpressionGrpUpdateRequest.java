/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionGrpUpdateRequest.java
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
 * Class used to create a ConditionExpressionGrpUpdateRequest Udt Request
 *
 */

public class ConditionExpressionGrpUpdateRequest extends ConditionExpressionGrpSubRequestParent {
/**
 *
 * Constructor to create a  ConditionExpressionGrpUpdateRequest
 * @param id Unique request name
 * @param updateIn CondExprGrpObjBaseData for ConditionExpressionGrpUpdateRequest
 *
 */
@JsonCreator
  public ConditionExpressionGrpUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ConditionExpressionGrp")CondExprGrpObjBaseData updateIn) {
    super(id, "ConditionExpressionGrpUpdate");
    if (updateIn != null) {
      addInput("ConditionExpressionGrp", CondExprGrpObjBaseHelper.toMap(updateIn, new HashMap(), "ConditionExpressionGrp").get("ConditionExpressionGrp"));
    }
  }

/**
 *
 * Retrieves the CondExprGrpObjBaseData that results from the ConditionExpressionGrpUpdateRequest call
 * @return CondExprGrpObjBaseData resulting from udt call
 *
 */

  public CondExprGrpObjBaseData getOutput() {
    return CondExprGrpObjBaseHelper.fromMap(outputMap, "ConditionExpressionGrp");
  }
}
