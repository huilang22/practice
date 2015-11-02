/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeDefaultGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeDefaultGetNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeDefaultGetNoOpRequest extends BsdAttributeDefaultSubRequestParent {
/**
 *
 * Constructor to create a   BsdAttributeDefaultGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeDefaultGetNoOpRequest(String id, BsdAttributeDefaultObjectData noOpIn) {
    super(id, "BsdAttributeDefaultGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectHelper.toMap(noOpIn, new HashMap(), "BsdAttributeDefault").get("BsdAttributeDefault"));
    }
  }
/**
 *
 * Retrieves the BsdAttributeDefaultObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeDefaultObjectData getOutput() {
    return BsdAttributeDefaultObjectHelper.fromMap(outputMap, "BsdAttributeDefault");
  }
}
