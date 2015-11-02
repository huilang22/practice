/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CountryCodeUpdateRequest.java
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
 * Class used to create a CountryCodeUpdateRequest Udt Request
 *
 */

public class CountryCodeUpdateRequest extends CountryCodeSubRequestParent {
/**
 *
 * Constructor to create a  CountryCodeUpdateRequest
 * @param id Unique request name
 * @param CCUpdateIn CountryCodeObjectData for CountryCodeUpdateRequest
 *
 */
@JsonCreator
  public CountryCodeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CountryCode")CountryCodeObjectData CCUpdateIn) {
    super(id, "CountryCodeUpdate");
    if (CCUpdateIn != null) {
      addInput("CountryCode", CountryCodeObjectHelper.toMap(CCUpdateIn, new HashMap(), "CountryCode").get("CountryCode"));
    }
  }

/**
 *
 * Retrieves the CountryCodeObjectData that results from the CountryCodeUpdateRequest call
 * @return CountryCodeObjectData resulting from udt call
 *
 */

  public CountryCodeObjectData getOutput() {
    return CountryCodeObjectHelper.fromMap(outputMap, "CountryCode");
  }
}
