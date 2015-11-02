/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementBulkCreateRequest.java
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
 * Class used to create a InvElementBulkCreateRequest Udt Request
 *
 */

public class InvElementBulkCreateRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementBulkCreateRequest
 * @param id Unique request name
 * @param InvElementBulkCreateIn InvElementObjData[] for InvElementBulkCreateRequest
 *
 */
@JsonCreator
  public InvElementBulkCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjData[] InvElementBulkCreateIn) {
    super(id, "InvElementBulkCreate");
    if (InvElementBulkCreateIn != null) {
      Object[] list = new Object[InvElementBulkCreateIn.length];
      for (int i = 0; i < InvElementBulkCreateIn.length; i++) {
        list[i] = InvElementObjHelper.getMap(InvElementBulkCreateIn[i], (Map) list[i]);
        if (list[i] != null) ((Map) list[i]).put ("#NAME", "InvElement");
      }
      addInput("InvElementList", list);
    }
  }

/**
 *
 * Retrieves the InvElementObjDataList that results from the InvElementBulkCreateRequest call
 * @return InvElementObjDataList resulting from udt call
 *
 */

  public InvElementObjDataList getOutput() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
}
