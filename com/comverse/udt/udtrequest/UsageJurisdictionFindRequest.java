/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsageJurisdictionFindRequest.java
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
 * Class used to create a UsageJurisdictionFindRequest Udt Request
 *
 */

public class UsageJurisdictionFindRequest extends UsageJurisdictionRequest {
/**
 *
 * Constructor to create a  UsageJurisdictionFindRequest
 * @param id Unique request name
 * @param UsageJurisdictionFindIn UsageJurisdictionObjectFilter for UsageJurisdictionFindRequest
 *
 */
@JsonCreator
  public UsageJurisdictionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsageJurisdiction")UsageJurisdictionObjectFilter UsageJurisdictionFindIn) {
    super(id, "UsageJurisdictionFind");
    if (UsageJurisdictionFindIn != null) {
      Integer index =  UsageJurisdictionFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsageJurisdiction", UsageJurisdictionObjectHelper.toMap(UsageJurisdictionFindIn, new HashMap(), "UsageJurisdiction").get("UsageJurisdiction"));
    }
  }

/**
 *
 * Retrieves the UsageJurisdictionObjectDataList that results from the UsageJurisdictionFindRequest call
 * @return UsageJurisdictionObjectDataList resulting from udt call
 *
 */

  public UsageJurisdictionObjectDataList getOutput() {
    return UsageJurisdictionObjectHelper.fromMapList(outputMap, "UsageJurisdictionList");
  }
}
