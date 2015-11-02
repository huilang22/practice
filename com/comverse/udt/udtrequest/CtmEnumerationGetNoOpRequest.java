/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmEnumerationGetNoOpRequest.java
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
 * NoOp class used to simulate a CtmEnumerationGetNoOpRequest Udt Request/Response
 *
 */
public class CtmEnumerationGetNoOpRequest extends CtmEnumerationSubRequestParent {
/**
 *
 * Constructor to create a   CtmEnumerationGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtmEnumerationGetNoOpRequest(String id, CtmEnumerationObjectData noOpIn) {
    super(id, "CtmEnumerationGetNoOpRequest");
    if (noOpIn != null) {
      addInput("CtmEnumeration", CtmEnumerationObjectHelper.toMap(noOpIn, new HashMap(), "CtmEnumeration").get("CtmEnumeration"));
    }
  }
/**
 *
 * Retrieves the CtmEnumerationObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtmEnumerationObjectData getOutput() {
    return CtmEnumerationObjectHelper.fromMap(outputMap, "CtmEnumeration");
  }
}
