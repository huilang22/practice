/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportFindRequest.java
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
 * Class used to create a BatchReportFindRequest Udt Request
 *
 */

public class BatchReportFindRequest extends BatchReportRequest {
/**
 *
 * Constructor to create a  BatchReportFindRequest
 * @param id Unique request name
 * @param batchReportFindIn BatchReportObjectFilter for BatchReportFindRequest
 *
 */
@JsonCreator
  public BatchReportFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchReport")BatchReportObjectFilter batchReportFindIn) {
    super(id, "BatchReportFind");
    if (batchReportFindIn != null) {
      Integer index =  batchReportFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchReport", BatchReportObjectHelper.toMap(batchReportFindIn, new HashMap(), "BatchReport").get("BatchReport"));
    }
  }

/**
 *
 * Retrieves the BatchReportObjectDataList that results from the BatchReportFindRequest call
 * @return BatchReportObjectDataList resulting from udt call
 *
 */

  public BatchReportObjectDataList getOutput() {
    return BatchReportObjectHelper.fromMapList(outputMap, "BatchReportList");
  }
}
