/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ConditionGrpGetNoOpRequest.java
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
 * NoOp class used to simulate a ConditionGrpGetNoOpRequest Udt Request/Response
 *
 */
public class ConditionGrpGetNoOpRequest extends ConditionGrpSubRequestParent {
/**
 *
 * Constructor to create a   ConditionGrpGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ConditionGrpGetNoOpRequest(String id, CondGrpObjData noOpIn) {
    super(id, "ConditionGrpGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ConditionGrp", CondGrpObjHelper.toMap(noOpIn, new HashMap(), "ConditionGrp").get("ConditionGrp"));
    }
  }
/**
 *
 * Retrieves the CondGrpObjData passed into the constructor
 * @return Simulated response
 *
 */
  public CondGrpObjData getOutput() {
    return CondGrpObjHelper.fromMap(outputMap, "ConditionGrp");
  }
}
