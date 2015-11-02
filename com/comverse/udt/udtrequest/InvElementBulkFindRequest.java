/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvElementBulkFindRequest.java
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
 * Class used to create a InvElementBulkFindRequest Udt Request
 *
 */

public class InvElementBulkFindRequest extends InvElementRequest {
/**
 *
 * Constructor to create a  InvElementBulkFindRequest
 * @param id Unique request name
 * @param InvIdBulkIn InvElementObjFilter for InvElementBulkFindRequest
 *
 */
@JsonCreator
  public InvElementBulkFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvElement")InvElementObjFilter InvIdBulkIn) {
    super(id, "InvElementBulkFind");
    if (InvIdBulkIn != null) {
      Integer index =  InvIdBulkIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvElement", InvElementObjHelper.toMap(InvIdBulkIn, new HashMap(), "InvElement").get("InvElement"));
    }
  }

/**
 *
 * Retrieves the InvElementObjDataList that results from the InvElementBulkFindRequest call
 * @return InvElementObjDataList resulting from udt call
 *
 */

  public InvElementObjDataList getOutput() {
    return InvElementObjHelper.fromMapList(outputMap, "InvElementList");
  }
}
