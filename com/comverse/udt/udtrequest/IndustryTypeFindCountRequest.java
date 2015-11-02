/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * IndustryTypeFindCountRequest.java
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
 * Class used to create a IndustryTypeFindCountRequest Udt Request
 *
 */

public class IndustryTypeFindCountRequest extends IndustryTypeRequest {
/**
 *
 * Constructor to create a  IndustryTypeFindCountRequest
 * @param id Unique request name
 * @param ITFindCountIn IndustryTypeObjectFilter for IndustryTypeFindCountRequest
 *
 */
@JsonCreator
  public IndustryTypeFindCountRequest(@JsonProperty("RequestId") String id, @JsonProperty("IndustryType")IndustryTypeObjectFilter ITFindCountIn) {
    super(id, "IndustryTypeFindCount");
    if (ITFindCountIn != null) {
      Integer index =  ITFindCountIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("IndustryType", IndustryTypeObjectHelper.toMap(ITFindCountIn, new HashMap(), "TotalCount").get("TotalCount"));
    }
  }

/**
 *
 * Retrieves the Integer that results from the IndustryTypeFindCountRequest call
 * @return Integer resulting from udt call
 *
 */

  public Integer getOutput() {
    return  (Integer)outputMap.get("TotalCount");
  }
}
