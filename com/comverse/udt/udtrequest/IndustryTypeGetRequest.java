/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * IndustryTypeGetRequest.java
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
 * Class used to create a IndustryTypeGetRequest Udt Request
 *
 */

public class IndustryTypeGetRequest extends IndustryTypeSubRequestParent {
/**
 *
 * Constructor to create a  IndustryTypeGetRequest
 * @param id Unique request name
 * @param ITGetIn IndustryTypeObjectKeyData for IndustryTypeGetRequest
 *
 */
@JsonCreator
  public IndustryTypeGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("IndustryType")IndustryTypeObjectKeyData ITGetIn) {
    super(id, "IndustryTypeGet");
    if (ITGetIn != null) {
      addInput("IndustryType", IndustryTypeObjectKeyHelper.toMap(ITGetIn, new HashMap(), "IndustryTypeObjectKeyData").get("IndustryTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the IndustryTypeObjectData that results from the IndustryTypeGetRequest call
 * @return IndustryTypeObjectData resulting from udt call
 *
 */

  public IndustryTypeObjectData getOutput() {
    return IndustryTypeObjectHelper.fromMap(outputMap, "IndustryType");
  }
}
