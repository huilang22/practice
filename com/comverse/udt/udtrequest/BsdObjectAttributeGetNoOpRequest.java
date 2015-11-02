/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectAttributeGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdObjectAttributeGetNoOpRequest Udt Request/Response
 *
 */
public class BsdObjectAttributeGetNoOpRequest extends BsdObjectAttributeSubRequestParent {
/**
 *
 * Constructor to create a   BsdObjectAttributeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdObjectAttributeGetNoOpRequest(String id, BsdObjectAttributeObjectData noOpIn) {
    super(id, "BsdObjectAttributeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdObjectAttribute", BsdObjectAttributeObjectHelper.toMap(noOpIn, new HashMap(), "BsdObjectAttribute").get("BsdObjectAttribute"));
    }
  }
/**
 *
 * Retrieves the BsdObjectAttributeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdObjectAttributeObjectData getOutput() {
    return BsdObjectAttributeObjectHelper.fromMap(outputMap, "BsdObjectAttribute");
  }
}
