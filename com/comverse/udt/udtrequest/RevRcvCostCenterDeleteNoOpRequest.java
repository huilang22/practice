/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RevRcvCostCenterDeleteNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a RevRcvCostCenterDeleteNoOpRequest Udt Request/Response
 *
 */
public class RevRcvCostCenterDeleteNoOpRequest extends RevRcvCostCenterSubRequestParent {
/**
 *
 * Constructor to create a   RevRcvCostCenterDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public RevRcvCostCenterDeleteNoOpRequest(String id, RevRcvCostCenterObjectData noOpIn) {
    super(id, "RevRcvCostCenterDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("RevRcvCostCenter", RevRcvCostCenterObjectHelper.toMap(noOpIn, new HashMap(), "RevRcvCostCenter").get("RevRcvCostCenter"));
    }
  }
/**
 *
 * Retrieves the RevRcvCostCenterObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public RevRcvCostCenterObjectData getOutput() {
    return RevRcvCostCenterObjectHelper.fromMap(outputMap, "RevRcvCostCenter");
  }
}
