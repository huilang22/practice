/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvElementCreateNoOpRequest Udt Request/Response
 *
 */
public class InvElementCreateNoOpRequest extends InvElementSubRequestParent {
/**
 *
 * Constructor to create a   InvElementCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvElementCreateNoOpRequest(String id, InvElementObjData noOpIn) {
    super(id, "InvElementCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvElement", InvElementObjHelper.toMap(noOpIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }
/**
 *
 * Retrieves the InvElementObjData passed into the constructor
 * @return Simulated response
 *
 */
  public InvElementObjData getOutput() {
    return InvElementObjHelper.fromMap(outputMap, "InvElement");
  }
}
