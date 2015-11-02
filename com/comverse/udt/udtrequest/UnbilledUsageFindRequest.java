/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageFindRequest.java
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
 * Class used to create a UnbilledUsageFindRequest Udt Request
 *
 */

public class UnbilledUsageFindRequest extends UnbilledUsageRequest {
/**
 *
 * Constructor to create a  UnbilledUsageFindRequest
 * @param id Unique request name
 * @param UnbilledUsagefindIn UnbilledUsageObjectFilter for UnbilledUsageFindRequest
 *
 */
@JsonCreator
  public UnbilledUsageFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnbilledUsage")UnbilledUsageObjectFilter UnbilledUsagefindIn) {
    super(id, "UnbilledUsageFind");
    if (UnbilledUsagefindIn != null) {
      Integer index =  UnbilledUsagefindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageObjectHelper.toMap(UnbilledUsagefindIn, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }

/**
 *
 * Retrieves the UnbilledUsageObjectDataList that results from the UnbilledUsageFindRequest call
 * @return UnbilledUsageObjectDataList resulting from udt call
 *
 */

  public UnbilledUsageObjectDataList getOutput() {
    return UnbilledUsageObjectHelper.fromMapList(outputMap, "UnbilledUsageList");
  }
}
