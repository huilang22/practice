/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeFindRequest.java
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
 * Class used to create a UsageTypeFindRequest Udt Request
 *
 */

public class UsageTypeFindRequest extends UsageTypeRequest {
/**
 *
 * Constructor to create a  UsageTypeFindRequest
 * @param id Unique request name
 * @param utFindIn UsageTypeObjectFilter for UsageTypeFindRequest
 *
 */
@JsonCreator
  public UsageTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageType")UsageTypeObjectFilter utFindIn) {
    super(id, "UsageTypeFind");
    if (utFindIn != null) {
      Integer index =  utFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageType", UsageTypeObjectHelper.toMap(utFindIn, new HashMap(), "UsageType").get("UsageType"));
    }
  }

/**
 *
 * Retrieves the UsageTypeObjectDataList that results from the UsageTypeFindRequest call
 * @return UsageTypeObjectDataList resulting from udt call
 *
 */

  public UsageTypeObjectDataList getOutput() {
    return UsageTypeObjectHelper.fromMapList(outputMap, "UsageTypeList");
  }
}
