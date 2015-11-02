/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftTransactionReleaseRequest.java
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
 * Class used to create a EftTransactionReleaseRequest Udt Request
 *
 */

public class EftTransactionReleaseRequest extends EftTransactionSubRequestParent {
/**
 *
 * Constructor to create a  EftTransactionReleaseRequest
 * @param id Unique request name
 * @param eftRelIn EftTransactionObjectKeyData for EftTransactionReleaseRequest
 *
 */
@JsonCreator
  public EftTransactionReleaseRequest(@JsonProperty("RequestId") String id, @JsonProperty("EftTransaction")EftTransactionObjectKeyData eftRelIn) {
    super(id, "EftTransactionRelease");
    if (eftRelIn != null) {
      addInput("EftTransaction", EftTransactionObjectKeyHelper.toMap(eftRelIn, new HashMap(), "EftTransactionObjectKeyData").get("EftTransactionObjectKeyData"));
    }
  }

/**
 *
 * Retrieves the EftTransactionObjectData that results from the EftTransactionReleaseRequest call
 * @return EftTransactionObjectData resulting from udt call
 *
 */

  public EftTransactionObjectData getOutput() {
    return EftTransactionObjectHelper.fromMap(outputMap, "EftTransaction");
  }
}
