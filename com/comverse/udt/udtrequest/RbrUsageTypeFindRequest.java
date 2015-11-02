/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RbrUsageTypeFindRequest.java
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
 * Class used to create a RbrUsageTypeFindRequest Udt Request
 *
 */

public class RbrUsageTypeFindRequest extends RbrUsageTypeRequest {
/**
 *
 * Constructor to create a  RbrUsageTypeFindRequest
 * @param id Unique request name
 * @param RbrUsgTypeFndIn RbrUsageTypeObjectFilter for RbrUsageTypeFindRequest
 *
 */
@JsonCreator
  public RbrUsageTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("RbrUsageType")RbrUsageTypeObjectFilter RbrUsgTypeFndIn) {
    super(id, "RbrUsageTypeFind");
    if (RbrUsgTypeFndIn != null) {
      Integer index =  RbrUsgTypeFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("RbrUsageType", RbrUsageTypeObjectHelper.toMap(RbrUsgTypeFndIn, new HashMap(), "RbrUsageType").get("RbrUsageType"));
    }
  }

/**
 *
 * Retrieves the RbrUsageTypeObjectDataList that results from the RbrUsageTypeFindRequest call
 * @return RbrUsageTypeObjectDataList resulting from udt call
 *
 */

  public RbrUsageTypeObjectDataList getOutput() {
    return RbrUsageTypeObjectHelper.fromMapList(outputMap, "RbrUsageTypeList");
  }
}
