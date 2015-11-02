/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintMessageSequenceGetNoOpRequest.java
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

import com.csgsystems.utl.data.*;

/**
 *
 * NoOp class used to simulate a BsdConstraintMessageSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BsdConstraintMessageSequenceGetNoOpRequest extends BsdConstraintMessageSubRequestParent {
/**
 *
 * Constructor to create a   BsdConstraintMessageSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdConstraintMessageSequenceGetNoOpRequest(String id, BsdConstraintMessageObjectBaseKeyData noOpIn) {
    super(id, "BsdConstraintMessageSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectBaseKeyHelper.toMap(noOpIn, new HashMap(), "BsdConstraintMessage").get("BsdConstraintMessage"));
    }
  }
/**
 *
 * Retrieves the BsdConstraintMessageObjectBaseKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdConstraintMessageObjectBaseKeyData getOutput() {
    return BsdConstraintMessageObjectBaseKeyHelper.fromMap(outputMap, "BsdConstraintMessage");
  }
}
