/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportLineDeleteRequest.java
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
 * Class used to create a BatchReportLineDeleteRequest Udt Request
 *
 */

public class BatchReportLineDeleteRequest extends BatchReportLineSubRequestParent {
/**
 *
 * Constructor to create a  BatchReportLineDeleteRequest
 * @param id Unique request name
 * @param batchReportLineDeleteIn BatchReportLineObjectKeyData for BatchReportLineDeleteRequest
 *
 */
@JsonCreator
  public BatchReportLineDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchReportLine")BatchReportLineObjectKeyData batchReportLineDeleteIn) {
    super(id, "BatchReportLineDelete");
    if (batchReportLineDeleteIn != null) {
      addInput("BatchReportLine", BatchReportLineObjectKeyHelper.toMap(batchReportLineDeleteIn, new HashMap(), "BatchReportLineObjectKeyData").get("BatchReportLineObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchReportLineObjectData that results from the BatchReportLineDeleteRequest call
 * @return BatchReportLineObjectData resulting from udt call
 *
 */

  public BatchReportLineObjectData getOutput() {
    return BatchReportLineObjectHelper.fromMap(outputMap, "BatchReportLine");
  }
}
