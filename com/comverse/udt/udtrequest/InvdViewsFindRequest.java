/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdViewsFindRequest.java
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
 * Class used to create a InvdViewsFindRequest Udt Request
 *
 */

public class InvdViewsFindRequest extends InvdViewsRequest {
/**
 *
 * Constructor to create a  InvdViewsFindRequest
 * @param id Unique request name
 * @param InvdViewsFindIn InvdViewsObjectFilter for InvdViewsFindRequest
 *
 */
@JsonCreator
  public InvdViewsFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdViews")InvdViewsObjectFilter InvdViewsFindIn) {
    super(id, "InvdViewsFind");
    if (InvdViewsFindIn != null) {
      Integer index =  InvdViewsFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvdViews", InvdViewsObjectHelper.toMap(InvdViewsFindIn, new HashMap(), "InvdViews").get("InvdViews"));
    }
  }

/**
 *
 * Retrieves the InvdViewsObjectDataList that results from the InvdViewsFindRequest call
 * @return InvdViewsObjectDataList resulting from udt call
 *
 */

  public InvdViewsObjectDataList getOutput() {
    return InvdViewsObjectHelper.fromMapList(outputMap, "InvdViewsList");
  }
}
