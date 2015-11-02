/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeCreateNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeCreateNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeCreateNoOpRequest extends BsdAttributeSubRequestParent {
/**
 *
 * Constructor to create a   BsdAttributeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeCreateNoOpRequest(String id, BsdAttributeObjectData noOpIn) {
    super(id, "BsdAttributeCreateNoOpRequest");
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
