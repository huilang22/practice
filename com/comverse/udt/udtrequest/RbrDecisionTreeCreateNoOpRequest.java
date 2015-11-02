/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrDecisionTreeCreateNoOpRequest.java
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
 * NoOp class used to simulate a RbrDecisionTreeCreateNoOpRequest Udt Request/Response
 *
 */
public class RbrDecisionTreeCreateNoOpRequest extends RbrDecisionTreeSubRequestParent {
/**
 *
 * Constructor to create a   RbrDecisionTreeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RbrDecisionTreeCreateNoOpRequest(String id, RbrDecTreeObjectData noOpIn) {
    super(id, "RbrDecisionTreeCreateNoOpRequest");
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
