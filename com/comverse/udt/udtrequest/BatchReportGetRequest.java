/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportGetRequest.java
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
 * Class used to create a BatchReportGetRequest Udt Request
 *
 */

public class BatchReportGetRequest extends BatchReportSubRequestParent {
/**
 *
 * Constructor to create a  BatchReportGetRequest
 * @param id Unique request name
 * @param batchReportGetIn BatchReportObjectKeyData for BatchReportGetRequest
 *
 */
@JsonCreator
  public BatchReportGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchReport")BatchReportObjectKeyData batchReportGetIn) {
    super(id, "BatchReportGet");
    if (batchReportGetIn != null) {
      addInput("BatchReport", BatchReportObjectKeyHelper.toMap(batchReportGetIn, new HashMap(), "BatchReportObjectKeyData").get("BatchReportObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchReportObjectData that results from the BatchReportGetRequest call
 * @return BatchReportObjectData resulting from udt call
 *
 */

  public BatchReportObjectData getOutput() {
    return BatchReportObjectHelper.fromMap(outputMap, "BatchReport");
  }
}
