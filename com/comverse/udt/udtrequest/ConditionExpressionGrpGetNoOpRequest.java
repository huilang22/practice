/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionGrpGetNoOpRequest.java
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

/**
 *
 * NoOp class used to simulate a ConditionExpressionGrpGetNoOpRequest Udt Request/Response
 *
 */
public class ConditionExpressionGrpGetNoOpRequest extends ConditionExpressionGrpSubRequestParent {
/**
 *
 * Constructor to create a   ConditionExpressionGrpGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ConditionExpressionGrpGetNoOpRequest(String id, CondExprGrpObjData noOpIn) {
    super(id, "ConditionExpressionGrpGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ConditionExpressionGrp", CondExprGrpObjHelper.toMap(noOpIn, new HashMap(), "ConditionExpressionGrp").get("ConditionExpressionGrp"));
    }
  }
/**
 *
 * Retrieves the CondExprGrpObjData passed into the constructor
 * @return Simulated response
 *
 */
  public CondExprGrpObjData getOutput() {
    return CondExprGrpObjHelper.fromMap(outputMap, "ConditionExpressionGrp");
  }
}
