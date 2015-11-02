/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSimCardConfigFindRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsSimCardConfigFindRequest Udt Request
 *
 */

public class InvsSimCardConfigFindRequest extends InvsSimCardConfigRequest {
/**
 *
 * Constructor to create a  InvsSimCardConfigFindRequest
 * @param id Unique request name
 * @param InvsSimCardConfigFindIn InvsSimCardConfigObjectFilter for InvsSimCardConfigFindRequest
 *
 */
@JsonCreator
  public InvsSimCardConfigFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSimCardConfig")InvsSimCardConfigObjectFilter InvsSimCardConfigFindIn) {
    super(id, "InvsSimCardConfigFind");
    if (InvsSimCardConfigFindIn != null) {
      Integer index =  InvsSimCardConfigFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSimCardConfig", InvsSimCardConfigObjectHelper.toMap(InvsSimCardConfigFindIn, new HashMap(), "InvsSimCardConfig").get("InvsSimCardConfig"));
    }
  }

/**
 *
 * Retrieves the InvsSimCardConfigObjectDataList that results from the InvsSimCardConfigFindRequest call
 * @return InvsSimCardConfigObjectDataList resulting from udt call
 *
 */

  public InvsSimCardConfigObjectDataList getOutput() {
    return InvsSimCardConfigObjectHelper.fromMapList(outputMap, "InvsSimCardConfigList");
  }
}
