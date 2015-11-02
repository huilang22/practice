/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdViewsUpdateRequest.java
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
 * Class used to create a InvdViewsUpdateRequest Udt Request
 *
 */

public class InvdViewsUpdateRequest extends InvdViewsSubRequestParent {
/**
 *
 * Constructor to create a  InvdViewsUpdateRequest
 * @param id Unique request name
 * @param InvdViewsUpdateIn InvdViewsObjectData for InvdViewsUpdateRequest
 *
 */
@JsonCreator
  public InvdViewsUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdViews")InvdViewsObjectData InvdViewsUpdateIn) {
    super(id, "InvdViewsUpdate");
    if (InvdViewsUpdateIn != null) {
      addInput("InvdViews", InvdViewsObjectHelper.toMap(InvdViewsUpdateIn, new HashMap(), "InvdViews").get("InvdViews"));
    }
  }

/**
 *
 * Retrieves the InvdViewsObjectData that results from the InvdViewsUpdateRequest call
 * @return InvdViewsObjectData resulting from udt call
 *
 */

  public InvdViewsObjectData getOutput() {
    return InvdViewsObjectHelper.fromMap(outputMap, "InvdViews");
  }
}
