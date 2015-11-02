/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionUpdateRequest.java
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
 * Class used to create a BusinessDayDefinitionUpdateRequest Udt Request
 *
 */

public class BusinessDayDefinitionUpdateRequest extends BusinessDayDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BusinessDayDefinitionUpdateRequest
 * @param id Unique request name
 * @param BDDupdate_In BusinessDayDefinitionObjectData for BusinessDayDefinitionUpdateRequest
 *
 */
@JsonCreator
  public BusinessDayDefinitionUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessDayDefinition")BusinessDayDefinitionObjectData BDDupdate_In) {
    super(id, "BusinessDayDefinitionUpdate");
    if (BDDupdate_In != null) {
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectHelper.toMap(BDDupdate_In, new HashMap(), "BusinessDayDefinition").get("BusinessDayDefinition"));
    }
  }

/**
 *
 * Retrieves the BusinessDayDefinitionObjectData that results from the BusinessDayDefinitionUpdateRequest call
 * @return BusinessDayDefinitionObjectData resulting from udt call
 *
 */

  public BusinessDayDefinitionObjectData getOutput() {
    return BusinessDayDefinitionObjectHelper.fromMap(outputMap, "BusinessDayDefinition");
  }
}
