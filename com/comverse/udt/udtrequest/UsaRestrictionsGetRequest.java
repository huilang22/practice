/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * UsaRestrictionsGetRequest.java
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
 * Class used to create a UsaRestrictionsGetRequest Udt Request
 *
 */

public class UsaRestrictionsGetRequest extends UsaRestrictionsSubRequestParent {
/**
 *
 * Constructor to create a  UsaRestrictionsGetRequest
 * @param id Unique request name
 * @param URget_In UsaRestrictionsObjectKeyData for UsaRestrictionsGetRequest
 *
 */
@JsonCreator
  public UsaRestrictionsGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("UsaRestrictions")UsaRestrictionsObjectKeyData URget_In) {
    super(id, "UsaRestrictionsGet");
    if (URget_In != null) {
      addInput("UsaRestrictions", UsaRestrictionsObjectKeyHelper.toMap(URget_In, new HashMap(), "UsaRestrictionsObjectKeyData").get("UsaRestrictionsObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the UsaRestrictionsObjectData that results from the UsaRestrictionsGetRequest call
 * @return UsaRestrictionsObjectData resulting from udt call
 *
 */

  public UsaRestrictionsObjectData getOutput() {
    return UsaRestrictionsObjectHelper.fromMap(outputMap, "UsaRestrictions");
  }
}
