/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportTypeGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchReportTypeGetNoOpRequest Udt Request/Response
 *
 */
public class BatchReportTypeGetNoOpRequest extends BatchReportTypeSubRequestParent {
/**
 *
 * Constructor to create a   BatchReportTypeGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchReportTypeGetNoOpRequest(String id, BatchReportTypeObjectData noOpIn) {
    super(id, "BatchReportTypeGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchReportType", BatchReportTypeObjectHelper.toMap(noOpIn, new HashMap(), "BatchReportType").get("BatchReportType"));
    }
  }
/**
 *
 * Retrieves the BatchReportTypeObjectData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchReportTypeObjectData getOutput() {
    return BatchReportTypeObjectHelper.fromMap(outputMap, "BatchReportType");
  }
}
