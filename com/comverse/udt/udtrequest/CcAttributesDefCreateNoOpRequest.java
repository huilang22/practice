/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcAttributesDefCreateNoOpRequest.java
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
 * NoOp class used to simulate a CcAttributesDefCreateNoOpRequest Udt Request/Response
 *
 */
public class CcAttributesDefCreateNoOpRequest extends CcAttributesDefSubRequestParent {
/**
 *
 * Constructor to create a   CcAttributesDefCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CcAttributesDefCreateNoOpRequest(String id, CcAttributesDefObjectData noOpIn) {
    super(id, "CcAttributesDefCreateNoOpRequest");
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
