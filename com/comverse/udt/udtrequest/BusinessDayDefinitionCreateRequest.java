/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionCreateRequest.java
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
 * Class used to create a BusinessDayDefinitionCreateRequest Udt Request
 *
 */

public class BusinessDayDefinitionCreateRequest extends BusinessDayDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BusinessDayDefinitionCreateRequest
 * @param id Unique request name
 * @param BDDcreate_In BusinessDayDefinitionObjectData for BusinessDayDefinitionCreateRequest
 *
 */
@JsonCreator
  public BusinessDayDefinitionCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessDayDefinition")BusinessDayDefinitionObjectData BDDcreate_In) {
    super(id, "BusinessDayDefinitionCreate");
    if (BDDcreate_In != null) {
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectHelper.toMap(BDDcreate_In, new HashMap(), "BusinessDayDefinition").get("BusinessDayDefinition"));
    }
  }

/**
 *
 * Retrieves the BusinessDayDefinitionObjectData that results from the BusinessDayDefinitionCreateRequest call
 * @return BusinessDayDefinitionObjectData resulting from udt call
 *
 */

  public BusinessDayDefinitionObjectData getOutput() {
    return BusinessDayDefinitionObjectHelper.fromMap(outputMap, "BusinessDayDefinition");
  }
}
