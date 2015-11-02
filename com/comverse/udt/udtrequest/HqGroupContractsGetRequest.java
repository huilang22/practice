/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * HqGroupContractsGetRequest.java
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
 * Class used to create a HqGroupContractsGetRequest Udt Request
 *
 */

public class HqGroupContractsGetRequest extends HqGroupContractsSubRequestParent {
/**
 *
 * Constructor to create a  HqGroupContractsGetRequest
 * @param id Unique request name
 * @param HQGroupContractsgetIn HqGroupContractsObjectData for HqGroupContractsGetRequest
 *
 */
@JsonCreator
  public HqGroupContractsGetRequest(@JsonProperty("RequestId") String id, @JsonProperty("HqGroupContracts")HqGroupContractsObjectData HQGroupContractsgetIn) {
    super(id, "HqGroupContractsGet");
    if (HQGroupContractsgetIn != null) {
      addInput("HqGroupContracts", HqGroupContractsObjectHelper.toMap(HQGroupContractsgetIn, new HashMap(), "HqGroupContracts").get("HqGroupContracts"));
    }
  }

/**
 *
 * Retrieves the HqGroupContractsObjectData that results from the HqGroupContractsGetRequest call
 * @return HqGroupContractsObjectData resulting from udt call
 *
 */

  public HqGroupContractsObjectData getOutput() {
    return HqGroupContractsObjectHelper.fromMap(outputMap, "HqGroupContracts");
  }
}
