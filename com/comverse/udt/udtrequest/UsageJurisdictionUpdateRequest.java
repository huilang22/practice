/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageJurisdictionUpdateRequest.java
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
 * Class used to create a UsageJurisdictionUpdateRequest Udt Request
 *
 */

public class UsageJurisdictionUpdateRequest extends UsageJurisdictionSubRequestParent {
/**
 *
 * Constructor to create a  UsageJurisdictionUpdateRequest
 * @param id Unique request name
 * @param UsageJurisdictionUpdateIn UsageJurisdictionObjectData for UsageJurisdictionUpdateRequest
 *
 */
@JsonCreator
  public UsageJurisdictionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageJurisdiction")UsageJurisdictionObjectData UsageJurisdictionUpdateIn) {
    super(id, "UsageJurisdictionUpdate");
    if (UsageJurisdictionUpdateIn != null) {
      addInput("UsageJurisdiction", UsageJurisdictionObjectHelper.toMap(UsageJurisdictionUpdateIn, new HashMap(), "UsageJurisdiction").get("UsageJurisdiction"));
    }
  }

/**
 *
 * Retrieves the UsageJurisdictionObjectData that results from the UsageJurisdictionUpdateRequest call
 * @return UsageJurisdictionObjectData resulting from udt call
 *
 */

  public UsageJurisdictionObjectData getOutput() {
    return UsageJurisdictionObjectHelper.fromMap(outputMap, "UsageJurisdiction");
  }
}
