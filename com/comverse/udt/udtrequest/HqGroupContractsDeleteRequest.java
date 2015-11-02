/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupContractsDeleteRequest.java
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
 * Class used to create a HqGroupContractsDeleteRequest Udt Request
 *
 */

public class HqGroupContractsDeleteRequest extends HqGroupContractsSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupContractsDeleteRequest
 * @param id Unique request name
 * @param HQGroupContractsDeleteIn HqGroupContractsObjectData for HqGroupContractsDeleteRequest
 * @param ContractViewId Integer for HqGroupContractsDeleteRequest
 *
 */
@JsonCreator
  public HqGroupContractsDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupContracts")HqGroupContractsObjectData HQGroupContractsDeleteIn, @JsonProperty("ContractViewId")Integer ContractViewId) {
    super(id, "HqGroupContractsDelete");
    if (HQGroupContractsDeleteIn != null) {
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(HQGroupContractsDeleteIn, new HashMap(), "HqGroupContracts").get("HqGroupContracts"));
    }
    if (ContractViewId != null) {
      addInput("ContractViewId", ContractViewId);
    }
  }

/**
 *
 * Retrieves the HqGroupContractsObjectData that results from the HqGroupContractsDeleteRequest call
 * @return HqGroupContractsObjectData resulting from udt call
 *
 */

  public HqGroupContractsObjectData getOutput() {
    return HqGroupContractsObjectHelper.fromMap(outputMap, "HqGroupContracts");
  }
}
