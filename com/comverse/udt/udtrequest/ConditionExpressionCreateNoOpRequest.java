/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionExpressionCreateNoOpRequest.java
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
 * NoOp class used to simulate a ConditionExpressionCreateNoOpRequest Udt Request/Response
 *
 */
public class ConditionExpressionCreateNoOpRequest extends ConditionExpressionSubRequestParent {
/**
 *
 * Constructor to create a   ConditionExpressionCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ConditionExpressionCreateNoOpRequest(String id, CondExprObjData noOpIn) {
    super(id, "ConditionExpressionCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ConditionExpression", CondExprObjHelper.toMap(noOpIn, new HashMap(), "ConditionExpression").get("ConditionExpression"));
    }
  }
/**
 *
 * Retrieves the CondExprObjData passed into the constructor
 * @return Simulated response
 *
 */
  public CondExprObjData getOutput() {
    return CondExprObjHelper.fromMap(outputMap, "ConditionExpression");
  }
}
