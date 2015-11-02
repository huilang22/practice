/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClassOfServiceCodeGetNoOpRequest.java
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
 * NoOp class used to simulate a ClassOfServiceCodeGetNoOpRequest Udt Request/Response
 *
 */
public class ClassOfServiceCodeGetNoOpRequest extends ClassOfServiceCodeSubRequestParent {
/**
 *
 * Constructor to create a   ClassOfServiceCodeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ClassOfServiceCodeGetNoOpRequest(String id, COSCObjectData noOpIn) {
    super(id, "ClassOfServiceCodeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("ClassOfServiceCode", COSCObjectHelper.toMap(noOpIn, new HashMap(), "ClassOfServiceCode").get("ClassOfServiceCode"));
    }
  }
/**
 *
 * Retrieves the COSCObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public COSCObjectData getOutput() {
    return COSCObjectHelper.fromMap(outputMap, "ClassOfServiceCode");
  }
}
