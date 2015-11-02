/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BsdBusinessUnitSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BsdBusinessUnitSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BsdBusinessUnitSequenceGetNoOpRequest extends BsdBusinessUnitSubRequestParent {
/**
 *
 * Constructor to create a   BsdBusinessUnitSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BsdBusinessUnitSequenceGetNoOpRequest(String id, BsdBusinessUnitObjectKeyData noOpIn) {
    super(id, "BsdBusinessUnitSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BsdBusinessUnit", BsdBusinessUnitObjectKeyHelper.toMap(noOpIn, new HashMap(), "BsdBusinessUnit").get("BsdBusinessUnit"));
    }
  }
/**
 *
 * Retrieves the BsdBusinessUnitObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BsdBusinessUnitObjectKeyData getOutput() {
    return BsdBusinessUnitObjectKeyHelper.fromMap(outputMap, "BsdBusinessUnit");
  }
}
