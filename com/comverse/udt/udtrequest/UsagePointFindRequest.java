/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsagePointFindRequest.java
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

import com.csgsystems.cf.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a UsagePointFindRequest Udt Request
 *
 */

public class UsagePointFindRequest extends UsagePointRequest {
/**
 *
 * Constructor to create a  UsagePointFindRequest
 * @param id Unique request name
 * @param UsgPntFindIn UsgPntObjectFilter for UsagePointFindRequest
 *
 */
@JsonCreator
  public UsagePointFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsagePoint")UsgPntObjectFilter UsgPntFindIn) {
    super(id, "UsagePointFind");
    if (UsgPntFindIn != null) {
      Integer index =  UsgPntFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsagePoint", UsgPntObjectHelper.toMap(UsgPntFindIn, new HashMap(), "UsagePoint").get("UsagePoint"));
    }
  }

/**
 *
 * Retrieves the UsgPntObjectDataList that results from the UsagePointFindRequest call
 * @return UsgPntObjectDataList resulting from udt call
 *
 */

  public UsgPntObjectDataList getOutput() {
    return UsgPntObjectHelper.fromMapList(outputMap, "UsagePointList");
  }
}
