/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * RateClassDescrGetRequest.java
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
 * Class used to create a RateClassDescrGetRequest Udt Request
 *
 */

public class RateClassDescrGetRequest extends RateClassDescrSubRequestParent {
/**
 *
 * Constructor to create a  RateClassDescrGetRequest
 * @param id Unique request name
 * @param RCDGetIn RateClassDescrObjectKeyData for RateClassDescrGetRequest
 *
 */
@JsonCreator
  public RateClassDescrGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("RateClassDescr")RateClassDescrObjectKeyData RCDGetIn) {
    super(id, "RateClassDescrGet");
    if (RCDGetIn != null) {
      addInput("RateClassDescr", RateClassDescrObjectKeyHelper.toMap(RCDGetIn, new HashMap(), "RateClassDescrObjectKeyData").get("RateClassDescrObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the RateClassDescrObjectData that results from the RateClassDescrGetRequest call
 * @return RateClassDescrObjectData resulting from udt call
 *
 */

  public RateClassDescrObjectData getOutput() {
    return RateClassDescrObjectHelper.fromMap(outputMap, "RateClassDescr");
  }
}
