/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionGetRequest.java
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
 * Class used to create a BusinessDayDefinitionGetRequest Udt Request
 *
 */

public class BusinessDayDefinitionGetRequest extends BusinessDayDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BusinessDayDefinitionGetRequest
 * @param id Unique request name
 * @param BDDget_In BusinessDayDefinitionObjectKeyData for BusinessDayDefinitionGetRequest
 *
 */
@JsonCreator
  public BusinessDayDefinitionGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessDayDefinition")BusinessDayDefinitionObjectKeyData BDDget_In) {
    super(id, "BusinessDayDefinitionGet");
    if (BDDget_In != null) {
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectKeyHelper.toMap(BDDget_In, new HashMap(), "BusinessDayDefinitionObjectKeyData").get("BusinessDayDefinitionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the BusinessDayDefinitionObjectData that results from the BusinessDayDefinitionGetRequest call
 * @return BusinessDayDefinitionObjectData resulting from udt call
 *
 */

  public BusinessDayDefinitionObjectData getOutput() {
    return BusinessDayDefinitionObjectHelper.fromMap(outputMap, "BusinessDayDefinition");
  }
}
