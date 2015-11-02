/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageJurisdictionGetRequest.java
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
 * Class used to create a UsageJurisdictionGetRequest Udt Request
 *
 */

public class UsageJurisdictionGetRequest extends UsageJurisdictionSubRequestParent {
/**
 *
 * Constructor to create a  UsageJurisdictionGetRequest
 * @param id Unique request name
 * @param UsageJurisdictionGetIn UsageJurisdictionObjectKeyData for UsageJurisdictionGetRequest
 *
 */
@JsonCreator
  public UsageJurisdictionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageJurisdiction")UsageJurisdictionObjectKeyData UsageJurisdictionGetIn) {
    super(id, "UsageJurisdictionGet");
    if (UsageJurisdictionGetIn != null) {
      addInput("UsageJurisdiction", UsageJurisdictionObjectKeyHelper.toMap(UsageJurisdictionGetIn, new HashMap(), "UsageJurisdictionObjectKeyData").get("UsageJurisdictionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UsageJurisdictionObjectData that results from the UsageJurisdictionGetRequest call
 * @return UsageJurisdictionObjectData resulting from udt call
 *
 */

  public UsageJurisdictionObjectData getOutput() {
    return UsageJurisdictionObjectHelper.fromMap(outputMap, "UsageJurisdiction");
  }
}
