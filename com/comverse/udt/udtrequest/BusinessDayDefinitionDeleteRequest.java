/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionDeleteRequest.java
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
 * Class used to create a BusinessDayDefinitionDeleteRequest Udt Request
 *
 */

public class BusinessDayDefinitionDeleteRequest extends BusinessDayDefinitionSubRequestParent {
/**
 *
 * Constructor to create a  BusinessDayDefinitionDeleteRequest
 * @param id Unique request name
 * @param BDDdelete_In BusinessDayDefinitionObjectData for BusinessDayDefinitionDeleteRequest
 *
 */
@JsonCreator
  public BusinessDayDefinitionDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessDayDefinition")BusinessDayDefinitionObjectData BDDdelete_In) {
    super(id, "BusinessDayDefinitionDelete");
    if (BDDdelete_In != null) {
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectHelper.toMap(BDDdelete_In, new HashMap(), "BusinessDayDefinition").get("BusinessDayDefinition"));
    }
  }

/**
 *
 * Retrieves the BusinessDayDefinitionObjectData that results from the BusinessDayDefinitionDeleteRequest call
 * @return BusinessDayDefinitionObjectData resulting from udt call
 *
 */

  public BusinessDayDefinitionObjectData getOutput() {
    return BusinessDayDefinitionObjectHelper.fromMap(outputMap, "BusinessDayDefinition");
  }
}
