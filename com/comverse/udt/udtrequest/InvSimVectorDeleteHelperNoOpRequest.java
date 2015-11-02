/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimVectorDeleteHelperNoOpRequest.java
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

import com.csgsystems.iv.data.*;

/**
 *
 * NoOp class used to simulate a InvSimVectorDeleteHelperNoOpRequest Udt Request/Response
 *
 */
public class InvSimVectorDeleteHelperNoOpRequest extends InvSimVectorRequest {
/**
 *
 * Constructor to create a   InvSimVectorDeleteHelperNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvSimVectorDeleteHelperNoOpRequest(String id, Integer noOpIn) {
    super(id, "InvSimVectorDeleteHelperNoOpRequest");
    if (noOpIn != null) {
      addInput("ReturnCode", noOpIn);
    }
  }
/**
 *
 * Retrieves the Integer passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getOutput() {
    return  (Integer)outputMap.get("ReturnCode");
  }
}
