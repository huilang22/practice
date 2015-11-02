/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdAttributeDefaultSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdAttributeDefaultSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BsdAttributeDefaultSequenceGetNoOpRequest extends BsdAttributeDefaultSubRequestParent {
/**
 *
 * Constructor to create a   BsdAttributeDefaultSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdAttributeDefaultSequenceGetNoOpRequest(String id, BsdAttributeDefaultObjectBaseKeyData noOpIn) {
    super(id, "BsdAttributeDefaultSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdAttributeDefault", BsdAttributeDefaultObjectBaseKeyHelper.toMap(noOpIn, new HashMap(), "BsdAttributeDefault").get("BsdAttributeDefault"));
    }
  }
/**
 *
 * Retrieves the BsdAttributeDefaultObjectBaseKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdAttributeDefaultObjectBaseKeyData getOutput() {
    return BsdAttributeDefaultObjectBaseKeyHelper.fromMap(outputMap, "BsdAttributeDefault");
  }
}
