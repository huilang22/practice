/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewAttributesGetNoOpRequest.java
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
 * NoOp class used to simulate a CcViewAttributesGetNoOpRequest Udt Request/Response
 *
 */
public class CcViewAttributesGetNoOpRequest extends CcViewAttributesSubRequestParent {
/**
 *
 * Constructor to create a   CcViewAttributesGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CcViewAttributesGetNoOpRequest(String id, CcViewAttributesObjectData noOpIn) {
    super(id, "CcViewAttributesGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CcViewAttributes", CcViewAttributesObjectHelper.toMap(noOpIn, new HashMap(), "CcViewAttributes").get("CcViewAttributes"));
    }
  }
/**
 *
 * Retrieves the CcViewAttributesObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CcViewAttributesObjectData getOutput() {
    return CcViewAttributesObjectHelper.fromMap(outputMap, "CcViewAttributes");
  }
}
