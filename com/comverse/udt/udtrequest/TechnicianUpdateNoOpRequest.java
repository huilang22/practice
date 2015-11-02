/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TechnicianUpdateNoOpRequest.java
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

import com.csgsystems.we.data.*;

/**
 *
 * NoOp class used to simulate a TechnicianUpdateNoOpRequest Udt Request/Response
 *
 */
public class TechnicianUpdateNoOpRequest extends TechnicianSubRequestParent {
/**
 *
 * Constructor to create a   TechnicianUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TechnicianUpdateNoOpRequest(String id, TechnicianObjectData noOpIn) {
    super(id, "TechnicianUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("Technician", TechnicianObjectHelper.toMap(noOpIn, new HashMap(), "Technician").get("Technician"));
    }
  }
/**
 *
 * Retrieves the TechnicianObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public TechnicianObjectData getOutput() {
    return TechnicianObjectHelper.fromMap(outputMap, "Technician");
  }
}
