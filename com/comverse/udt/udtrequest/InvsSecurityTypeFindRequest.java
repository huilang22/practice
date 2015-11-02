/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsSecurityTypeFindRequest.java
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

import com.csgsystems.iv.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvsSecurityTypeFindRequest Udt Request
 *
 */

public class InvsSecurityTypeFindRequest extends InvsSecurityTypeRequest {
/**
 *
 * Constructor to create a  InvsSecurityTypeFindRequest
 * @param id Unique request name
 * @param InvsSecurityTypeFindIn InvsSecurityTypeObjectFilter for InvsSecurityTypeFindRequest
 *
 */
@JsonCreator
  public InvsSecurityTypeFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsSecurityType")InvsSecurityTypeObjectFilter InvsSecurityTypeFindIn) {
    super(id, "InvsSecurityTypeFind");
    if (InvsSecurityTypeFindIn != null) {
      Integer index =  InvsSecurityTypeFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsSecurityType", InvsSecurityTypeObjectHelper.toMap(InvsSecurityTypeFindIn, new HashMap(), "InvsSecurityType").get("InvsSecurityType"));
    }
  }

/**
 *
 * Retrieves the InvsSecurityTypeObjectDataList that results from the InvsSecurityTypeFindRequest call
 * @return InvsSecurityTypeObjectDataList resulting from udt call
 *
 */

  public InvsSecurityTypeObjectDataList getOutput() {
    return InvsSecurityTypeObjectHelper.fromMapList(outputMap, "InvsSecurityTypeList");
  }
}
