/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsaRestrictionsCreateRequest.java
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
 * Class used to create a UsaRestrictionsCreateRequest Udt Request
 *
 */

public class UsaRestrictionsCreateRequest extends UsaRestrictionsSubRequestParent {
/**
 *
 * Constructor to create a  UsaRestrictionsCreateRequest
 * @param id Unique request name
 * @param URcreate_In UsaRestrictionsObjectData for UsaRestrictionsCreateRequest
 *
 */
@JsonCreator
  public UsaRestrictionsCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsaRestrictions")UsaRestrictionsObjectData URcreate_In) {
    super(id, "UsaRestrictionsCreate");
    if (URcreate_In != null) {
      addInput("UsaRestrictions", UsaRestrictionsObjectHelper.toMap(URcreate_In, new HashMap(), "UsaRestrictions").get("UsaRestrictions"));
    }
  }

/**
 *
 * Retrieves the UsaRestrictionsObjectData that results from the UsaRestrictionsCreateRequest call
 * @return UsaRestrictionsObjectData resulting from udt call
 *
 */

  public UsaRestrictionsObjectData getOutput() {
    return UsaRestrictionsObjectHelper.fromMap(outputMap, "UsaRestrictions");
  }
}
