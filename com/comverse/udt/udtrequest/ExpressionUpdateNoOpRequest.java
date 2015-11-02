/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExpressionUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ExpressionUpdateNoOpRequest Udt Request/Response
 *
 */
public class ExpressionUpdateNoOpRequest extends ExpressionSubRequestParent {
/**
 *
 * Constructor to create a   ExpressionUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExpressionUpdateNoOpRequest(String id, ExprObjData noOpIn) {
    super(id, "ExpressionUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("Expression", ExprObjHelper.toMap(noOpIn, new HashMap(), "Expression").get("Expression"));
    }
  }
/**
 *
 * Retrieves the ExprObjData passed into the constructor
 * @return Simulated response
 *
 */
  public ExprObjData getOutput() {
    return ExprObjHelper.fromMap(outputMap, "Expression");
  }
}
