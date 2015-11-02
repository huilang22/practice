/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportDeleteRequest.java
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
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a BatchReportDeleteRequest Udt Request
 *
 */

public class BatchReportDeleteRequest extends BatchReportSubRequestParent {
/**
 *
 * Constructor to create a  BatchReportDeleteRequest
 * @param id Unique request name
 * @param batchReportDeleteIn BatchReportObjectKeyData for BatchReportDeleteRequest
 *
 */
@JsonCreator
  public BatchReportDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchReport")BatchReportObjectKeyData batchReportDeleteIn) {
    super(id, "BatchReportDelete");
    if (batchReportDeleteIn != null) {
      addInput("BatchReport", BatchReportObjectKeyHelper.toMap(batchReportDeleteIn, new HashMap(), "BatchReportObjectKeyData").get("BatchReportObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchReportObjectData that results from the BatchReportDeleteRequest call
 * @return BatchReportObjectData resulting from udt call
 *
 */

  public BatchReportObjectData getOutput() {
    return BatchReportObjectHelper.fromMap(outputMap, "BatchReport");
  }
}
