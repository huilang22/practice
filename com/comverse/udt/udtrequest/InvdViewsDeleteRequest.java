/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdViewsDeleteRequest.java
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
 * Class used to create a InvdViewsDeleteRequest Udt Request
 *
 */

public class InvdViewsDeleteRequest extends InvdViewsRequest {
/**
 *
 * Constructor to create a  InvdViewsDeleteRequest
 * @param id Unique request name
 * @param InvdViewsDeleteIn InvdViewsObjectKeyData for InvdViewsDeleteRequest
 *
 */
@JsonCreator
  public InvdViewsDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdViews")InvdViewsObjectKeyData InvdViewsDeleteIn) {
    super(id, "InvdViewsDelete");
    if (InvdViewsDeleteIn != null) {
      addInput("InvdViews", InvdViewsObjectKeyHelper.toMap(InvdViewsDeleteIn, new HashMap(), "InvdViewsObjectKeyData").get("InvdViewsObjectKeyData"));
    }
  }

}
