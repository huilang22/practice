/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsInterfaceRefFindRequest.java
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
 * Class used to create a InvsInterfaceRefFindRequest Udt Request
 *
 */

public class InvsInterfaceRefFindRequest extends InvsInterfaceRefRequest {
/**
 *
 * Constructor to create a  InvsInterfaceRefFindRequest
 * @param id Unique request name
 * @param InvsInterfaceRefFindIn InvsInterfaceRefObjectFilter for InvsInterfaceRefFindRequest
 *
 */
@JsonCreator
  public InvsInterfaceRefFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsInterfaceRef")InvsInterfaceRefObjectFilter InvsInterfaceRefFindIn) {
    super(id, "InvsInterfaceRefFind");
    if (InvsInterfaceRefFindIn != null) {
      Integer index =  InvsInterfaceRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsInterfaceRef", InvsInterfaceRefObjectHelper.toMap(InvsInterfaceRefFindIn, new HashMap(), "InvsInterfaceRef").get("InvsInterfaceRef"));
    }
  }

/**
 *
 * Retrieves the InvsInterfaceRefObjectDataList that results from the InvsInterfaceRefFindRequest call
 * @return InvsInterfaceRefObjectDataList resulting from udt call
 *
 */

  public InvsInterfaceRefObjectDataList getOutput() {
    return InvsInterfaceRefObjectHelper.fromMapList(outputMap, "InvsInterfaceRefList");
  }
}
