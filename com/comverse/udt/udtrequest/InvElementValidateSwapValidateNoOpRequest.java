/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementValidateSwapValidateNoOpRequest.java
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

import com.csgsystems.om.data.*;

/**
 *
 * NoOp class used to simulate a InvElementValidateSwapValidateNoOpRequest Udt Request/Response
 *
 */
public class InvElementValidateSwapValidateNoOpRequest extends InvElementValidateSubRequestParent {
/**
 *
 * Constructor to create a   InvElementValidateSwapValidateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvElementValidateSwapValidateNoOpRequest(String id, InvElementValidateObjectData noOpIn) {
    super(id, "InvElementValidateSwapValidateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvElementValidate", InvElementValidateObjectHelper.toMap(noOpIn, new HashMap(), "InvElementValidate").get("InvElementValidate"));
    }
  }
/**
 *
 * Retrieves the InvElementValidateObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvElementValidateObjectData getOutput() {
    return InvElementValidateObjectHelper.fromMap(outputMap, "InvElementValidate");
  }
}
