/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorCreateNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvsVendorCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsVendorCreateNoOpRequest extends InvsVendorSubRequestParent {
/**
 *
 * Constructor to create a   InvsVendorCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsVendorCreateNoOpRequest(String id, InvsVendorObjectData noOpIn) {
    super(id, "InvsVendorCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsVendor", InvsVendorObjectHelper.toMap(noOpIn, new HashMap(), "InvsVendor").get("InvsVendor"));
    }
  }
/**
 *
 * Retrieves the InvsVendorObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsVendorObjectData getOutput() {
    return InvsVendorObjectHelper.fromMap(outputMap, "InvsVendor");
  }
}
