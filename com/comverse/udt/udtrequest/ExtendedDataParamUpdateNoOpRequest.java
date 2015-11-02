/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataParamUpdateNoOpRequest.java
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
 * NoOp class used to simulate a ExtendedDataParamUpdateNoOpRequest Udt Request/Response
 *
 */
public class ExtendedDataParamUpdateNoOpRequest extends ExtendedDataParamSubRequestParent {
/**
 *
 * Constructor to create a   ExtendedDataParamUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExtendedDataParamUpdateNoOpRequest(String id, XPDObjectData noOpIn) {
    super(id, "ExtendedDataParamUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("ExtendedDataParam", XPDObjectHelper.toMap(noOpIn, new HashMap(), "ExtendedDataParam").get("ExtendedDataParam"));
    }
  }
/**
 *
 * Retrieves the XPDObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public XPDObjectData getOutput() {
    return XPDObjectHelper.fromMap(outputMap, "ExtendedDataParam");
  }
}
