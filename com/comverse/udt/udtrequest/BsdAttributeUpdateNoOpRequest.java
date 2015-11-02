/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeUpdateNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeUpdateNoOpRequest extends BsdAttributeSubRequestParent {
/**
 *
 * Constructor to create a   BsdAttributeUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeUpdateNoOpRequest(String id, BsdAttributeObjectData noOpIn) {
    super(id, "BsdAttributeUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdAttribute", BsdAttributeObjectHelper.toMap(noOpIn, new HashMap(), "BsdAttribute").get("BsdAttribute"));
    }
  }
/**
 *
 * Retrieves the BsdAttributeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeObjectData getOutput() {
    return BsdAttributeObjectHelper.fromMap(outputMap, "BsdAttribute");
  }
}
