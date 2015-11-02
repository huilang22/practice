/**----------------------------------------------------------------------------+
 *                       Copyright 2006 by Comverse, Inc.                      |
 *                            All Rights Reserved                              |
 *-----------------------------------------------------------------------------+
 *
 * Filename
 * ========
 * EftTransactionUpdateFromAccountRequest.java
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
 * Class used to create a EftTransactionUpdateFromAccountRequest Udt Request
 *
 */

public class EftTransactionUpdateFromAccountRequest extends EftTransactionSubRequestParent {
/**
 *
 * Constructor to create a  EftTransactionUpdateFromAccountRequest
 * @param id Unique request name
 * @param eftUpdateFAIn EftTransUFAObjectData for EftTransactionUpdateFromAccountRequest
 *
 */
@JsonCreator
  public EftTransactionUpdateFromAccountRequest(@JsonProperty("RequestId") String id, @JsonProperty("EftTransaction")EftTransUFAObjectData eftUpdateFAIn) {
    super(id, "EftTransactionUpdateFromAccount");
    if (eftUpdateFAIn != null) {
      addInput("EftTransaction", EftTransUFAObjectHelper.toMap(eftUpdateFAIn, new HashMap(), "EftTransaction").get("EftTransaction"));
    }
  }

/**
 *
 * Retrieves the EftTransactionObjectData that results from the EftTransactionUpdateFromAccountRequest call
 * @return EftTransactionObjectData resulting from udt call
 *
 */

  public EftTransactionObjectData getOutput() {
    return EftTransactionObjectHelper.fromMap(outputMap, "EftTransaction");
  }
}
