/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageJurisdictionCreateRequest.java
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
 * Class used to create a UsageJurisdictionCreateRequest Udt Request
 *
 */

public class UsageJurisdictionCreateRequest extends UsageJurisdictionSubRequestParent {
/**
 *
 * Constructor to create a  UsageJurisdictionCreateRequest
 * @param id Unique request name
 * @param ujCrIn UsageJurisdictionObjectData for UsageJurisdictionCreateRequest
 *
 */
@JsonCreator
  public UsageJurisdictionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageJurisdiction")UsageJurisdictionObjectData ujCrIn) {
    super(id, "UsageJurisdictionCreate");
    if (ujCrIn != null) {
      addInput("UsageJurisdiction", UsageJurisdictionObjectHelper.toMap(ujCrIn, new HashMap(), "UsageJurisdiction").get("UsageJurisdiction"));
    }
  }

/**
 *
 * Retrieves the UsageJurisdictionObjectData that results from the UsageJurisdictionCreateRequest call
 * @return UsageJurisdictionObjectData resulting from udt call
 *
 */

  public UsageJurisdictionObjectData getOutput() {
    return UsageJurisdictionObjectHelper.fromMap(outputMap, "UsageJurisdiction");
  }
}
