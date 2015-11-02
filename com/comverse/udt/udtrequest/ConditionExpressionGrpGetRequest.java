/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionGrpGetRequest.java
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
 * Class used to create a ConditionExpressionGrpGetRequest Udt Request
 *
 */

public class ConditionExpressionGrpGetRequest extends ConditionExpressionGrpSubRequestParent {
/**
 *
 * Constructor to create a  ConditionExpressionGrpGetRequest
 * @param id Unique request name
 * @param getIn CondExprGrpObjBaseKeyData for ConditionExpressionGrpGetRequest
 *
 */
@JsonCreator
  public ConditionExpressionGrpGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("ConditionExpressionGrp")CondExprGrpObjBaseKeyData getIn) {
    super(id, "ConditionExpressionGrpGet");
    if (getIn != null) {
      addInput("ConditionExpressionGrp", CondExprGrpObjBaseKeyHelper.toMap(getIn, new HashMap(), "CondExprGrpObjBaseKeyData").get("CondExprGrpObjBaseKeyData"));
    }
  }

/**
 *
 * Retrieves the CondExprGrpObjData that results from the ConditionExpressionGrpGetRequest call
 * @return CondExprGrpObjData resulting from udt call
 *
 */

  public CondExprGrpObjData getOutput() {
    return CondExprGrpObjHelper.fromMap(outputMap, "ConditionExpressionGrp");
  }
}
