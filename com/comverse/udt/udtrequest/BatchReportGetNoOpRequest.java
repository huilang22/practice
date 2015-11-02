/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportGetNoOpRequest.java
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

import com.csgsystems.bat.data.*;

/**
 *
 * NoOp class used to simulate a BatchReportGetNoOpRequest Udt Request/Response
 *
 */
public class BatchReportGetNoOpRequest extends BatchReportSubRequestParent {
/**
 *
 * Constructor to create a   BatchReportGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchReportGetNoOpRequest(String id, BatchReportObjectData noOpIn) {
    super(id, "BatchReportGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchReport", BatchReportObjectHelper.toMap(noOpIn, new HashMap(), "BatchReport").get("BatchReport"));
    }
  }
/**
 *
 * Retrieves the BatchReportObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchReportObjectData getOutput() {
    return BatchReportObjectHelper.fromMap(outputMap, "BatchReport");
  }
}
