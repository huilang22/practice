/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAttributesDefGetNoOpRequest.java
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
 * NoOp class used to simulate a CcAttributesDefGetNoOpRequest Udt Request/Response
 *
 */
public class CcAttributesDefGetNoOpRequest extends CcAttributesDefSubRequestParent {
/**
 *
 * Constructor to create a   CcAttributesDefGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CcAttributesDefGetNoOpRequest(String id, CcAttributesDefObjectData noOpIn) {
    super(id, "CcAttributesDefGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CcAttributesDef", CcAttributesDefObjectHelper.toMap(noOpIn, new HashMap(), "CcAttributesDef").get("CcAttributesDef"));
    }
  }
/**
 *
 * Retrieves the CcAttributesDefObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CcAttributesDefObjectData getOutput() {
    return CcAttributesDefObjectHelper.fromMap(outputMap, "CcAttributesDef");
  }
}
