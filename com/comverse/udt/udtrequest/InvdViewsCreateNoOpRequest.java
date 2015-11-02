/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdViewsCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvdViewsCreateNoOpRequest Udt Request/Response
 *
 */
public class InvdViewsCreateNoOpRequest extends InvdViewsSubRequestParent {
/**
 *
 * Constructor to create a   InvdViewsCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvdViewsCreateNoOpRequest(String id, InvdViewsObjectData noOpIn) {
    super(id, "InvdViewsCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvdViews", InvdViewsObjectHelper.toMap(noOpIn, new HashMap(), "InvdViews").get("InvdViews"));
    }
  }
/**
 *
 * Retrieves the InvdViewsObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvdViewsObjectData getOutput() {
    return InvdViewsObjectHelper.fromMap(outputMap, "InvdViews");
  }
}
