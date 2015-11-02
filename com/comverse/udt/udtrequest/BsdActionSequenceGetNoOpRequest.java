/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdActionSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdActionSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BsdActionSequenceGetNoOpRequest extends BsdActionSubRequestParent {
/**
 *
 * Constructor to create a   BsdActionSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdActionSequenceGetNoOpRequest(String id, BsdActionObjectKeyData noOpIn) {
    super(id, "BsdActionSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdAction", BsdActionObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdAction").get("BsdAction"));
    }
  }
/**
 *
 * Retrieves the BsdActionObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdActionObjectKeyData getOutput() {
    return BsdActionObjectKeyHelper.fromMap(outputMap, "BsdAction");
  }
}
