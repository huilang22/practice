/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsTypeGetNoOpRequest Udt Request/Response
 *
 */
public class InvsTypeGetNoOpRequest extends InvsTypeSubRequestParent {
/**
 *
 * Constructor to create a   InvsTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsTypeGetNoOpRequest(String id, InvsTypeObjectData noOpIn) {
    super(id, "InvsTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsType", InvsTypeObjectHelper.toMap(noOpIn, new HashMap(), "InvsType").get("InvsType"));
    }
  }
/**
 *
 * Retrieves the InvsTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsTypeObjectData getOutput() {
    return InvsTypeObjectHelper.fromMap(outputMap, "InvsType");
  }
}
