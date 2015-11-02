/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorFindRequest.java
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
 * Class used to create a InvsVendorFindRequest Udt Request
 *
 */

public class InvsVendorFindRequest extends InvsVendorRequest {
/**
 *
 * Constructor to create a  InvsVendorFindRequest
 * @param id Unique request name
 * @param InvsVendorFindIn InvsVendorObjectFilter for InvsVendorFindRequest
 *
 */
@JsonCreator
  public InvsVendorFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsVendor")InvsVendorObjectFilter InvsVendorFindIn) {
    super(id, "InvsVendorFind");
    if (InvsVendorFindIn != null) {
      Integer index =  InvsVendorFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsVendor", InvsVendorObjectHelper.toMap(InvsVendorFindIn, new HashMap(), "InvsVendor").get("InvsVendor"));
    }
  }

/**
 *
 * Retrieves the InvsVendorObjectDataList that results from the InvsVendorFindRequest call
 * @return InvsVendorObjectDataList resulting from udt call
 *
 */

  public InvsVendorObjectDataList getOutput() {
    return InvsVendorObjectHelper.fromMapList(outputMap, "InvsVendorList");
  }
}
