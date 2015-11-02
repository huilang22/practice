/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageByServiceFindRequest.java
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
 * Class used to create a UnbilledUsageByServiceFindRequest Udt Request
 *
 */

public class UnbilledUsageByServiceFindRequest extends UnbilledUsageRequest {
/**
 *
 * Constructor to create a  UnbilledUsageByServiceFindRequest
 * @param id Unique request name
 * @param UnbilledUsageServicefindIn UnbilledUsageServiceObjectFilter for UnbilledUsageByServiceFindRequest
 *
 */
@JsonCreator
  public UnbilledUsageByServiceFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnbilledUsage")UnbilledUsageServiceObjectFilter UnbilledUsageServicefindIn) {
    super(id, "UnbilledUsageByServiceFind");
    if (UnbilledUsageServicefindIn != null) {
      Integer index =  UnbilledUsageServicefindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageServiceObjectHelper.toMap(UnbilledUsageServicefindIn, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }

/**
 *
 * Retrieves the UnbilledUsageObjectDataList that results from the UnbilledUsageByServiceFindRequest call
 * @return UnbilledUsageObjectDataList resulting from udt call
 *
 */

  public UnbilledUsageObjectDataList getOutput() {
    return UnbilledUsageObjectHelper.fromMapList(outputMap, "UnbilledUsageList");
  }
}
