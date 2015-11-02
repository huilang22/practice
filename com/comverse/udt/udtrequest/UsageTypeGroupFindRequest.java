/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeGroupFindRequest.java
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
 * Class used to create a UsageTypeGroupFindRequest Udt Request
 *
 */

public class UsageTypeGroupFindRequest extends UsageTypeGroupRequest {
/**
 *
 * Constructor to create a  UsageTypeGroupFindRequest
 * @param id Unique request name
 * @param UTGFndIn UsageTypeGroupObjectFilter for UsageTypeGroupFindRequest
 *
 */
@JsonCreator
  public UsageTypeGroupFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageTypeGroup")UsageTypeGroupObjectFilter UTGFndIn) {
    super(id, "UsageTypeGroupFind");
    if (UTGFndIn != null) {
      Integer index =  UTGFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageTypeGroup", UsageTypeGroupObjectHelper.toMap(UTGFndIn, new HashMap(), "UsageTypeGroup").get("UsageTypeGroup"));
    }
  }

/**
 *
 * Retrieves the UsageTypeGroupObjectDataList that results from the UsageTypeGroupFindRequest call
 * @return UsageTypeGroupObjectDataList resulting from udt call
 *
 */

  public UsageTypeGroupObjectDataList getOutput() {
    return UsageTypeGroupObjectHelper.fromMapList(outputMap, "UsageTypeGroupList");
  }
}
