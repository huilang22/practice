/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementReturnNoOpRequest.java
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
 * NoOp class used to simulate a InvElementReturnNoOpRequest Udt Request/Response
 *
 */
public class InvElementReturnNoOpRequest extends InvElementSubRequestParent {
/**
 *
 * Constructor to create a   InvElementReturnNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvElementReturnNoOpRequest(String id, InvElementObjData noOpIn) {
    super(id, "InvElementReturnNoOpRequest");
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
