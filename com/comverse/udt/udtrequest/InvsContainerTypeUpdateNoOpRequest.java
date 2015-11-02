/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsContainerTypeUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsContainerTypeUpdateNoOpRequest extends InvsContainerTypeSubRequestParent {
/**
 *
 * Constructor to create a   InvsContainerTypeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsContainerTypeUpdateNoOpRequest(String id, InvsContainerTypeObjectData noOpIn) {
    super(id, "InvsContainerTypeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsContainerType", InvsContainerTypeObjectHelper.toMap(noOpIn, new HashMap(), "InvsContainerType").get("InvsContainerType"));
    }
  }
/**
 *
 * Retrieves the InvsContainerTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsContainerTypeObjectData getOutput() {
    return InvsContainerTypeObjectHelper.fromMap(outputMap, "InvsContainerType");
  }
}
