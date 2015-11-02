/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdApplicationSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BsdApplicationSequenceGetNoOpRequest extends BsdApplicationSubRequestParent {
/**
 *
 * Constructor to create a   BsdApplicationSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdApplicationSequenceGetNoOpRequest(String id, BsdApplicationObjectKeyData noOpIn) {
    super(id, "BsdApplicationSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdApplication", BsdApplicationObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdApplication").get("BsdApplication"));
    }
  }
/**
 *
 * Retrieves the BsdApplicationObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationObjectKeyData getOutput() {
    return BsdApplicationObjectKeyHelper.fromMap(outputMap, "BsdApplication");
  }
}
