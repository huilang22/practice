/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectDeleteNoOpRequest.java
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
 * NoOp class used to simulate a BsdObjectDeleteNoOpRequest Udt Request/Response
 *
 */
public class BsdObjectDeleteNoOpRequest extends BsdObjectSubRequestParent {
/**
 *
 * Constructor to create a   BsdObjectDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdObjectDeleteNoOpRequest(String id, BsdObjectObjectData noOpIn) {
    super(id, "BsdObjectDeleteNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdObject", BsdObjectObjectHelper.toMap(noOpIn, new HashMap(), "BsdObject").get("BsdObject"));
    }
  }
/**
 *
 * Retrieves the BsdObjectObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdObjectObjectData getOutput() {
    return BsdObjectObjectHelper.fromMap(outputMap, "BsdObject");
  }
}
