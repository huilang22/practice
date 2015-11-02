/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataEnumerationUpdateNoOpRequest.java
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

import com.csgsystems.bp.data.*;

/**
 *
 * NoOp class used to simulate a ExtendedDataEnumerationUpdateNoOpRequest Udt Request/Response
 *
 */
public class ExtendedDataEnumerationUpdateNoOpRequest extends ExtendedDataEnumerationSubRequestParent {
/**
 *
 * Constructor to create a   ExtendedDataEnumerationUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExtendedDataEnumerationUpdateNoOpRequest(String id, EDObjectData noOpIn) {
    super(id, "ExtendedDataEnumerationUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("ExtendedDataEnumeration", EDObjectHelper.toMap(noOpIn, new HashMap(), "ExtendedDataEnumeration").get("ExtendedDataEnumeration"));
    }
  }
/**
 *
 * Retrieves the EDObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public EDObjectData getOutput() {
    return EDObjectHelper.fromMap(outputMap, "ExtendedDataEnumeration");
  }
}
