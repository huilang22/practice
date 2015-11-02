/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionGrpCreateNoOpRequest.java
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
 * NoOp class used to simulate a ConditionExpressionGrpCreateNoOpRequest Udt Request/Response
 *
 */
public class ConditionExpressionGrpCreateNoOpRequest extends ConditionExpressionGrpSubRequestParent {
/**
 *
 * Constructor to create a   ConditionExpressionGrpCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ConditionExpressionGrpCreateNoOpRequest(String id, CondExprGrpObjBaseData noOpIn) {
    super(id, "ConditionExpressionGrpCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ConditionExpressionGrp", CondExprGrpObjBaseHelper.toMap(noOpIn, new HashMap(), "ConditionExpressionGrp").get("ConditionExpressionGrp"));
    }
  }
/**
 *
 * Retrieves the CondExprGrpObjBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public CondExprGrpObjBaseData getOutput() {
    return CondExprGrpObjBaseHelper.fromMap(outputMap, "ConditionExpressionGrp");
  }
}
