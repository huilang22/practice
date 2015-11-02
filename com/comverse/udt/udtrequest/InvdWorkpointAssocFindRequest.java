/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvdWorkpointAssocFindRequest.java
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
 * Class used to create a InvdWorkpointAssocFindRequest Udt Request
 *
 */

public class InvdWorkpointAssocFindRequest extends InvdWorkpointAssocRequest {
/**
 *
 * Constructor to create a  InvdWorkpointAssocFindRequest
 * @param id Unique request name
 * @param InvdWorkpointAssocFindIn InvdWorkpointAssocObjectFilter for InvdWorkpointAssocFindRequest
 *
 */
@JsonCreator
  public InvdWorkpointAssocFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvdWorkpointAssoc")InvdWorkpointAssocObjectFilter InvdWorkpointAssocFindIn) {
    super(id, "InvdWorkpointAssocFind");
    if (InvdWorkpointAssocFindIn != null) {
      Integer index =  InvdWorkpointAssocFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvdWorkpointAssoc", InvdWorkpointAssocObjectHelper.toMap(InvdWorkpointAssocFindIn, new HashMap(), "InvdWorkpointAssoc").get("InvdWorkpointAssoc"));
    }
  }

/**
 *
 * Retrieves the InvdWorkpointAssocObjectDataList that results from the InvdWorkpointAssocFindRequest call
 * @return InvdWorkpointAssocObjectDataList resulting from udt call
 *
 */

  public InvdWorkpointAssocObjectDataList getOutput() {
    return InvdWorkpointAssocObjectHelper.fromMapList(outputMap, "InvdWorkpointAssocList");
  }
}
