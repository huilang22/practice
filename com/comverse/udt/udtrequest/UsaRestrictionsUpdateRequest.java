/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsaRestrictionsUpdateRequest.java
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
 * Class used to create a UsaRestrictionsUpdateRequest Udt Request
 *
 */

public class UsaRestrictionsUpdateRequest extends UsaRestrictionsSubRequestParent {
/**
 *
 * Constructor to create a  UsaRestrictionsUpdateRequest
 * @param id Unique request name
 * @param URupdate_In UsaRestrictionsObjectData for UsaRestrictionsUpdateRequest
 *
 */
@JsonCreator
  public UsaRestrictionsUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsaRestrictions")UsaRestrictionsObjectData URupdate_In) {
    super(id, "UsaRestrictionsUpdate");
    if (URupdate_In != null) {
      addInput("UsaRestrictions", UsaRestrictionsObjectHelper.toMap(URupdate_In, new HashMap(), "UsaRestrictions").get("UsaRestrictions"));
    }
  }

/**
 *
 * Retrieves the UsaRestrictionsObjectData that results from the UsaRestrictionsUpdateRequest call
 * @return UsaRestrictionsObjectData resulting from udt call
 *
 */

  public UsaRestrictionsObjectData getOutput() {
    return UsaRestrictionsObjectHelper.fromMap(outputMap, "UsaRestrictions");
  }
}
