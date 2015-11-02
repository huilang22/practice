/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransSourceTypeUpdateNoOpRequest.java
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
 * NoOp class used to simulate a TransSourceTypeUpdateNoOpRequest Udt Request/Response
 *
 */
public class TransSourceTypeUpdateNoOpRequest extends TransSourceTypeSubRequestParent {
/**
 *
 * Constructor to create a   TransSourceTypeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TransSourceTypeUpdateNoOpRequest(String id, TransSourceTypeObjectData noOpIn) {
    super(id, "TransSourceTypeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("TransSourceType", TransSourceTypeObjectHelper.toMap(noOpIn, new HashMap(), "TransSourceType").get("TransSourceType"));
    }
  }
/**
 *
 * Retrieves the TransSourceTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public TransSourceTypeObjectData getOutput() {
    return TransSourceTypeObjectHelper.fromMap(outputMap, "TransSourceType");
  }
}
