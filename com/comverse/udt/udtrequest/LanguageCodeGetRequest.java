/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LanguageCodeGetRequest.java
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
 * Class used to create a LanguageCodeGetRequest Udt Request
 *
 */

public class LanguageCodeGetRequest extends LanguageCodeSubRequestParent {
/**
 *
 * Constructor to create a  LanguageCodeGetRequest
 * @param id Unique request name
 * @param LCGetIn LCObjectKeyData for LanguageCodeGetRequest
 *
 */
@JsonCreator
  public LanguageCodeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("LanguageCode")LCObjectKeyData LCGetIn) {
    super(id, "LanguageCodeGet");
    if (LCGetIn != null) {
      addInput("LanguageCode", LCObjectKeyHelper.toMap(LCGetIn, new HashMap(), "LCObjectKeyData").get("LCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the LCObjectData that results from the LanguageCodeGetRequest call
 * @return LCObjectData resulting from udt call
 *
 */

  public LCObjectData getOutput() {
    return LCObjectHelper.fromMap(outputMap, "LanguageCode");
  }
}
