/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementViewUpdateRequest.java
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
 * Class used to create a InvElementViewUpdateRequest Udt Request
 *
 */

public class InvElementViewUpdateRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementViewUpdateRequest
 * @param id Unique request name
 * @param InvViewUpdateIn InvElementObjData for InvElementViewUpdateRequest
 *
 */
@JsonCreator
  public InvElementViewUpdateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjData InvViewUpdateIn) {
    super(id, "InvElementViewUpdate");
    if (InvViewUpdateIn != null) {
      addInput("InvElement", InvElementObjHelper.toMap(InvViewUpdateIn, new HashMap(), "Void").get("Void"));
    }
  }

}
