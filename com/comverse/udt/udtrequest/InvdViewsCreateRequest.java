/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdViewsCreateRequest.java
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
 * Class used to create a InvdViewsCreateRequest Udt Request
 *
 */

public class InvdViewsCreateRequest extends InvdViewsSubRequestParent {
/**
 *
 * Constructor to create a  InvdViewsCreateRequest
 * @param id Unique request name
 * @param InvdViewsCreateIn InvdViewsObjectData for InvdViewsCreateRequest
 *
 */
@JsonCreator
  public InvdViewsCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdViews")InvdViewsObjectData InvdViewsCreateIn) {
    super(id, "InvdViewsCreate");
    if (InvdViewsCreateIn != null) {
      addInput("InvdViews", InvdViewsObjectHelper.toMap(InvdViewsCreateIn, new HashMap(), "InvdViews").get("InvdViews"));
    }
  }

/**
 *
 * Retrieves the InvdViewsObjectData that results from the InvdViewsCreateRequest call
 * @return InvdViewsObjectData resulting from udt call
 *
 */

  public InvdViewsObjectData getOutput() {
    return InvdViewsObjectHelper.fromMap(outputMap, "InvdViews");
  }
}
