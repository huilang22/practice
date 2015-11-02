/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementViewUpdateCheckRequest.java
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
 * Class used to create a InvElementViewUpdateCheckRequest Udt Request
 *
 */

public class InvElementViewUpdateCheckRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementViewUpdateCheckRequest
 * @param id Unique request name
 * @param InvViewUpdateCheckIn InvElementObjData for InvElementViewUpdateCheckRequest
 *
 */
@JsonCreator
  public InvElementViewUpdateCheckRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjData InvViewUpdateCheckIn) {
    super(id, "InvElementViewUpdateCheck");
    if (InvViewUpdateCheckIn != null) {
      addInput("InvElement", InvElementObjHelper.toMap(InvViewUpdateCheckIn, new HashMap(), "Void").get("Void"));
    }
  }

}
