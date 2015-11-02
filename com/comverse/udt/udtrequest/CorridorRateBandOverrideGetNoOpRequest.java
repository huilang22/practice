/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CorridorRateBandOverrideGetNoOpRequest.java
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
 * NoOp class used to simulate a CorridorRateBandOverrideGetNoOpRequest Udt Request/Response
 *
 */
public class CorridorRateBandOverrideGetNoOpRequest extends CorridorRateBandOverrideSubRequestParent {
/**
 *
 * Constructor to create a   CorridorRateBandOverrideGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CorridorRateBandOverrideGetNoOpRequest(String id, CRBOObjectData noOpIn) {
    super(id, "CorridorRateBandOverrideGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CorridorRateBandOverride", CRBOObjectHelper.toMap(noOpIn, new HashMap(), "CorridorRateBandOverride").get("CorridorRateBandOverride"));
    }
  }
/**
 *
 * Retrieves the CRBOObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CRBOObjectData getOutput() {
    return CRBOObjectHelper.fromMap(outputMap, "CorridorRateBandOverride");
  }
}
