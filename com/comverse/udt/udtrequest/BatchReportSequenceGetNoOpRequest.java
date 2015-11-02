/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportSequenceGetNoOpRequest.java
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
 * NoOp class used to simulate a BatchReportSequenceGetNoOpRequest Udt Request/Response
 *
 */
public class BatchReportSequenceGetNoOpRequest extends BatchReportSubRequestParent {
/**
 *
 * Constructor to create a   BatchReportSequenceGetNoOpRequest
 * @param id Unique request name
 * @param noOpIn Simulated response object
 *
 */
  public BatchReportSequenceGetNoOpRequest(String id, BatchReportObjectKeyData noOpIn) {
    super(id, "BatchReportSequenceGetNoOpRequest");
    if (noOpIn != null) {
      addInput("BatchReport", BatchReportObjectKeyHelper.toMap(noOpIn, new HashMap(), "BatchReport").get("BatchReport"));
    }
  }
/**
 *
 * Retrieves the BatchReportObjectKeyData passed into the constructor
 * @return Simulated response
 *
 */
  public BatchReportObjectKeyData getOutput() {
    return BatchReportObjectKeyHelper.fromMap(outputMap, "BatchReport");
  }
}
