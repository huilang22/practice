/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CountryCodeCreateRequest.java
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
 * Class used to create a CountryCodeCreateRequest Udt Request
 *
 */

public class CountryCodeCreateRequest extends CountryCodeSubRequestParent {
/**
 *
 * Constructor to create a  CountryCodeCreateRequest
 * @param id Unique request name
 * @param CCCreateIn CountryCodeObjectData for CountryCodeCreateRequest
 *
 */
@JsonCreator
  public CountryCodeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("CountryCode")CountryCodeObjectData CCCreateIn) {
    super(id, "CountryCodeCreate");
    if (CCCreateIn != null) {
      addInput("CountryCode", CountryCodeObjectHelper.toMap(CCCreateIn, new HashMap(), "CountryCode").get("CountryCode"));
    }
  }

/**
 *
 * Retrieves the CountryCodeObjectData that results from the CountryCodeCreateRequest call
 * @return CountryCodeObjectData resulting from udt call
 *
 */

  public CountryCodeObjectData getOutput() {
    return CountryCodeObjectHelper.fromMap(outputMap, "CountryCode");
  }
}
