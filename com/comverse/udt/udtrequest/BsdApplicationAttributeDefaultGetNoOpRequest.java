/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdApplicationAttributeDefaultGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdApplicationAttributeDefaultGetNoOpRequest Udt Request/Response
 *
 */
public class BsdApplicationAttributeDefaultGetNoOpRequest extends BsdApplicationAttributeDefaultSubRequestParent {
/**
 *
 * Constructor to create a   BsdApplicationAttributeDefaultGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdApplicationAttributeDefaultGetNoOpRequest(String id, BsdApplicationAttributeDefaultObjectData noOpIn) {
    super(id, "BsdApplicationAttributeDefaultGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdApplicationAttributeDefault", BsdApplicationAttributeDefaultObjectHelper.toMap(noOpIn, new HashMap(), "BsdApplicationAttributeDefault").get("BsdApplicationAttributeDefault"));
    }
  }
/**
 *
 * Retrieves the BsdApplicationAttributeDefaultObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdApplicationAttributeDefaultObjectData getOutput() {
    return BsdApplicationAttributeDefaultObjectHelper.fromMap(outputMap, "BsdApplicationAttributeDefault");
  }
}
