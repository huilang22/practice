/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmEnumerationUpdateNoOpRequest.java
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
 * NoOp class used to simulate a CtmEnumerationUpdateNoOpRequest Udt Request/Response
 *
 */
public class CtmEnumerationUpdateNoOpRequest extends CtmEnumerationSubRequestParent {
/**
 *
 * Constructor to create a   CtmEnumerationUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtmEnumerationUpdateNoOpRequest(String id, CtmEnumerationObjectData noOpIn) {
    super(id, "CtmEnumerationUpdateNoOpRequest");
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
