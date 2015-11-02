/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsContainerTypeRefFindRequest.java
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
 * Class used to create a InvsContainerTypeRefFindRequest Udt Request
 *
 */

public class InvsContainerTypeRefFindRequest extends InvsContainerTypeRefRequest {
/**
 *
 * Constructor to create a  InvsContainerTypeRefFindRequest
 * @param id Unique request name
 * @param InvsContainerTypeRefFindIn InvsContainerTypeRefObjectFilter for InvsContainerTypeRefFindRequest
 *
 */
@JsonCreator
  public InvsContainerTypeRefFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsContainerTypeRef")InvsContainerTypeRefObjectFilter InvsContainerTypeRefFindIn) {
    super(id, "InvsContainerTypeRefFind");
    if (InvsContainerTypeRefFindIn != null) {
      Integer index =  InvsContainerTypeRefFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsContainerTypeRef", InvsContainerTypeRefObjectHelper.toMap(InvsContainerTypeRefFindIn, new HashMap(), "InvsContainerTypeRef").get("InvsContainerTypeRef"));
    }
  }

/**
 *
 * Retrieves the InvsContainerTypeRefObjectDataList that results from the InvsContainerTypeRefFindRequest call
 * @return InvsContainerTypeRefObjectDataList resulting from udt call
 *
 */

  public InvsContainerTypeRefObjectDataList getOutput() {
    return InvsContainerTypeRefObjectHelper.fromMapList(outputMap, "InvsContainerTypeRefList");
  }
}
