/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupContractsCreateRequest.java
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
 * Class used to create a HqGroupContractsCreateRequest Udt Request
 *
 */

public class HqGroupContractsCreateRequest extends HqGroupContractsSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupContractsCreateRequest
 * @param id Unique request name
 * @param HQGroupContractscreateIn HqGroupContractsObjectData for HqGroupContractsCreateRequest
 *
 */
@JsonCreator
  public HqGroupContractsCreateRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupContracts")HqGroupContractsObjectData HQGroupContractscreateIn) {
    super(id, "HqGroupContractsCreate");
    if (HQGroupContractscreateIn != null) {
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(HQGroupContractscreateIn, new HashMap(), "HqGroupContracts").get("HqGroupContracts"));
    }
  }

/**
 *
 * Retrieves the HqGroupContractsObjectData that results from the HqGroupContractsCreateRequest call
 * @return HqGroupContractsObjectData resulting from udt call
 *
 */

  public HqGroupContractsObjectData getOutput() {
    return HqGroupContractsObjectHelper.fromMap(outputMap, "HqGroupContracts");
  }
}
