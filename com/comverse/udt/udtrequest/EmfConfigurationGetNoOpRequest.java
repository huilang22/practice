/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EmfConfigurationGetNoOpRequest.java
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
 * NoOp class used to simulate a EmfConfigurationGetNoOpRequest Udt Request/Response
 *
 */
public class EmfConfigurationGetNoOpRequest extends EmfConfigurationSubRequestParent {
/**
 *
 * Constructor to create a   EmfConfigurationGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public EmfConfigurationGetNoOpRequest(String id, EmfConfigurationObjectData noOpIn) {
    super(id, "EmfConfigurationGetNoOpRequest");
    if (noOpIn != null) {
      addInput("EmfConfiguration", EmfConfigurationObjectHelper.toMap(noOpIn, new HashMap(), "EmfConfiguration").get("EmfConfiguration"));
    }
  }
/**
 *
 * Retrieves the EmfConfigurationObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public EmfConfigurationObjectData getOutput() {
    return EmfConfigurationObjectHelper.fromMap(outputMap, "EmfConfiguration");
  }
}
