/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * ExtendedDataEnumerationCreateNoOpRequest.java
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
 * NoOp class used to simulate a ExtendedDataEnumerationCreateNoOpRequest Udt Request/Response
 *
 */
public class ExtendedDataEnumerationCreateNoOpRequest extends ExtendedDataEnumerationSubRequestParent {
/**
 *
 * Constructor to create a   ExtendedDataEnumerationCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public ExtendedDataEnumerationCreateNoOpRequest(String id, EDObjectData noOpIn) {
    super(id, "ExtendedDataEnumerationCreateNoOpRequest");
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
