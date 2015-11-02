/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ClassOfServiceCodeDeleteNoOpRequest.java
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
 * NoOp class used to simulate a ClassOfServiceCodeDeleteNoOpRequest Udt Request/Response
 *
 */
public class ClassOfServiceCodeDeleteNoOpRequest extends ClassOfServiceCodeSubRequestParent {
/**
 *
 * Constructor to create a   ClassOfServiceCodeDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ClassOfServiceCodeDeleteNoOpRequest(String id, COSCObjectData noOpIn) {
    super(id, "ClassOfServiceCodeDeleteNoOpRequest");
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
