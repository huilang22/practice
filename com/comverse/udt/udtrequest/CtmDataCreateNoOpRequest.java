/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CtmDataCreateNoOpRequest.java
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
 * NoOp class used to simulate a CtmDataCreateNoOpRequest Udt Request/Response
 *
 */
public class CtmDataCreateNoOpRequest extends CtmDataSubRequestParent {
/**
 *
 * Constructor to create a   CtmDataCreateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public CtmDataCreateNoOpRequest(String id, CtmDataRowData noOpIn) {
    super(id, "CtmDataCreateNoOpRequest");
    if (noOpIn != null) {
      addInput("CtmData", CtmDataRowHelper.toMap(noOpIn, new HashMap(), "CtmData").get("CtmData"));
    }
  }
/**
 *
 * Retrieves the CtmDataRowData passed into the constructor
 * @return Simulated response
 *
 */
  public CtmDataRowData getOutput() {
    return CtmDataRowHelper.fromMap(outputMap, "CtmData");
  }
}
