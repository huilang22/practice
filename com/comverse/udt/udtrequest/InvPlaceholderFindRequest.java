/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvPlaceholderFindRequest.java
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

import com.csgsystems.om.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a InvPlaceholderFindRequest Udt Request
 *
 */

public class InvPlaceholderFindRequest extends InvPlaceholderRequest {
/**
 *
 * Constructor to create a  InvPlaceholderFindRequest
 * @param id Unique request name
 * @param findIn InvPlaceholderObjectFilter for InvPlaceholderFindRequest
 *
 */
@JsonCreator
  public InvPlaceholderFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvPlaceholder")InvPlaceholderObjectFilter findIn) {
    super(id, "InvPlaceholderFind");
    if (findIn != null) {
      Integer index =  findIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvPlaceholder", InvPlaceholderObjectHelper.toMap(findIn, new HashMap(), "InvPlaceholder").get("InvPlaceholder"));
    }
  }

/**
 *
 * Retrieves the InvPlaceholderObjectDataList that results from the InvPlaceholderFindRequest call
 * @return InvPlaceholderObjectDataList resulting from udt call
 *
 */

  public InvPlaceholderObjectDataList getOutput() {
    return InvPlaceholderObjectHelper.fromMapList(outputMap, "InvPlaceholderList");
  }
}
