/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * MultiLinesAdjFindCountNoOpRequest.java
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
 * NoOp class used to simulate a MultiLinesAdjFindCountNoOpRequest Udt Request/Response
 *
 */
public class MultiLinesAdjFindCountNoOpRequest extends MultiLinesAdjRequest {
/**
 *
 * Constructor to create a   MultiLinesAdjFindCountNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public MultiLinesAdjFindCountNoOpRequest(String id, Integer noOpIn) {
    super(id, "MultiLinesAdjFindCountNoOpRequest");
    if (noOpIn != null) {
      addInput("MLABillCountOut", noOpIn);
    }
  }
/**
 *
 * Retrieves the Integer passed into the constructor
 * @return Simulated response
 *
 */
  public Integer getOutput() {
    return  (Integer)outputMap.get("MLABillCountOut");
  }
}
