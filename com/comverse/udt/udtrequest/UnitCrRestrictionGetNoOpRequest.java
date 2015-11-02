/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnitCrRestrictionGetNoOpRequest.java
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
 * NoOp class used to simulate a UnitCrRestrictionGetNoOpRequest Udt Request/Response
 *
 */
public class UnitCrRestrictionGetNoOpRequest extends UnitCrRestrictionSubRequestParent {
/**
 *
 * Constructor to create a   UnitCrRestrictionGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public UnitCrRestrictionGetNoOpRequest(String id, UnitCrRestrictionObjectData noOpIn) {
    super(id, "UnitCrRestrictionGetNoOpRequest");
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
