/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdObjectAttributeCreateNoOpRequest.java
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
 * NoOp class used to simulate a BsdObjectAttributeCreateNoOpRequest Udt Request/Response
 *
 */
public class BsdObjectAttributeCreateNoOpRequest extends BsdObjectAttributeSubRequestParent {
/**
 *
 * Constructor to create a   BsdObjectAttributeCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdObjectAttributeCreateNoOpRequest(String id, BsdObjectAttributeObjectBaseData noOpIn) {
    super(id, "BsdObjectAttributeCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdObjectAttribute", BsdObjectAttributeObjectBaseHelper.toMap(noOpIn, new HashMap(), "BsdObjectAttribute").get("BsdObjectAttribute"));
    }
  }
/**
 *
 * Retrieves the BsdObjectAttributeObjectBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdObjectAttributeObjectBaseData getOutput() {
    return BsdObjectAttributeObjectBaseHelper.fromMap(outputMap, "BsdObjectAttribute");
  }
}
