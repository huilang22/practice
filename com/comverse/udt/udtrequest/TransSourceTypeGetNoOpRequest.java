/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * TransSourceTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a TransSourceTypeGetNoOpRequest Udt Request/Response
 *
 */
public class TransSourceTypeGetNoOpRequest extends TransSourceTypeSubRequestParent {
/**
 *
 * Constructor to create a   TransSourceTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public TransSourceTypeGetNoOpRequest(String id, TransSourceTypeObjectData noOpIn) {
    super(id, "TransSourceTypeGetNoOpRequest");
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
