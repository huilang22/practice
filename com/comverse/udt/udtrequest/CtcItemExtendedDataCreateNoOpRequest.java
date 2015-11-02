/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemExtendedDataCreateNoOpRequest.java
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

import com.csgsystems.ctc.data.*;

/**
 *
 * NoOp class used to simulate a CtcItemExtendedDataCreateNoOpRequest Udt Request/Response
 *
 */
public class CtcItemExtendedDataCreateNoOpRequest extends CtcItemExtendedDataSubRequestParent {
/**
 *
 * Constructor to create a   CtcItemExtendedDataCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcItemExtendedDataCreateNoOpRequest(String id, CtcItemExtendedDataObjectData noOpIn) {
    super(id, "CtcItemExtendedDataCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtcItemExtendedData", CtcItemExtendedDataObjectHelper.toMap(noOpIn, new HashMap(), "CtcItemExtendedData").get("CtcItemExtendedData"));
    }
  }
/**
 *
 * Retrieves the CtcItemExtendedDataObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public CtcItemExtendedDataObjectData getOutput() {
    return CtcItemExtendedDataObjectHelper.fromMap(outputMap, "CtcItemExtendedData");
  }
}
