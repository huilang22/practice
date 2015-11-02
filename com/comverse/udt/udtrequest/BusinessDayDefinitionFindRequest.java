/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * BusinessDayDefinitionFindRequest.java
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
 * Class used to create a BusinessDayDefinitionFindRequest Udt Request
 *
 */

public class BusinessDayDefinitionFindRequest extends BusinessDayDefinitionRequest {
/**
 *
 * Constructor to create a  BusinessDayDefinitionFindRequest
 * @param id Unique request name
 * @param BDDfind_In BusinessDayDefinitionObjectFilter for BusinessDayDefinitionFindRequest
 *
 */
@JsonCreator
  public BusinessDayDefinitionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("BusinessDayDefinition")BusinessDayDefinitionObjectFilter BDDfind_In) {
    super(id, "BusinessDayDefinitionFind");
    if (BDDfind_In != null) {
      Integer index =  BDDfind_In.getIndex();
      if (index != null) addInput("Index", index);
      addInput("BusinessDayDefinition", BusinessDayDefinitionObjectHelper.toMap(BDDfind_In, new HashMap(), "BusinessDayDefinition").get("BusinessDayDefinition"));
    }
  }

/**
 *
 * Retrieves the BusinessDayDefinitionObjectDataList that results from the BusinessDayDefinitionFindRequest call
 * @return BusinessDayDefinitionObjectDataList resulting from udt call
 *
 */

  public BusinessDayDefinitionObjectDataList getOutput() {
    return BusinessDayDefinitionObjectHelper.fromMapList(outputMap, "BusinessDayDefinitionList");
  }
}
