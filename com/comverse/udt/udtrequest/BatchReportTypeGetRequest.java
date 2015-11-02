/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportTypeGetRequest.java
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
 * Class used to create a BatchReportTypeGetRequest Udt Request
 *
 */

public class BatchReportTypeGetRequest extends BatchReportTypeSubRequestParent {
/**
 *
 * Constructor to create a  BatchReportTypeGetRequest
 * @param id Unique request name
 * @param batchReportTypeGetIn BatchReportTypeObjectKeyData for BatchReportTypeGetRequest
 *
 */
@JsonCreator
  public BatchReportTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchReportType")BatchReportTypeObjectKeyData batchReportTypeGetIn) {
    super(id, "BatchReportTypeGet");
    if (batchReportTypeGetIn != null) {
      addInput("BatchReportType", BatchReportTypeObjectKeyHelper.toMap(batchReportTypeGetIn, new HashMap(), "BatchReportTypeObjectKeyData").get("BatchReportTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BatchReportTypeObjectData that results from the BatchReportTypeGetRequest call
 * @return BatchReportTypeObjectData resulting from udt call
 *
 */

  public BatchReportTypeObjectData getOutput() {
    return BatchReportTypeObjectHelper.fromMap(outputMap, "BatchReportType");
  }
}
