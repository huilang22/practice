/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationInvAssocCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvsLocationInvAssocCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsLocationInvAssocCreateNoOpRequest extends InvsLocationInvAssocSubRequestParent {
/**
 *
 * Constructor to create a   InvsLocationInvAssocCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLocationInvAssocCreateNoOpRequest(String id, InvsLocationInvAssocObjectData noOpIn) {
    super(id, "InvsLocationInvAssocCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsLocationInvAssoc", InvsLocationInvAssocObjectHelper.toMap(noOpIn, new HashMap(), "InvsLocationInvAssoc").get("InvsLocationInvAssoc"));
    }
  }
/**
 *
 * Retrieves the InvsLocationInvAssocObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationInvAssocObjectData getOutput() {
    return InvsLocationInvAssocObjectHelper.fromMap(outputMap, "InvsLocationInvAssoc");
  }
}
