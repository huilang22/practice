/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeSequenceGetNoOpRequest extends BsdAttributeSubRequestParent {
/**
 *
 * Constructor to create a   BsdAttributeSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeSequenceGetNoOpRequest(String id, BsdAttributeObjectKeyData noOpIn) {
    super(id, "BsdAttributeSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdAttribute", BsdAttributeObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdAttribute").get("BsdAttribute"));
    }
  }
/**
 *
 * Retrieves the BsdAttributeObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeObjectKeyData getOutput() {
    return BsdAttributeObjectKeyHelper.fromMap(outputMap, "BsdAttribute");
  }
}
