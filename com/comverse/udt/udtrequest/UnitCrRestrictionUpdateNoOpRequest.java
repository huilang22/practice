/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRestrictionUpdateNoOpRequest.java
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
 * NoOp class used to simulate a UnitCrRestrictionUpdateNoOpRequest Udt Request/Response
 *
 */
public class UnitCrRestrictionUpdateNoOpRequest extends UnitCrRestrictionSubRequestParent {
/**
 *
 * Constructor to create a   UnitCrRestrictionUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnitCrRestrictionUpdateNoOpRequest(String id, UnitCrRestrictionObjectData noOpIn) {
    super(id, "UnitCrRestrictionUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("UnitCrRestriction", UnitCrRestrictionObjectHelper.toMap(noOpIn, new HashMap(), "UnitCrRestriction").get("UnitCrRestriction"));
    }
  }
/**
 *
 * Retrieves the UnitCrRestrictionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public UnitCrRestrictionObjectData getOutput() {
    return UnitCrRestrictionObjectHelper.fromMap(outputMap, "UnitCrRestriction");
  }
}
