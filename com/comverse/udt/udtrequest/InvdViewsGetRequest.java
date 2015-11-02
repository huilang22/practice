/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdViewsGetRequest.java
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
 * Class used to create a InvdViewsGetRequest Udt Request
 *
 */

public class InvdViewsGetRequest extends InvdViewsSubRequestParent {
/**
 *
 * Constructor to create a  InvdViewsGetRequest
 * @param id Unique request name
 * @param InvdViewsGetIn InvdViewsObjectKeyData for InvdViewsGetRequest
 *
 */
@JsonCreator
  public InvdViewsGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdViews")InvdViewsObjectKeyData InvdViewsGetIn) {
    super(id, "InvdViewsGet");
    if (InvdViewsGetIn != null) {
      addInput("InvdViews", InvdViewsObjectKeyHelper.toMap(InvdViewsGetIn, new HashMap(), "InvdViewsObjectKeyData").get("InvdViewsObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the InvdViewsObjectData that results from the InvdViewsGetRequest call
 * @return InvdViewsObjectData resulting from udt call
 *
 */

  public InvdViewsObjectData getOutput() {
    return InvdViewsObjectHelper.fromMap(outputMap, "InvdViews");
  }
}
