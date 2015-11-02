/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UnbilledUsageByAccountFindRequest.java
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
 * Class used to create a UnbilledUsageByAccountFindRequest Udt Request
 *
 */

public class UnbilledUsageByAccountFindRequest extends UnbilledUsageRequest {
/**
 *
 * Constructor to create a  UnbilledUsageByAccountFindRequest
 * @param id Unique request name
 * @param UnbilledUsageAcctfindIn UnbilledUsageAccountObjectFilter for UnbilledUsageByAccountFindRequest
 *
 */
@JsonCreator
  public UnbilledUsageByAccountFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UnbilledUsage")UnbilledUsageAccountObjectFilter UnbilledUsageAcctfindIn) {
    super(id, "UnbilledUsageByAccountFind");
    if (UnbilledUsageAcctfindIn != null) {
      Integer index =  UnbilledUsageAcctfindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UnbilledUsage", UnbilledUsageAccountObjectHelper.toMap(UnbilledUsageAcctfindIn, new HashMap(), "UnbilledUsage").get("UnbilledUsage"));
    }
  }

/**
 *
 * Retrieves the UnbilledUsageObjectDataList that results from the UnbilledUsageByAccountFindRequest call
 * @return UnbilledUsageObjectDataList resulting from udt call
 *
 */

  public UnbilledUsageObjectDataList getOutput() {
    return UnbilledUsageObjectHelper.fromMapList(outputMap, "UnbilledUsageList");
  }
}
