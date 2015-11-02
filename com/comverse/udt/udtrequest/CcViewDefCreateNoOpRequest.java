/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CcViewDefCreateNoOpRequest.java
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
 * NoOp class used to simulate a CcViewDefCreateNoOpRequest Udt Request/Response
 *
 */
public class CcViewDefCreateNoOpRequest extends CcViewDefSubRequestParent {
/**
 *
 * Constructor to create a   CcViewDefCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CcViewDefCreateNoOpRequest(String id, CcViewDefObjectData noOpIn) {
    super(id, "CcViewDefCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CcViewDef", CcViewDefObjectHelper.toMap(noOpIn, new HashMap(), "CcViewDef").get("CcViewDef"));
    }
  }
/**
 *
 * Retrieves the CcViewDefObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CcViewDefObjectData getOutput() {
    return CcViewDefObjectHelper.fromMap(outputMap, "CcViewDef");
  }
}
