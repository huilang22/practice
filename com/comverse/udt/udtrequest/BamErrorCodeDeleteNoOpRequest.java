/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BamErrorCodeDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BamErrorCodeDeleteNoOpRequest Udt Request/Response
 *
 */
public class BamErrorCodeDeleteNoOpRequest extends BamErrorCodeSubRequestParent {
/**
 *
 * Constructor to create a   BamErrorCodeDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BamErrorCodeDeleteNoOpRequest(String id, BECObjectData noOpIn) {
    super(id, "BamErrorCodeDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("BamErrorCode", BECObjectHelper.toMap(noOpIn, new HashMap(), "BamErrorCode").get("BamErrorCode"));
    }
  }
/**
 *
 * Retrieves the BECObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BECObjectData getOutput() {
    return BECObjectHelper.fromMap(outputMap, "BamErrorCode");
  }
}
