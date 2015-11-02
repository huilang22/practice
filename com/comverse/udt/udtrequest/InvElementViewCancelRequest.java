/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementViewCancelRequest.java
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
 * Class used to create a InvElementViewCancelRequest Udt Request
 *
 */

public class InvElementViewCancelRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementViewCancelRequest
 * @param id Unique request name
 * @param InvViewCancelIn InvElementObjKeyData for InvElementViewCancelRequest
 *
 */
@JsonCreator
  public InvElementViewCancelRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjKeyData InvViewCancelIn) {
    super(id, "InvElementViewCancel");
    if (InvViewCancelIn != null) {
      addInput("InvElement", InvElementObjKeyHelper.toMap(InvViewCancelIn, new HashMap(), "InvElementObjKeyData").get("InvElementObjKeyData"));
    }
  }

}
