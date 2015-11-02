/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * IndustryTypeFindRequest.java
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
 * Class used to create a IndustryTypeFindRequest Udt Request
 *
 */

public class IndustryTypeFindRequest extends IndustryTypeRequest {
/**
 *
 * Constructor to create a  IndustryTypeFindRequest
 * @param id Unique request name
 * @param ITFindIn IndustryTypeObjectFilter for IndustryTypeFindRequest
 *
 */
@JsonCreator
  public IndustryTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("IndustryType")IndustryTypeObjectFilter ITFindIn) {
    super(id, "IndustryTypeFind");
    if (ITFindIn != null) {
      Integer index =  ITFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("IndustryType", IndustryTypeObjectHelper.toMap(ITFindIn, new HashMap(), "IndustryType").get("IndustryType"));
    }
  }

/**
 *
 * Retrieves the IndustryTypeObjectDataList that results from the IndustryTypeFindRequest call
 * @return IndustryTypeObjectDataList resulting from udt call
 *
 */

  public IndustryTypeObjectDataList getOutput() {
    return IndustryTypeObjectHelper.fromMapList(outputMap, "IndustryTypeList");
  }
}
