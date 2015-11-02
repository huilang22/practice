/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionGrpCreateNoOpRequest.java
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
 * NoOp class used to simulate a ConditionGrpCreateNoOpRequest Udt Request/Response
 *
 */
public class ConditionGrpCreateNoOpRequest extends ConditionGrpSubRequestParent {
/**
 *
 * Constructor to create a   ConditionGrpCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ConditionGrpCreateNoOpRequest(String id, CondGrpObjBaseData noOpIn) {
    super(id, "ConditionGrpCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ConditionGrp", CondGrpObjBaseHelper.toMap(noOpIn, new HashMap(), "ConditionGrp").get("ConditionGrp"));
    }
  }
/**
 *
 * Retrieves the CondGrpObjBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public CondGrpObjBaseData getOutput() {
    return CondGrpObjBaseHelper.fromMap(outputMap, "ConditionGrp");
  }
}
