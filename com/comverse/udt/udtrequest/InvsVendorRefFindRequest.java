/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsVendorRefFindRequest.java
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
 * Class used to create a InvsVendorRefFindRequest Udt Request
 *
 */

public class InvsVendorRefFindRequest extends InvsVendorRefRequest {
/**
 *
 * Constructor to create a  InvsVendorRefFindRequest
 * @param id Unique request name
 * @param InvsVendorRefFindIn InvsVendorRefObjectFilter for InvsVendorRefFindRequest
 *
 */
@JsonCreator
  public InvsVendorRefFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsVendorRef")InvsVendorRefObjectFilter InvsVendorRefFindIn) {
    super(id, "InvsVendorRefFind");
    if (InvsVendorRefFindIn != null) {
      Integer index =  InvsVendorRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsVendorRef", InvsVendorRefObjectHelper.toMap(InvsVendorRefFindIn, new HashMap(), "InvsVendorRef").get("InvsVendorRef"));
    }
  }

/**
 *
 * Retrieves the InvsVendorRefObjectDataList that results from the InvsVendorRefFindRequest call
 * @return InvsVendorRefObjectDataList resulting from udt call
 *
 */

  public InvsVendorRefObjectDataList getOutput() {
    return InvsVendorRefObjectHelper.fromMapList(outputMap, "InvsVendorRefList");
  }
}
