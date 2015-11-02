/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportLineUpdateRequest.java
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
 * Class used to create a BatchReportLineUpdateRequest Udt Request
 *
 */

public class BatchReportLineUpdateRequest extends BatchReportLineSubRequestParent {
/**
 *
 * Constructor to create a  BatchReportLineUpdateRequest
 * @param id Unique request name
 * @param batchReportLineUpdateIn BatchReportLineObjectData for BatchReportLineUpdateRequest
 *
 */
@JsonCreator
  public BatchReportLineUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchReportLine")BatchReportLineObjectData batchReportLineUpdateIn) {
    super(id, "BatchReportLineUpdate");
    if (batchReportLineUpdateIn != null) {
      addInput("BatchReportLine", BatchReportLineObjectHelper.toMap(batchReportLineUpdateIn, new HashMap(), "BatchReportLine").get("BatchReportLine"));
    }
  }

/**
 *
 * Retrieves the BatchReportLineObjectData that results from the BatchReportLineUpdateRequest call
 * @return BatchReportLineObjectData resulting from udt call
 *
 */

  public BatchReportLineObjectData getOutput() {
    return BatchReportLineObjectHelper.fromMap(outputMap, "BatchReportLine");
  }
}
