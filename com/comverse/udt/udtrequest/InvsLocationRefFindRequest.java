/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsLocationRefFindRequest.java
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
 * Class used to create a InvsLocationRefFindRequest Udt Request
 *
 */

public class InvsLocationRefFindRequest extends InvsLocationRefRequest {
/**
 *
 * Constructor to create a  InvsLocationRefFindRequest
 * @param id Unique request name
 * @param InvsLocationRefFindIn InvsLocationRefObjectFilter for InvsLocationRefFindRequest
 *
 */
@JsonCreator
  public InvsLocationRefFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsLocationRef")InvsLocationRefObjectFilter InvsLocationRefFindIn) {
    super(id, "InvsLocationRefFind");
    if (InvsLocationRefFindIn != null) {
      Integer index =  InvsLocationRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsLocationRef", InvsLocationRefObjectHelper.toMap(InvsLocationRefFindIn, new HashMap(), "InvsLocationRef").get("InvsLocationRef"));
    }
  }

/**
 *
 * Retrieves the InvsLocationRefObjectDataList that results from the InvsLocationRefFindRequest call
 * @return InvsLocationRefObjectDataList resulting from udt call
 *
 */

  public InvsLocationRefObjectDataList getOutput() {
    return InvsLocationRefObjectHelper.fromMapList(outputMap, "InvsLocationRefList");
  }
}
