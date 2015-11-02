/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * GenderTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a GenderTypeGetNoOpRequest Udt Request/Response
 *
 */
public class GenderTypeGetNoOpRequest extends GenderTypeSubRequestParent {
/**
 *
 * Constructor to create a   GenderTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public GenderTypeGetNoOpRequest(String id, GenderTypeObjectData noOpIn) {
    super(id, "GenderTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("GenderType", GenderTypeObjectHelper.toMap(noOpIn, new HashMap(), "GenderType").get("GenderType"));
    }
  }
/**
 *
 * Retrieves the GenderTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public GenderTypeObjectData getOutput() {
    return GenderTypeObjectHelper.fromMap(outputMap, "GenderType");
  }
}
