/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointClassUpdateNoOpRequest.java
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
 * NoOp class used to simulate a PointClassUpdateNoOpRequest Udt Request/Response
 *
 */
public class PointClassUpdateNoOpRequest extends PointClassSubRequestParent {
/**
 *
 * Constructor to create a   PointClassUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PointClassUpdateNoOpRequest(String id, PointClassObjectData noOpIn) {
    super(id, "PointClassUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("PointClass", PointClassObjectHelper.toMap(noOpIn, new HashMap(), "PointClass").get("PointClass"));
    }
  }
/**
 *
 * Retrieves the PointClassObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PointClassObjectData getOutput() {
    return PointClassObjectHelper.fromMap(outputMap, "PointClass");
  }
}
