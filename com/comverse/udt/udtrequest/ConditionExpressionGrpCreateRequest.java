/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionGrpCreateRequest.java
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
 * Class used to create a ConditionExpressionGrpCreateRequest Udt Request
 *
 */

public class ConditionExpressionGrpCreateRequest extends ConditionExpressionGrpSubRequestParent {
/**
 *
 * Constructor to create a  ConditionExpressionGrpCreateRequest
 * @param id Unique request name
 * @param createIn CondExprGrpObjBaseData for ConditionExpressionGrpCreateRequest
 *
 */
@JsonCreator
  public ConditionExpressionGrpCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("ConditionExpressionGrp")CondExprGrpObjBaseData createIn) {
    super(id, "ConditionExpressionGrpCreate");
    if (createIn != null) {
      addInput("ConditionExpressionGrp", CondExprGrpObjBaseHelper.toMap(createIn, new HashMap(), "ConditionExpressionGrp").get("ConditionExpressionGrp"));
    }
  }

/**
 *
 * Retrieves the CondExprGrpObjBaseData that results from the ConditionExpressionGrpCreateRequest call
 * @return CondExprGrpObjBaseData resulting from udt call
 *
 */

  public CondExprGrpObjBaseData getOutput() {
    return CondExprGrpObjBaseHelper.fromMap(outputMap, "ConditionExpressionGrp");
  }
}
