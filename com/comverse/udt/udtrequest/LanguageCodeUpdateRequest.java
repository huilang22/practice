/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * LanguageCodeUpdateRequest.java
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
 * Class used to create a LanguageCodeUpdateRequest Udt Request
 *
 */

public class LanguageCodeUpdateRequest extends LanguageCodeSubRequestParent {
/**
 *
 * Constructor to create a  LanguageCodeUpdateRequest
 * @param id Unique request name
 * @param LCUpdateIn LCObjectData for LanguageCodeUpdateRequest
 *
 */
@JsonCreator
  public LanguageCodeUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("LanguageCode")LCObjectData LCUpdateIn) {
    super(id, "LanguageCodeUpdate");
    if (LCUpdateIn != null) {
      addInput("LanguageCode", LCObjectHelper.toMap(LCUpdateIn, new HashMap(), "LanguageCode").get("LanguageCode"));
    }
  }

/**
 *
 * Retrieves the LCObjectData that results from the LanguageCodeUpdateRequest call
 * @return LCObjectData resulting from udt call
 *
 */

  public LCObjectData getOutput() {
    return LCObjectHelper.fromMap(outputMap, "LanguageCode");
  }
}
