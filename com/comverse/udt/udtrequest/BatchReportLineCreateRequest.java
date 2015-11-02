/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportLineCreateRequest.java
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
 * Class used to create a BatchReportLineCreateRequest Udt Request
 *
 */

public class BatchReportLineCreateRequest extends BatchReportLineSubRequestParent {
/**
 *
 * Constructor to create a  BatchReportLineCreateRequest
 * @param id Unique request name
 * @param batchReportLineCreateIn BatchReportLineObjectData for BatchReportLineCreateRequest
 *
 */
@JsonCreator
  public BatchReportLineCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchReportLine")BatchReportLineObjectData batchReportLineCreateIn) {
    super(id, "BatchReportLineCreate");
    if (batchReportLineCreateIn != null) {
      addInput("BatchReportLine", BatchReportLineObjectHelper.toMap(batchReportLineCreateIn, new HashMap(), "BatchReportLine").get("BatchReportLine"));
    }
  }

/**
 *
 * Retrieves the BatchReportLineObjectData that results from the BatchReportLineCreateRequest call
 * @return BatchReportLineObjectData resulting from udt call
 *
 */

  public BatchReportLineObjectData getOutput() {
    return BatchReportLineObjectHelper.fromMap(outputMap, "BatchReportLine");
  }
}
