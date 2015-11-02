/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointClassCreateNoOpRequest.java
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
 * NoOp class used to simulate a PointClassCreateNoOpRequest Udt Request/Response
 *
 */
public class PointClassCreateNoOpRequest extends PointClassSubRequestParent {
/**
 *
 * Constructor to create a   PointClassCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PointClassCreateNoOpRequest(String id, PointClassObjectData noOpIn) {
    super(id, "PointClassCreateNoOpRequest");
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
