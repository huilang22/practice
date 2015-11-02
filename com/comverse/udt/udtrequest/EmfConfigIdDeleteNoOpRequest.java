/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigIdDeleteNoOpRequest.java
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
 * NoOp class used to simulate a EmfConfigIdDeleteNoOpRequest Udt Request/Response
 *
 */
public class EmfConfigIdDeleteNoOpRequest extends EmfConfigIdSubRequestParent {
/**
 *
 * Constructor to create a   EmfConfigIdDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EmfConfigIdDeleteNoOpRequest(String id, ECIObjectData noOpIn) {
    super(id, "EmfConfigIdDeleteNoOpRequest");
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
