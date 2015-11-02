/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsaRestrictionsDeleteRequest.java
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
 * Class used to create a UsaRestrictionsDeleteRequest Udt Request
 *
 */

public class UsaRestrictionsDeleteRequest extends UsaRestrictionsSubRequestParent {
/**
 *
 * Constructor to create a  UsaRestrictionsDeleteRequest
 * @param id Unique request name
 * @param URdelete_In UsaRestrictionsObjectData for UsaRestrictionsDeleteRequest
 *
 */
@JsonCreator
  public UsaRestrictionsDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsaRestrictions")UsaRestrictionsObjectData URdelete_In) {
    super(id, "UsaRestrictionsDelete");
    if (URdelete_In != null) {
      addInput("UsaRestrictions", UsaRestrictionsObjectHelper.toMap(URdelete_In, new HashMap(), "UsaRestrictions").get("UsaRestrictions"));
    }
  }

/**
 *
 * Retrieves the UsaRestrictionsObjectData that results from the UsaRestrictionsDeleteRequest call
 * @return UsaRestrictionsObjectData resulting from udt call
 *
 */

  public UsaRestrictionsObjectData getOutput() {
    return UsaRestrictionsObjectHelper.fromMap(outputMap, "UsaRestrictions");
  }
}
