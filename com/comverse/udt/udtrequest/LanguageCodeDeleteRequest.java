/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LanguageCodeDeleteRequest.java
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
 * Class used to create a LanguageCodeDeleteRequest Udt Request
 *
 */

public class LanguageCodeDeleteRequest extends LanguageCodeSubRequestParent {
/**
 *
 * Constructor to create a  LanguageCodeDeleteRequest
 * @param id Unique request name
 * @param LCDeleteIn LCObjectKeyData for LanguageCodeDeleteRequest
 *
 */
@JsonCreator
  public LanguageCodeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("LanguageCode")LCObjectKeyData LCDeleteIn) {
    super(id, "LanguageCodeDelete");
    if (LCDeleteIn != null) {
      addInput("LanguageCode", LCObjectKeyHelper.toMap(LCDeleteIn, new HashMap(), "LCObjectKeyData").get("LCObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the LCObjectData that results from the LanguageCodeDeleteRequest call
 * @return LCObjectData resulting from udt call
 *
 */

  public LCObjectData getOutput() {
    return LCObjectHelper.fromMap(outputMap, "LanguageCode");
  }
}
