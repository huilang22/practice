/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdObjectSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BsdObjectSequenceGetNoOpRequest extends BsdObjectSubRequestParent {
/**
 *
 * Constructor to create a   BsdObjectSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdObjectSequenceGetNoOpRequest(String id, BsdObjectObjectKeyData noOpIn) {
    super(id, "BsdObjectSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdObject", BsdObjectObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdObject").get("BsdObject"));
    }
  }
/**
 *
 * Retrieves the BsdObjectObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdObjectObjectKeyData getOutput() {
    return BsdObjectObjectKeyHelper.fromMap(outputMap, "BsdObject");
  }
}
