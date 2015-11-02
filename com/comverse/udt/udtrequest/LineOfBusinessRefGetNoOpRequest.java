/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LineOfBusinessRefGetNoOpRequest.java
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
 * NoOp class used to simulate a LineOfBusinessRefGetNoOpRequest Udt Request/Response
 *
 */
public class LineOfBusinessRefGetNoOpRequest extends LineOfBusinessRefSubRequestParent {
/**
 *
 * Constructor to create a   LineOfBusinessRefGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LineOfBusinessRefGetNoOpRequest(String id, LineOfBusinessRefObjectData noOpIn) {
    super(id, "LineOfBusinessRefGetNoOpRequest");
    if (noOpIn != null) {
      addInput("LineOfBusinessRef", LineOfBusinessRefObjectHelper.toMap(noOpIn, new HashMap(), "LineOfBusinessRef").get("LineOfBusinessRef"));
    }
  }
/**
 *
 * Retrieves the LineOfBusinessRefObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public LineOfBusinessRefObjectData getOutput() {
    return LineOfBusinessRefObjectHelper.fromMap(outputMap, "LineOfBusinessRef");
  }
}
