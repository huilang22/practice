/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvContainerRelationsFindRequest.java
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
 * Class used to create a InvContainerRelationsFindRequest Udt Request
 *
 */

public class InvContainerRelationsFindRequest extends InvContainerRequest {
/**
 *
 * Constructor to create a  InvContainerRelationsFindRequest
 * @param id Unique request name
 * @param InvContainerFindIn InvContainerObjectFilter for InvContainerRelationsFindRequest
 *
 */
@JsonCreator
  public InvContainerRelationsFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvContainer")InvContainerObjectFilter InvContainerFindIn) {
    super(id, "InvContainerRelationsFind");
    if (InvContainerFindIn != null) {
      Integer index =  InvContainerFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvContainer", InvContainerObjectHelper.toMap(InvContainerFindIn, new HashMap(), "InvContainer").get("InvContainer"));
    }
  }

/**
 *
 * Retrieves the InvContainerObjectDataList that results from the InvContainerRelationsFindRequest call
 * @return InvContainerObjectDataList resulting from udt call
 *
 */

  public InvContainerObjectDataList getOutput() {
    return InvContainerObjectHelper.fromMapList(outputMap, "InvContainerList");
  }
}
