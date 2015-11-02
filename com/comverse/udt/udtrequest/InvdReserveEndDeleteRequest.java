/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdReserveEndDeleteRequest.java
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
 * Class used to create a InvdReserveEndDeleteRequest Udt Request
 *
 */

public class InvdReserveEndDeleteRequest extends InvdReserveEndRequest {
/**
 *
 * Constructor to create a  InvdReserveEndDeleteRequest
 * @param id Unique request name
 * @param InvdReserveEndDeleteIn InvdReserveEndObjectFilter for InvdReserveEndDeleteRequest
 *
 */
@JsonCreator
  public InvdReserveEndDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdReserveEnd")InvdReserveEndObjectFilter InvdReserveEndDeleteIn) {
    super(id, "InvdReserveEndDelete");
    if (InvdReserveEndDeleteIn != null) {
      Integer index =  InvdReserveEndDeleteIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvdReserveEnd", InvdReserveEndObjectHelper.toMap(InvdReserveEndDeleteIn, new HashMap(), "Void").get("Void"));
    }
  }

}
