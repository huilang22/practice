/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportLineUpdateNoOpRequest.java
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
 * NoOp class used to simulate a BatchReportLineUpdateNoOpRequest Udt Request/Response
 *
 */
public class BatchReportLineUpdateNoOpRequest extends BatchReportLineSubRequestParent {
/**
 *
 * Constructor to create a   BatchReportLineUpdateNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchReportLineUpdateNoOpRequest(String id, BatchReportLineObjectData noOpIn) {
    super(id, "BatchReportLineUpdateNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchReportLine", BatchReportLineObjectHelper.toMap(noOpIn, new HashMap(), "BatchReportLine").get("BatchReportLine"));
    }
  }
/**
 *
 * Retrieves the BatchReportLineObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchReportLineObjectData getOutput() {
    return BatchReportLineObjectHelper.fromMap(outputMap, "BatchReportLine");
  }
}
