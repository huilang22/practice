/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LineOfBusinessValuesGetNoOpRequest.java
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
 * NoOp class used to simulate a LineOfBusinessValuesGetNoOpRequest Udt Request/Response
 *
 */
public class LineOfBusinessValuesGetNoOpRequest extends LineOfBusinessValuesSubRequestParent {
/**
 *
 * Constructor to create a   LineOfBusinessValuesGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public LineOfBusinessValuesGetNoOpRequest(String id, LineOfBusinessValuesObjectData noOpIn) {
    super(id, "LineOfBusinessValuesGetNoOpRequest");
    if (noOpIn != null) {
      addInput("LineOfBusinessValues", LineOfBusinessValuesObjectHelper.toMap(noOpIn, new HashMap(), "LineOfBusinessValues").get("LineOfBusinessValues"));
    }
  }
/**
 *
 * Retrieves the LineOfBusinessValuesObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public LineOfBusinessValuesObjectData getOutput() {
    return LineOfBusinessValuesObjectHelper.fromMap(outputMap, "LineOfBusinessValues");
  }
}
