/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OwningCostCenterUpdateNoOpRequest.java
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
 * NoOp class used to simulate a OwningCostCenterUpdateNoOpRequest Udt Request/Response
 *
 */
public class OwningCostCenterUpdateNoOpRequest extends OwningCostCenterSubRequestParent {
/**
 *
 * Constructor to create a   OwningCostCenterUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OwningCostCenterUpdateNoOpRequest(String id, OwningCostCenterObjectData noOpIn) {
    super(id, "OwningCostCenterUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("OwningCostCenter", OwningCostCenterObjectHelper.toMap(noOpIn, new HashMap(), "OwningCostCenter").get("OwningCostCenter"));
    }
  }
/**
 *
 * Retrieves the OwningCostCenterObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public OwningCostCenterObjectData getOutput() {
    return OwningCostCenterObjectHelper.fromMap(outputMap, "OwningCostCenter");
  }
}
