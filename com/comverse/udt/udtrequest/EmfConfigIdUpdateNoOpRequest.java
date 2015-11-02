/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigIdUpdateNoOpRequest.java
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
 * NoOp class used to simulate a EmfConfigIdUpdateNoOpRequest Udt Request/Response
 *
 */
public class EmfConfigIdUpdateNoOpRequest extends EmfConfigIdSubRequestParent {
/**
 *
 * Constructor to create a   EmfConfigIdUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EmfConfigIdUpdateNoOpRequest(String id, ECIObjectData noOpIn) {
    super(id, "EmfConfigIdUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("EmfConfigId", ECIObjectHelper.toMap(noOpIn, new HashMap(), "EmfConfigId").get("EmfConfigId"));
    }
  }
/**
 *
 * Retrieves the ECIObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ECIObjectData getOutput() {
    return ECIObjectHelper.fromMap(outputMap, "EmfConfigId");
  }
}
