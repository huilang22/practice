/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeDefaultUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeDefaultUpdateNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeDefaultUpdateNoOpRequest extends BsdAttributeDefaultSubRequestParent {
/**
 *
 * Constructor to create a   BsdAttributeDefaultUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeDefaultUpdateNoOpRequest(String id, BsdAttributeDefaultObjectBaseData noOpIn) {
    super(id, "BsdAttributeDefaultUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectBaseHelper.toMap(noOpIn, new HashMap(), "BsdAttributeDefault").get("BsdAttributeDefault"));
    }
  }
/**
 *
 * Retrieves the BsdAttributeDefaultObjectBaseData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeDefaultObjectBaseData getOutput() {
    return BsdAttributeDefaultObjectBaseHelper.fromMap(outputMap, "BsdAttributeDefault");
  }
}
