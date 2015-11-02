/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportCreateRequest.java
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
 * Class used to create a BatchReportCreateRequest Udt Request
 *
 */

public class BatchReportCreateRequest extends BatchReportSubRequestParent {
/**
 *
 * Constructor to create a  BatchReportCreateRequest
 * @param id Unique request name
 * @param batchReportCreateIn BatchReportObjectData for BatchReportCreateRequest
 *
 */
@JsonCreator
  public BatchReportCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchReport")BatchReportObjectData batchReportCreateIn) {
    super(id, "BatchReportCreate");
    if (batchReportCreateIn != null) {
      addInput("BatchReport", BatchReportObjectHelper.toMap(batchReportCreateIn, new HashMap(), "BatchReport").get("BatchReport"));
    }
  }

/**
 *
 * Retrieves the BatchReportObjectData that results from the BatchReportCreateRequest call
 * @return BatchReportObjectData resulting from udt call
 *
 */

  public BatchReportObjectData getOutput() {
    return BatchReportObjectHelper.fromMap(outputMap, "BatchReport");
  }
}
