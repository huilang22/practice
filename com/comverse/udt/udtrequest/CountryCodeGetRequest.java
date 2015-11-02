/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CountryCodeGetRequest.java
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
 * Class used to create a CountryCodeGetRequest Udt Request
 *
 */

public class CountryCodeGetRequest extends CountryCodeSubRequestParent {
/**
 *
 * Constructor to create a  CountryCodeGetRequest
 * @param id Unique request name
 * @param CCGetIn CountryCodeObjectKeyData for CountryCodeGetRequest
 *
 */
@JsonCreator
  public CountryCodeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("CountryCode")CountryCodeObjectKeyData CCGetIn) {
    super(id, "CountryCodeGet");
    if (CCGetIn != null) {
      addInput("CountryCode", CountryCodeObjectKeyHelper.toMap(CCGetIn, new HashMap(), "CountryCodeObjectKeyData").get("CountryCodeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CountryCodeObjectData that results from the CountryCodeGetRequest call
 * @return CountryCodeObjectData resulting from udt call
 *
 */

  public CountryCodeObjectData getOutput() {
    return CountryCodeObjectHelper.fromMap(outputMap, "CountryCode");
  }
}
