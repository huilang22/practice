/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * VoucherDefinitionsFindRequest.java
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

import com.csgsystems.bp.data.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * Class used to create a VoucherDefinitionsFindRequest Udt Request
 *
 */

public class VoucherDefinitionsFindRequest extends VoucherDefinitionsRequest {
/**
 *
 * Constructor to create a  VoucherDefinitionsFindRequest
 * @param id Unique request name
 * @param VouFIn VoucherDefinitionsObjectFilter for VoucherDefinitionsFindRequest
 *
 */
@JsonCreator
  public VoucherDefinitionsFindRequest(@JsonProperty("RequestId") String id, @JsonProperty("VoucherDefinitions")VoucherDefinitionsObjectFilter VouFIn) {
    super(id, "VoucherDefinitionsFind");
    if (VouFIn != null) {
      Integer index =  VouFIn.getIndex();
      if (index != null) addInput("Index", index);
      addInput("VoucherDefinitions", VoucherDefinitionsObjectHelper.toMap(VouFIn, new HashMap(), "VoucherDefinitions").get("VoucherDefinitions"));
    }
  }

/**
 *
 * Retrieves the VoucherDefinitionsObjectDataList that results from the VoucherDefinitionsFindRequest call
 * @return VoucherDefinitionsObjectDataList resulting from udt call
 *
 */

  public VoucherDefinitionsObjectDataList getOutput() {
    return VoucherDefinitionsObjectHelper.fromMapList(outputMap, "VoucherDefinitionsList");
  }
}
