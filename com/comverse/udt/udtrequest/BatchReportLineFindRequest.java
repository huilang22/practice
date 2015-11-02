/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchReportLineFindRequest.java
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
 * Class used to create a BatchReportLineFindRequest Udt Request
 *
 */

public class BatchReportLineFindRequest extends BatchReportLineRequest {
/**
 *
 * Constructor to create a  BatchReportLineFindRequest
 * @param id Unique request name
 * @param batchReportLineFindIn BatchReportLineObjectFilter for BatchReportLineFindRequest
 *
 */
@JsonCreator
  public BatchReportLineFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchReportLine")BatchReportLineObjectFilter batchReportLineFindIn) {
    super(id, "BatchReportLineFind");
    if (batchReportLineFindIn != null) {
      Integer index =  batchReportLineFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchReportLine", BatchReportLineObjectHelper.toMap(batchReportLineFindIn, new HashMap(), "BatchReportLine").get("BatchReportLine"));
    }
  }

/**
 *
 * Retrieves the BatchReportLineObjectDataList that results from the BatchReportLineFindRequest call
 * @return BatchReportLineObjectDataList resulting from udt call
 *
 */

  public BatchReportLineObjectDataList getOutput() {
    return BatchReportLineObjectHelper.fromMapList(outputMap, "BatchReportLineList");
  }
}
