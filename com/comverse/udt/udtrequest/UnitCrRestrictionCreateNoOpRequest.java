/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRestrictionCreateNoOpRequest.java
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
 * NoOp class used to simulate a UnitCrRestrictionCreateNoOpRequest Udt Request/Response
 *
 */
public class UnitCrRestrictionCreateNoOpRequest extends UnitCrRestrictionSubRequestParent {
/**
 *
 * Constructor to create a   UnitCrRestrictionCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnitCrRestrictionCreateNoOpRequest(String id, UnitCrRestrictionObjectData noOpIn) {
    super(id, "UnitCrRestrictionCreateNoOpRequest");
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
