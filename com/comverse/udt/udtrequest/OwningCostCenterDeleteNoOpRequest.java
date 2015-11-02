/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * OwningCostCenterDeleteNoOpRequest.java
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
 * NoOp class used to simulate a OwningCostCenterDeleteNoOpRequest Udt Request/Response
 *
 */
public class OwningCostCenterDeleteNoOpRequest extends OwningCostCenterSubRequestParent {
/**
 *
 * Constructor to create a   OwningCostCenterDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public OwningCostCenterDeleteNoOpRequest(String id, OwningCostCenterObjectData noOpIn) {
    super(id, "OwningCostCenterDeleteNoOpRequest");
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
