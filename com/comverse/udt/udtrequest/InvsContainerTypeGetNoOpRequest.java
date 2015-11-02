/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a InvsContainerTypeGetNoOpRequest Udt Request/Response
 *
 */
public class InvsContainerTypeGetNoOpRequest extends InvsContainerTypeSubRequestParent {
/**
 *
 * Constructor to create a   InvsContainerTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsContainerTypeGetNoOpRequest(String id, InvsContainerTypeObjectData noOpIn) {
    super(id, "InvsContainerTypeGetNoOpRequest");
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
