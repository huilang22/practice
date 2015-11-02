/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitTaskTypeFindRequest.java
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

import com.csgsystems.cit.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a CitTaskTypeFindRequest Udt Request
 *
 */

public class CitTaskTypeFindRequest extends CitTaskTypeRequest {
/**
 *
 * Constructor to create a  CitTaskTypeFindRequest
 * @param id Unique request name
 * @param citTaskTypeFindIn CitTaskTypeObjectFilter for CitTaskTypeFindRequest
 *
 */
@JsonCreator
  public CitTaskTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitTaskType")CitTaskTypeObjectFilter citTaskTypeFindIn) {
    super(id, "CitTaskTypeFind");
    if (citTaskTypeFindIn != null) {
      Integer index =  citTaskTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitTaskType", CitTaskTypeObjectHelper.toMap(citTaskTypeFindIn, new HashMap(), "CitTaskType").get("CitTaskType"));
    }
  }

/**
 *
 * Retrieves the CitTaskTypeObjectDataList that results from the CitTaskTypeFindRequest call
 * @return CitTaskTypeObjectDataList resulting from udt call
 *
 */

  public CitTaskTypeObjectDataList getOutput() {
    return CitTaskTypeObjectHelper.fromMapList(outputMap, "CitTaskTypeList");
  }
}
