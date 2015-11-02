/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrDecisionTreeGetNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a RbrDecisionTreeGetNoOpRequest Udt Request/Response
 *
 */
public class RbrDecisionTreeGetNoOpRequest extends RbrDecisionTreeSubRequestParent {
/**
 *
 * Constructor to create a   RbrDecisionTreeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrDecisionTreeGetNoOpRequest(String id, RbrDecTreeObjectData noOpIn) {
    super(id, "RbrDecisionTreeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("RbrDecisionTree", RbrDecTreeObjectHelper.toMap(noOpIn, new HashMap(), "RbrDecisionTree").get("RbrDecisionTree"));
    }
  }
/**
 *
 * Retrieves the RbrDecTreeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RbrDecTreeObjectData getOutput() {
    return RbrDecTreeObjectHelper.fromMap(outputMap, "RbrDecisionTree");
  }
}
