/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ProviderClassCreateNoOpRequest.java
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

import com.csgsystems.cf.data.*;

/**
 *
 * NoOp class used to simulate a ProviderClassCreateNoOpRequest Udt Request/Response
 *
 */
public class ProviderClassCreateNoOpRequest extends ProviderClassSubRequestParent {
/**
 *
 * Constructor to create a   ProviderClassCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ProviderClassCreateNoOpRequest(String id, ProvClsObjectData noOpIn) {
    super(id, "ProviderClassCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("ProviderClass", ProvClsObjectHelper.toMap(noOpIn, new HashMap(), "ProviderClass").get("ProviderClass"));
    }
  }
/**
 *
 * Retrieves the ProvClsObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public ProvClsObjectData getOutput() {
    return ProvClsObjectHelper.fromMap(outputMap, "ProviderClass");
  }
}
