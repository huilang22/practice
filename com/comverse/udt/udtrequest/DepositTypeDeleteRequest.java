/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * DepositTypeDeleteRequest.java
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
 * Class used to create a DepositTypeDeleteRequest Udt Request
 *
 */

public class DepositTypeDeleteRequest extends DepositTypeSubRequestParent {
/**
 *
 * Constructor to create a  DepositTypeDeleteRequest
 * @param id Unique request name
 * @param DTDeleteIn DepositTypeObjectKeyData for DepositTypeDeleteRequest
 *
 */
@JsonCreator
  public DepositTypeDeleteRequest(@JsonProperty("RequestId") String id, @JsonProperty("DepositType")DepositTypeObjectKeyData DTDeleteIn) {
    super(id, "DepositTypeDelete");
    if (DTDeleteIn != null) {
      addInput("DepositType", DepositTypeObjectKeyHelper.toMap(DTDeleteIn, new HashMap(), "DepositTypeObjectKeyData").get("DepositTypeObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the DepositTypeObjectData that results from the DepositTypeDeleteRequest call
 * @return DepositTypeObjectData resulting from udt call
 *
 */

  public DepositTypeObjectData getOutput() {
    return DepositTypeObjectHelper.fromMap(outputMap, "DepositType");
  }
}
