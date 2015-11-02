/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsCountryCodeGetRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsCountryCodeGetRequest Udt Request
 *
 */

public class InvsCountryCodeGetRequest extends InvsCountryCodeSubRequestParent {
/**
 *
 * Constructor to create a  InvsCountryCodeGetRequest
 * @param id Unique request name
 * @param InvsCountryCodeGetIn InvsCountryCodeObjectKeyData for InvsCountryCodeGetRequest
 *
 */
@JsonCreator
  public InvsCountryCodeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsCountryCode")InvsCountryCodeObjectKeyData InvsCountryCodeGetIn) {
    super(id, "InvsCountryCodeGet");
    if (InvsCountryCodeGetIn != null) {
      addInput("InvsCountryCode", InvsCountryCodeObjectKeyHelper.toMap(InvsCountryCodeGetIn, new HashMap(), "InvsCountryCodeObjectKeyData").get("InvsCountryCodeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvsCountryCodeObjectData that results from the InvsCountryCodeGetRequest call
 * @return InvsCountryCodeObjectData resulting from udt call
 *
 */

  public InvsCountryCodeObjectData getOutput() {
    return InvsCountryCodeObjectHelper.fromMap(outputMap, "InvsCountryCode");
  }
}
