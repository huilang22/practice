/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * CountryCodeDeleteRequest.java
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
 * Class used to create a CountryCodeDeleteRequest Udt Request
 *
 */

public class CountryCodeDeleteRequest extends CountryCodeSubRequestParent {
/**
 *
 * Constructor to create a  CountryCodeDeleteRequest
 * @param id Unique request name
 * @param CCDeleteIn CountryCodeObjectKeyData for CountryCodeDeleteRequest
 *
 */
@JsonCreator
  public CountryCodeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("CountryCode")CountryCodeObjectKeyData CCDeleteIn) {
    super(id, "CountryCodeDelete");
    if (CCDeleteIn != null) {
      addInput("CountryCode", CountryCodeObjectKeyHelper.toMap(CCDeleteIn, new HashMap(), "CountryCodeObjectKeyData").get("CountryCodeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the CountryCodeObjectData that results from the CountryCodeDeleteRequest call
 * @return CountryCodeObjectData resulting from udt call
 *
 */

  public CountryCodeObjectData getOutput() {
    return CountryCodeObjectHelper.fromMap(outputMap, "CountryCode");
  }
}
