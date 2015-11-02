/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdViewsGetLatestRequest.java
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
 * Class used to create a InvdViewsGetLatestRequest Udt Request
 *
 */

public class InvdViewsGetLatestRequest extends InvdViewsSubRequestParent {
/**
 *
 * Constructor to create a  InvdViewsGetLatestRequest
 * @param id Unique request name
 * @param InvdViewsGetLatestIn InvdViewsObjectData for InvdViewsGetLatestRequest
 *
 */
@JsonCreator
  public InvdViewsGetLatestRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdViews")InvdViewsObjectData InvdViewsGetLatestIn) {
    super(id, "InvdViewsGetLatest");
    if (InvdViewsGetLatestIn != null) {
      addInput("InvdViews", InvdViewsObjectHelper.toMap(InvdViewsGetLatestIn, new HashMap(), "InvdViews").get("InvdViews"));
    }
  }

/**
 *
 * Retrieves the InvdViewsObjectData that results from the InvdViewsGetLatestRequest call
 * @return InvdViewsObjectData resulting from udt call
 *
 */

  public InvdViewsObjectData getOutput() {
    return InvdViewsObjectHelper.fromMap(outputMap, "InvdViews");
  }
}
