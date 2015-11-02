/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdConstraintMessageDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BsdConstraintMessageDeleteNoOpRequest Udt Request/Response
 *
 */
public class BsdConstraintMessageDeleteNoOpRequest extends BsdConstraintMessageSubRequestParent {
/**
 *
 * Constructor to create a   BsdConstraintMessageDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdConstraintMessageDeleteNoOpRequest(String id, BsdConstraintMessageObjectBaseData noOpIn) {
    super(id, "BsdConstraintMessageDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdConstraintMessage", BsdConstraintMessageObjectBaseHelper.toMap(noOpIn, new HashMap(), "BsdConstraintMessage").get("BsdConstraintMessage"));
    }
  }
/**
 *
 * Retrieves the BsdConstraintMessageObjectBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdConstraintMessageObjectBaseData getOutput() {
    return BsdConstraintMessageObjectBaseHelper.fromMap(outputMap, "BsdConstraintMessage");
  }
}
