/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportUpdateRequest.java
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
 * Class used to create a BatchReportUpdateRequest Udt Request
 *
 */

public class BatchReportUpdateRequest extends BatchReportSubRequestParent {
/**
 *
 * Constructor to create a  BatchReportUpdateRequest
 * @param id Unique request name
 * @param batchReportUpdateIn BatchReportObjectData for BatchReportUpdateRequest
 *
 */
@JsonCreator
  public BatchReportUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchReport")BatchReportObjectData batchReportUpdateIn) {
    super(id, "BatchReportUpdate");
    if (batchReportUpdateIn != null) {
      addInput("BatchReport", BatchReportObjectHelper.toMap(batchReportUpdateIn, new HashMap(), "BatchReport").get("BatchReport"));
    }
  }

/**
 *
 * Retrieves the BatchReportObjectData that results from the BatchReportUpdateRequest call
 * @return BatchReportObjectData resulting from udt call
 *
 */

  public BatchReportObjectData getOutput() {
    return BatchReportObjectHelper.fromMap(outputMap, "BatchReport");
  }
}
