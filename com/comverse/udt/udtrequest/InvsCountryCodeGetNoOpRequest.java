/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsCountryCodeGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsCountryCodeGetNoOpRequest Udt Request/Response
 *
 */
public class InvsCountryCodeGetNoOpRequest extends InvsCountryCodeSubRequestParent {
/**
 *
 * Constructor to create a   InvsCountryCodeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsCountryCodeGetNoOpRequest(String id, InvsCountryCodeObjectData noOpIn) {
    super(id, "InvsCountryCodeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsCountryCode", InvsCountryCodeObjectHelper.toMap(noOpIn, new HashMap(), "InvsCountryCode").get("InvsCountryCode"));
    }
  }
/**
 *
 * Retrieves the InvsCountryCodeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsCountryCodeObjectData getOutput() {
    return InvsCountryCodeObjectHelper.fromMap(outputMap, "InvsCountryCode");
  }
}
