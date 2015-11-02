/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BatchNotifyTypeFindRequest.java
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
 * Class used to create a BatchNotifyTypeFindRequest Udt Request
 *
 */

public class BatchNotifyTypeFindRequest extends BatchNotifyTypeRequest {
/**
 *
 * Constructor to create a  BatchNotifyTypeFindRequest
 * @param id Unique request name
 * @param batchNotifyTypeFindIn BatchNotifyTypeObjectFilter for BatchNotifyTypeFindRequest
 *
 */
@JsonCreator
  public BatchNotifyTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BatchNotifyType")BatchNotifyTypeObjectFilter batchNotifyTypeFindIn) {
    super(id, "BatchNotifyTypeFind");
    if (batchNotifyTypeFindIn != null) {
      Integer index =  batchNotifyTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BatchNotifyType", BatchNotifyTypeObjectHelper.toMap(batchNotifyTypeFindIn, new HashMap(), "BatchNotifyType").get("BatchNotifyType"));
    }
  }

/**
 *
 * Retrieves the BatchNotifyTypeObjectDataList that results from the BatchNotifyTypeFindRequest call
 * @return BatchNotifyTypeObjectDataList resulting from udt call
 *
 */

  public BatchNotifyTypeObjectDataList getOutput() {
    return BatchNotifyTypeObjectHelper.fromMapList(outputMap, "BatchNotifyTypeList");
  }
}
