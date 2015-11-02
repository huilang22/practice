/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtcItemExtendedDataDeleteNoOpRequest.java
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
 * NoOp class used to simulate a CtcItemExtendedDataDeleteNoOpRequest Udt Request/Response
 *
 */
public class CtcItemExtendedDataDeleteNoOpRequest extends CtcItemExtendedDataSubRequestParent {
/**
 *
 * Constructor to create a   CtcItemExtendedDataDeleteNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtcItemExtendedDataDeleteNoOpRequest(String id, CtcItemExtendedDataObjectData noOpIn) {
    super(id, "CtcItemExtendedDataDeleteNoOpRequest");
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
