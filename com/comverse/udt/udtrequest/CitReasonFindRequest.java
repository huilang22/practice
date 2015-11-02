/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CitReasonFindRequest.java
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
 * Class used to create a CitReasonFindRequest Udt Request
 *
 */

public class CitReasonFindRequest extends CitReasonRequest {
/**
 *
 * Constructor to create a  CitReasonFindRequest
 * @param id Unique request name
 * @param citReasonFindIn CitReasonObjectFilter for CitReasonFindRequest
 *
 */
@JsonCreator
  public CitReasonFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("CitReason")CitReasonObjectFilter citReasonFindIn) {
    super(id, "CitReasonFind");
    if (citReasonFindIn != null) {
      Integer index =  citReasonFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("CitReason", CitReasonObjectHelper.toMap(citReasonFindIn, new HashMap(), "CitReason").get("CitReason"));
    }
  }

/**
 *
 * Retrieves the CitReasonObjectDataList that results from the CitReasonFindRequest call
 * @return CitReasonObjectDataList resulting from udt call
 *
 */

  public CitReasonObjectDataList getOutput() {
    return CitReasonObjectHelper.fromMapList(outputMap, "CitReasonList");
  }
}
