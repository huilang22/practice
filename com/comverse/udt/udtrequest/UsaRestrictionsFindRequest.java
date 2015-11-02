/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsaRestrictionsFindRequest.java
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
 * Class used to create a UsaRestrictionsFindRequest Udt Request
 *
 */

public class UsaRestrictionsFindRequest extends UsaRestrictionsRequest {
/**
 *
 * Constructor to create a  UsaRestrictionsFindRequest
 * @param id Unique request name
 * @param URfind_In UsaRestrictionsObjectFilter for UsaRestrictionsFindRequest
 *
 */
@JsonCreator
  public UsaRestrictionsFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsaRestrictions")UsaRestrictionsObjectFilter URfind_In) {
    super(id, "UsaRestrictionsFind");
    if (URfind_In != null) {
      Integer index =  URfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("UsaRestrictions", UsaRestrictionsObjectHelper.toMap(URfind_In, new HashMap(), "UsaRestrictions").get("UsaRestrictions"));
    }
  }

/**
 *
 * Retrieves the UsaRestrictionsObjectDataList that results from the UsaRestrictionsFindRequest call
 * @return UsaRestrictionsObjectDataList resulting from udt call
 *
 */

  public UsaRestrictionsObjectDataList getOutput() {
    return UsaRestrictionsObjectHelper.fromMapList(outputMap, "UsaRestrictionsList");
  }
}
