/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvSimVectorDeleteRequest.java
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
 * Class used to create a InvSimVectorDeleteRequest Udt Request
 *
 */

public class InvSimVectorDeleteRequest extends InvSimVectorSubRequestParent {
/**
 *
 * Constructor to create a  InvSimVectorDeleteRequest
 * @param id Unique request name
 * @param InvDeleteInData InvSimVectorBaseData for InvSimVectorDeleteRequest
 *
 */
@JsonCreator
  public InvSimVectorDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvSimVector")InvSimVectorBaseData InvDeleteInData) {
    super(id, "InvSimVectorDelete");
    if (InvDeleteInData != null) {
      addInput("InvSimVector", InvSimVectorBaseHelper.toMap(InvDeleteInData, new HashMap(), "InvSimVector").get("InvSimVector"));
    }
  }

/**
 *
 * Retrieves the InvSimVectorDeleteObjData that results from the InvSimVectorDeleteRequest call
 * @return InvSimVectorDeleteObjData resulting from udt call
 *
 */

  public InvSimVectorDeleteObjData getOutput() {
    return InvSimVectorDeleteObjHelper.fromMap(outputMap, "InvSimVector");
  }
}
