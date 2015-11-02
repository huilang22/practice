/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MobileZoneCreateNoOpRequest.java
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
 * NoOp class used to simulate a MobileZoneCreateNoOpRequest Udt Request/Response
 *
 */
public class MobileZoneCreateNoOpRequest extends MobileZoneSubRequestParent {
/**
 *
 * Constructor to create a   MobileZoneCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MobileZoneCreateNoOpRequest(String id, MobileZoneObjectData noOpIn) {
    super(id, "MobileZoneCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("MobileZone", MobileZoneObjectHelper.toMap(noOpIn, new HashMap(), "MobileZone").get("MobileZone"));
    }
  }
/**
 *
 * Retrieves the MobileZoneObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public MobileZoneObjectData getOutput() {
    return MobileZoneObjectHelper.fromMap(outputMap, "MobileZone");
  }
}
