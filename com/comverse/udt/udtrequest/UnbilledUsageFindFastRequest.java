/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageFindFastRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a UnbilledUsageFindFastRequest Udt Request
 *
 */

public class UnbilledUsageFindFastRequest extends UnbilledUsageRequest {
/**
 *
 * Constructor to create a  UnbilledUsageFindFastRequest
 * @param id Unique request name
 * @param UnbilledUsageffindIn UnbilledUsageObjectFilter for UnbilledUsageFindFastRequest
 *
 */
@JsonCreator
  public UnbilledUsageFindFastRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnbilledUsage")UnbilledUsageObjectFilter UnbilledUsageffindIn) {
    super(id, "UnbilledUsageFindFast");
    if (UnbilledUsageffindIn != null) {
      Integer index =  UnbilledUsageffindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(UnbilledUsageffindIn, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }

/**
 *
 * Retrieves the UnbilledUsageObjectDataList that results from the UnbilledUsageFindFastRequest call
 * @return UnbilledUsageObjectDataList resulting from udt call
 *
 */

  public UnbilledUsageObjectDataList getOutput() {
    return UnbilledUsageObjectHelper.fromMapList(outputMap, "UnbilledUsageList");
  }
}
