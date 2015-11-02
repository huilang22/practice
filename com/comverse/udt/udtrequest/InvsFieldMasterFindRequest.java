/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * InvsFieldMasterFindRequest.java
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
 * Class used to create a InvsFieldMasterFindRequest Udt Request
 *
 */

public class InvsFieldMasterFindRequest extends InvsFieldMasterRequest {
/**
 *
 * Constructor to create a  InvsFieldMasterFindRequest
 * @param id Unique request name
 * @param IFMFindIn InvsFieldMasterObjectFilter for InvsFieldMasterFindRequest
 *
 */
@JsonCreator
  public InvsFieldMasterFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("InvsFieldMaster")InvsFieldMasterObjectFilter IFMFindIn) {
    super(id, "InvsFieldMasterFind");
    if (IFMFindIn != null) {
      Integer index =  IFMFindIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("InvsFieldMaster", InvsFieldMasterObjectHelper.toMap(IFMFindIn, new HashMap(), "InvsFieldMaster").get("InvsFieldMaster"));
    }
  }

/**
 *
 * Retrieves the InvsFieldMasterObjectDataList that results from the InvsFieldMasterFindRequest call
 * @return InvsFieldMasterObjectDataList resulting from udt call
 *
 */

  public InvsFieldMasterObjectDataList getOutput() {
    return InvsFieldMasterObjectHelper.fromMapList(outputMap, "InvsFieldMasterList");
  }
}
