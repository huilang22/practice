/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CsrAccountSegmentDeleteNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a CsrAccountSegmentDeleteNoOpRequest Udt Request/Response
 *
 */
public class CsrAccountSegmentDeleteNoOpRequest extends CsrAccountSegmentSubRequestParent {
/**
 *
 * Constructor to create a   CsrAccountSegmentDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CsrAccountSegmentDeleteNoOpRequest(String id, CsrAccountSegmentObjectData noOpIn) {
    super(id, "CsrAccountSegmentDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("CsrAccountSegment", CsrAccountSegmentObjectHelper.toMap(noOpIn, new HashMap(), "CsrAccountSegment").get("CsrAccountSegment"));
    }
  }
/**
 *
 * Retrieves the CsrAccountSegmentObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CsrAccountSegmentObjectData getOutput() {
    return CsrAccountSegmentObjectHelper.fromMap(outputMap, "CsrAccountSegment");
  }
}
