/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DiscountDefinitionFindRequest.java
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
 * Class used to create a DiscountDefinitionFindRequest Udt Request
 *
 */

public class DiscountDefinitionFindRequest extends DiscountDefinitionRequest {
/**
 *
 * Constructor to create a  DiscountDefinitionFindRequest
 * @param id Unique request name
 * @param DDFndIn DiscountDefinitionObjectFilter for DiscountDefinitionFindRequest
 *
 */
@JsonCreator
  public DiscountDefinitionFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("DiscountDefinition")DiscountDefinitionObjectFilter DDFndIn) {
    super(id, "DiscountDefinitionFind");
    if (DDFndIn != null) {
      Integer index =  DDFndIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("DiscountDefinition", DiscountDefinitionObjectHelper.toMap(DDFndIn, new HashMap(), "DiscountDefinition").get("DiscountDefinition"));
    }
  }

/**
 *
 * Retrieves the DiscountDefinitionObjectDataList that results from the DiscountDefinitionFindRequest call
 * @return DiscountDefinitionObjectDataList resulting from udt call
 *
 */

  public DiscountDefinitionObjectDataList getOutput() {
    return DiscountDefinitionObjectHelper.fromMapList(outputMap, "DiscountDefinitionList");
  }
}
