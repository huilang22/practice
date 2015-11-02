/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportLineGetRequest.java
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
 * Class used to create a BatchReportLineGetRequest Udt Request
 *
 */

public class BatchReportLineGetRequest extends BatchReportLineSubRequestParent {
/**
 *
 * Constructor to create a  BatchReportLineGetRequest
 * @param id Unique request name
 * @param batchReportLineGetIn BatchReportLineObjectKeyData for BatchReportLineGetRequest
 *
 */
@JsonCreator
  public BatchReportLineGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchReportLine")BatchReportLineObjectKeyData batchReportLineGetIn) {
    super(id, "BatchReportLineGet");
    if (batchReportLineGetIn != null) {
      addInput("BatchReportLine", BatchReportLineObjectKeyHelper.toMap(batchReportLineGetIn, new HashMap(), "BatchReportLineObjectKeyData").get("BatchReportLineObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchReportLineObjectData that results from the BatchReportLineGetRequest call
 * @return BatchReportLineObjectData resulting from udt call
 *
 */

  public BatchReportLineObjectData getOutput() {
    return BatchReportLineObjectHelper.fromMap(outputMap, "BatchReportLine");
  }
}
