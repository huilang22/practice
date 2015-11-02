/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdRelationalDefaultSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdRelationalDefaultSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BsdRelationalDefaultSequenceGetNoOpRequest extends BsdRelationalDefaultSubRequestParent {
/**
 *
 * Constructor to create a   BsdRelationalDefaultSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdRelationalDefaultSequenceGetNoOpRequest(String id, BsdRelationalDefaultObjectBaseKeyData noOpIn) {
    super(id, "BsdRelationalDefaultSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdRelationalDefault", BsdRelationalDefaultObjectBaseKeyHelper.toMap(noOpIn, new HashMap(), "BsdRelationalDefault").get("BsdRelationalDefault"));
    }
  }
/**
 *
 * Retrieves the BsdRelationalDefaultObjectBaseKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdRelationalDefaultObjectBaseKeyData getOutput() {
    return BsdRelationalDefaultObjectBaseKeyHelper.fromMap(outputMap, "BsdRelationalDefault");
  }
}
