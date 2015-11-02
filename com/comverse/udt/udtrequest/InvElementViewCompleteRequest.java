/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementViewCompleteRequest.java
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
 * Class used to create a InvElementViewCompleteRequest Udt Request
 *
 */

public class InvElementViewCompleteRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementViewCompleteRequest
 * @param id Unique request name
 * @param InvViewComplIn InvElementObjKeyData for InvElementViewCompleteRequest
 *
 */
@JsonCreator
  public InvElementViewCompleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjKeyData InvViewComplIn) {
    super(id, "InvElementViewComplete");
    if (InvViewComplIn != null) {
      addInput("InvElement", InvElementObjKeyHelper.toMap(InvViewComplIn, new HashMap(), "InvElementObjKeyData").get("InvElementObjKeyData"));
    }
  }

}
