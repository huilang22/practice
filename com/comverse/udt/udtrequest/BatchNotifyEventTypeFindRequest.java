/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyEventTypeFindRequest.java
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
 * Class used to create a BatchNotifyEventTypeFindRequest Udt Request
 *
 */

public class BatchNotifyEventTypeFindRequest extends BatchNotifyEventTypeRequest {
/**
 *
 * Constructor to create a  BatchNotifyEventTypeFindRequest
 * @param id Unique request name
 * @param batchNotifyEventTypeFindIn BatchNotifyEventTypeObjectFilter for BatchNotifyEventTypeFindRequest
 *
 */
@JsonCreator
  public BatchNotifyEventTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchNotifyEventType")BatchNotifyEventTypeObjectFilter batchNotifyEventTypeFindIn) {
    super(id, "BatchNotifyEventTypeFind");
    if (batchNotifyEventTypeFindIn != null) {
      Integer index =  batchNotifyEventTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchNotifyEventType", BatchNotifyEventTypeObjectHelper.toMap(batchNotifyEventTypeFindIn, new HashMap(), "BatchNotifyEventType").get("BatchNotifyEventType"));
    }
  }

/**
 *
 * Retrieves the BatchNotifyEventTypeObjectDataList that results from the BatchNotifyEventTypeFindRequest call
 * @return BatchNotifyEventTypeObjectDataList resulting from udt call
 *
 */

  public BatchNotifyEventTypeObjectDataList getOutput() {
    return BatchNotifyEventTypeObjectHelper.fromMapList(outputMap, "BatchNotifyEventTypeList");
  }
}
