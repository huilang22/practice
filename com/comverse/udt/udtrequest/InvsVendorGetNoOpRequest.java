/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsVendorGetNoOpRequest Udt Request/Response
 *
 */
public class InvsVendorGetNoOpRequest extends InvsVendorSubRequestParent {
/**
 *
 * Constructor to create a   InvsVendorGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsVendorGetNoOpRequest(String id, InvsVendorObjectData noOpIn) {
    super(id, "InvsVendorGetNoOpRequest");
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
