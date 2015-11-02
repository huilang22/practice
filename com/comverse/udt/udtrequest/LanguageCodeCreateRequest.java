/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LanguageCodeCreateRequest.java
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
 * Class used to create a LanguageCodeCreateRequest Udt Request
 *
 */

public class LanguageCodeCreateRequest extends LanguageCodeSubRequestParent {
/**
 *
 * Constructor to create a  LanguageCodeCreateRequest
 * @param id Unique request name
 * @param LCCreateIn LCObjectData for LanguageCodeCreateRequest
 *
 */
@JsonCreator
  public LanguageCodeCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("LanguageCode")LCObjectData LCCreateIn) {
    super(id, "LanguageCodeCreate");
    if (LCCreateIn != null) {
      addInput("LanguageCode", LCObjectHelper.toMap(LCCreateIn, new HashMap(), "LanguageCode").get("LanguageCode"));
    }
  }

/**
 *
 * Retrieves the LCObjectData that results from the LanguageCodeCreateRequest call
 * @return LCObjectData resulting from udt call
 *
 */

  public LCObjectData getOutput() {
    return LCObjectHelper.fromMap(outputMap, "LanguageCode");
  }
}
