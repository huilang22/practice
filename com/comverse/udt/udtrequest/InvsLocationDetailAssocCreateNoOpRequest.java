/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationDetailAssocCreateNoOpRequest.java
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
 * NoOp class used to simulate a InvsLocationDetailAssocCreateNoOpRequest Udt Request/Response
 *
 */
public class InvsLocationDetailAssocCreateNoOpRequest extends InvsLocationDetailAssocSubRequestParent {
/**
 *
 * Constructor to create a   InvsLocationDetailAssocCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public InvsLocationDetailAssocCreateNoOpRequest(String id, InvsLocationDetailAssocObjectData noOpIn) {
    super(id, "InvsLocationDetailAssocCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("InvsLocationDetailAssoc", InvsLocationDetailAssocObjectHelper.toMap(noOpIn, new HashMap(), "InvsLocationDetailAssoc").get("InvsLocationDetailAssoc"));
    }
  }
/**
 *
 * Retrieves the InvsLocationDetailAssocObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public InvsLocationDetailAssocObjectData getOutput() {
    return InvsLocationDetailAssocObjectHelper.fromMap(outputMap, "InvsLocationDetailAssoc");
  }
}
