/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintMessageGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdConstraintMessageGetNoOpRequest Udt Request/Response
 *
 */
public class BsdConstraintMessageGetNoOpRequest extends BsdConstraintMessageSubRequestParent {
/**
 *
 * Constructor to create a   BsdConstraintMessageGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdConstraintMessageGetNoOpRequest(String id, BsdConstraintMessageObjectData noOpIn) {
    super(id, "BsdConstraintMessageGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectHelper.toMap(noOpIn, new HashMap(), "BsdConstraintMessage").get("BsdConstraintMessage"));
    }
  }
/**
 *
 * Retrieves the BsdConstraintMessageObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdConstraintMessageObjectData getOutput() {
    return BsdConstraintMessageObjectHelper.fromMap(outputMap, "BsdConstraintMessage");
  }
}
