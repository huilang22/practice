/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * AxrtCountryCodeMapGetRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a AxrtCountryCodeMapGetRequest Udt Request
 *
 */

public class AxrtCountryCodeMapGetRequest extends AxrtCountryCodeMapSubRequestParent {
/**
 *
 * Constructor to create a  AxrtCountryCodeMapGetRequest
 * @param id Unique request name
 * @param AxrtCountryCodeMapIn AxrtCountryCodeMapObjectKeyData for AxrtCountryCodeMapGetRequest
 *
 */
@JsonCreator
  public AxrtCountryCodeMapGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("AxrtCountryCodeMap")AxrtCountryCodeMapObjectKeyData AxrtCountryCodeMapIn) {
    super(id, "AxrtCountryCodeMapGet");
    if (AxrtCountryCodeMapIn != null) {
      addInput("AxrtCountryCodeMap", AxrtCountryCodeMapObjectKeyHelper.toMap(AxrtCountryCodeMapIn, new HashMap(), "AxrtCountryCodeMapObjectKeyData").get("AxrtCountryCodeMapObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the AxrtCountryCodeMapObjectData that results from the AxrtCountryCodeMapGetRequest call
 * @return AxrtCountryCodeMapObjectData resulting from udt call
 *
 */

  public AxrtCountryCodeMapObjectData getOutput() {
    return AxrtCountryCodeMapObjectHelper.fromMap(outputMap, "AxrtCountryCodeMap");
  }
}
