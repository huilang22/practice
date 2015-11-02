/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorRefCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvsVendorRefCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsVendorRefCreateNoOpRequest extends InvsVendorRefSubRequestParent {
/**
 *
 * Constructor to create a   InvsVendorRefCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsVendorRefCreateNoOpRequest(String id, InvsVendorRefObjectData noOpIn) {
    super(id, "InvsVendorRefCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsVendorRef", InvsVendorRefObjectHelper.toMap(noOpIn, new HashMap(), "InvsVendorRef").get("InvsVendorRef"));
    }
  }
/**
 *
 * Retrieves the InvsVendorRefObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsVendorRefObjectData getOutput() {
    return InvsVendorRefObjectHelper.fromMap(outputMap, "InvsVendorRef");
  }
}
