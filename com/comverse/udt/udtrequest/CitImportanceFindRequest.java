/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitImportanceFindRequest.java
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
 * Class used to create a CitImportanceFindRequest Udt Request
 *
 */

public class CitImportanceFindRequest extends CitImportanceRequest {
/**
 *
 * Constructor to create a  CitImportanceFindRequest
 * @param id Unique request name
 * @param citImportanceFindIn CitImportanceObjectFilter for CitImportanceFindRequest
 *
 */
@JsonCreator
  public CitImportanceFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitImportance")CitImportanceObjectFilter citImportanceFindIn) {
    super(id, "CitImportanceFind");
    if (citImportanceFindIn != null) {
      Integer index =  citImportanceFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitImportance", CitImportanceObjectHelper.toMap(citImportanceFindIn, new HashMap(), "CitImportance").get("CitImportance"));
    }
  }

/**
 *
 * Retrieves the CitImportanceObjectDataList that results from the CitImportanceFindRequest call
 * @return CitImportanceObjectDataList resulting from udt call
 *
 */

  public CitImportanceObjectDataList getOutput() {
    return CitImportanceObjectHelper.fromMapList(outputMap, "CitImportanceList");
  }
}
