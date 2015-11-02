/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * PointCategoryDeleteNoOpRequest.java
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
 * NoOp class used to simulate a PointCategoryDeleteNoOpRequest Udt Request/Response
 *
 */
public class PointCategoryDeleteNoOpRequest extends PointCategorySubRequestParent {
/**
 *
 * Constructor to create a   PointCategoryDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public PointCategoryDeleteNoOpRequest(String id, PointCategoryObjectData noOpIn) {
    super(id, "PointCategoryDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("PointCategory", PointCategoryObjectHelper.toMap(noOpIn, new HashMap(), "PointCategory").get("PointCategory"));
    }
  }
/**
 *
 * Retrieves the PointCategoryObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public PointCategoryObjectData getOutput() {
    return PointCategoryObjectHelper.fromMap(outputMap, "PointCategory");
  }
}
