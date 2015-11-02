/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvsContainerTypeCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsContainerTypeCreateNoOpRequest extends InvsContainerTypeSubRequestParent {
/**
 *
 * Constructor to create a   InvsContainerTypeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsContainerTypeCreateNoOpRequest(String id, InvsContainerTypeObjectData noOpIn) {
    super(id, "InvsContainerTypeCreateNoOpRequest");
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
