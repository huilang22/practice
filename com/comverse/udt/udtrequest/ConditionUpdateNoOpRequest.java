/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ConditionUpdateNoOpRequest Udt Request/Response
 *
 */
public class ConditionUpdateNoOpRequest extends ConditionSubRequestParent {
/**
 *
 * Constructor to create a   ConditionUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ConditionUpdateNoOpRequest(String id, CondObjData noOpIn) {
    super(id, "ConditionUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("Condition", CondObjHelper.toMap(noOpIn, new HashMap(), "Condition").get("Condition"));
    }
  }
/**
 *
 * Retrieves the CondObjData passed into the constructor
 * @return Simulated response
 *
 */
  public CondObjData getOutput() {
    return CondObjHelper.fromMap(outputMap, "Condition");
  }
}
