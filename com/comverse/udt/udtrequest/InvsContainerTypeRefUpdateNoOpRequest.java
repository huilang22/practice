/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeRefUpdateNoOpRequest.java
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
 * NoOp class used to simulate a InvsContainerTypeRefUpdateNoOpRequest Udt Request/Response
 *
 */
public class InvsContainerTypeRefUpdateNoOpRequest extends InvsContainerTypeRefSubRequestParent {
/**
 *
 * Constructor to create a   InvsContainerTypeRefUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsContainerTypeRefUpdateNoOpRequest(String id, InvsContainerTypeRefObjectData noOpIn) {
    super(id, "InvsContainerTypeRefUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsContainerTypeRef", InvsContainerTypeRefObjectHelper.toMap(noOpIn, new HashMap(), "InvsContainerTypeRef").get("InvsContainerTypeRef"));
    }
  }
/**
 *
 * Retrieves the InvsContainerTypeRefObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsContainerTypeRefObjectData getOutput() {
    return InvsContainerTypeRefObjectHelper.fromMap(outputMap, "InvsContainerTypeRef");
  }
}
