/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdActionCreateNoOpRequest.java
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
 * NoOp class used to simulate a BsdActionCreateNoOpRequest Udt Request/Response
 *
 */
public class BsdActionCreateNoOpRequest extends BsdActionSubRequestParent {
/**
 *
 * Constructor to create a   BsdActionCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdActionCreateNoOpRequest(String id, BsdActionObjectData noOpIn) {
    super(id, "BsdActionCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdAction", BsdActionObjectHelper.toMap(noOpIn, new HashMap(), "BsdAction").get("BsdAction"));
    }
  }
/**
 *
 * Retrieves the BsdActionObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdActionObjectData getOutput() {
    return BsdActionObjectHelper.fromMap(outputMap, "BsdAction");
  }
}
