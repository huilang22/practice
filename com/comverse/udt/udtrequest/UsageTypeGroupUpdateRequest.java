/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageTypeGroupUpdateRequest.java
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
 * Class used to create a UsageTypeGroupUpdateRequest Udt Request
 *
 */

public class UsageTypeGroupUpdateRequest extends UsageTypeGroupSubRequestParent {
/**
 *
 * Constructor to create a  UsageTypeGroupUpdateRequest
 * @param id Unique request name
 * @param UTGUpdIn UsageTypeGroupObjectData for UsageTypeGroupUpdateRequest
 * @param UTGUpdateFilter UsageTypeGroupObjectFilter for UsageTypeGroupUpdateRequest
 * @param UTGUpdGet UsageTypeGroupObjectData for UsageTypeGroupUpdateRequest
 *
 */
@JsonCreator
  public UsageTypeGroupUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageTypeGroup")UsageTypeGroupObjectData UTGUpdIn, @JsonProperty("UTGUpdateFilter")UsageTypeGroupObjectFilter UTGUpdateFilter, @JsonProperty("UTGUpdGet")UsageTypeGroupObjectData UTGUpdGet) {
    super(id, "UsageTypeGroupUpdate");
    if (UTGUpdIn != null) {
      addInput("UsageTypeGroup", UsageTypeGroupObjectHelper.toMap(UTGUpdIn, new HashMap(), "UsageTypeGroup").get("UsageTypeGroup"));
    }
    if (UTGUpdateFilter != null) {
      Integer index =  UTGUpdateFilter.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UTGUpdateFilter", UsageTypeGroupObjectHelper.toMap(UTGUpdateFilter, new HashMap(), "UsageTypeGroup").get("UsageTypeGroup"));
    }
    if (UTGUpdGet != null) {
      addInput("UTGUpdGet", UsageTypeGroupObjectHelper.toMap(UTGUpdGet, new HashMap(), "UsageTypeGroup").get("UsageTypeGroup"));
    }
  }

/**
 *
 * Retrieves the UsageTypeGroupObjectData that results from the UsageTypeGroupUpdateRequest call
 * @return UsageTypeGroupObjectData resulting from udt call
 *
 */

  public UsageTypeGroupObjectData getOutput() {
    return UsageTypeGroupObjectHelper.fromMap(outputMap, "UsageTypeGroup");
  }
}
