/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportTypeFindRequest.java
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
 * Class used to create a BatchReportTypeFindRequest Udt Request
 *
 */

public class BatchReportTypeFindRequest extends BatchReportTypeRequest {
/**
 *
 * Constructor to create a  BatchReportTypeFindRequest
 * @param id Unique request name
 * @param batchReportTypeFindIn BatchReportTypeObjectFilter for BatchReportTypeFindRequest
 *
 */
@JsonCreator
  public BatchReportTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchReportType")BatchReportTypeObjectFilter batchReportTypeFindIn) {
    super(id, "BatchReportTypeFind");
    if (batchReportTypeFindIn != null) {
      Integer index =  batchReportTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchReportType", BatchReportTypeObjectHelper.toMap(batchReportTypeFindIn, new HashMap(), "BatchReportType").get("BatchReportType"));
    }
  }

/**
 *
 * Retrieves the BatchReportTypeObjectDataList that results from the BatchReportTypeFindRequest call
 * @return BatchReportTypeObjectDataList resulting from udt call
 *
 */

  public BatchReportTypeObjectDataList getOutput() {
    return BatchReportTypeObjectHelper.fromMapList(outputMap, "BatchReportTypeList");
  }
}
